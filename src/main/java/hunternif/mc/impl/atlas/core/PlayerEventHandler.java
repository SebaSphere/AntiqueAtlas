package hunternif.mc.impl.atlas.core;

import hunternif.mc.impl.atlas.AntiqueAtlasMod;
import hunternif.mc.impl.atlas.marker.MarkersData;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;

public class PlayerEventHandler {
    // TODO:
    //  1.17 | THESE METHODS MAKE YOU CRASH ON LOGIN. Some error about invalid data so I'd
    //  imagine look into the other methods
    public static void onPlayerLogin(ServerPlayerEntity player) {
//        World world = player.world;
//        int atlasID = player.getUuid().hashCode();
//
//        AtlasData data = AntiqueAtlasMod.tileData.getData(atlasID, world);
//        // On the player join send the map from the server to the client:
//        if (!data.isEmpty()) {
//            data.syncOnPlayer(atlasID, player);
//        }
//
//        // Same thing with the local markers:
//        MarkersData markers = AntiqueAtlasMod.markersData.getMarkersData(atlasID, world);
//        if (!markers.isEmpty()) {
//            markers.syncOnPlayer(atlasID, player);
//        }
    }

    public static void onPlayerTick(PlayerEntity player) {
//        AtlasData data = AntiqueAtlasMod.tileData.getData(
//                player.getUuid().hashCode(), player.world);
//
//        AntiqueAtlasMod.worldScanner.updateAtlasAroundPlayer(data, player);
    }
}
