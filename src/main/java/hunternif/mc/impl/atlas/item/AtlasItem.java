package hunternif.mc.impl.atlas.item;

import hunternif.mc.impl.atlas.AntiqueAtlasMod;
import hunternif.mc.impl.atlas.AntiqueAtlasModClient;
import hunternif.mc.impl.atlas.core.AtlasData;
import hunternif.mc.impl.atlas.core.TileInfo;
import hunternif.mc.impl.atlas.marker.MarkersData;
import hunternif.mc.impl.atlas.network.packet.s2c.play.DimensionUpdateS2CPacket;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Collection;

public class AtlasItem extends Item {

    public AtlasItem(Item.Settings settings) {
        super(settings);
    }

    public static int getAtlasID(ItemStack stack) {
        return stack.getOrCreateNbt().getInt("atlasID");
    }

    @Override
    public Text getName(ItemStack stack) {
        return new TranslatableText(this.getTranslationKey(), getAtlasID(stack));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack stack = playerEntity.getStackInHand(hand);

        if (world.isClient) {
            AntiqueAtlasModClient.openAtlasGUI(stack);
        }

        return new TypedActionResult<>(ActionResult.SUCCESS, stack);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean isEquipped) {
        AtlasData data = AntiqueAtlasMod.tileData.getData(stack, world);
        if (data == null || !(entity instanceof PlayerEntity)) return;

        int atlasId = getAtlasID(stack);

        // On the first run send the map from the server to the client:
        PlayerEntity player = (PlayerEntity) entity;
        if (!world.isClient && !data.isSyncedOnPlayer(player) && !data.isEmpty()) {
            data.syncOnPlayer(atlasId, player);
        }

        // Same thing with the local markers:
        MarkersData markers = AntiqueAtlasMod.markersData.getMarkersData(stack, world);
        if (!world.isClient && !markers.isSyncedOnPlayer(player) && !markers.isEmpty()) {
            markers.syncOnPlayer(atlasId, (ServerPlayerEntity) player);
        }

        // Updating map around player
        Collection<TileInfo> newTiles = AntiqueAtlasMod.worldScanner.updateAtlasAroundPlayer(data, player);

        if (!world.isClient) {
            if (!newTiles.isEmpty()) {
                new DimensionUpdateS2CPacket(atlasId, player.getEntityWorld().getRegistryKey(), newTiles).send((ServerWorld) world);
            }
        }
    }

}
