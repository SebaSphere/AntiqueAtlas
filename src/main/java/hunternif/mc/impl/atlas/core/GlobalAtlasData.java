package hunternif.mc.impl.atlas.core;

import net.fabricmc.fabric.api.util.NbtType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.PersistentState;

public class GlobalAtlasData extends PersistentState {
    public static final String TAG_NEXT_ID = "aaNextID";
    private int nextId = 1;

    // TODO: 1.17 | This doesn't work
    public GlobalAtlasData(String key) {
        super();
    }

    public int getNextAtlasId() {
        int id = nextId++;
        markDirty();
        return id;
    }



    @Override
    public NbtCompound writeNbt(NbtCompound compound) {
        compound.putInt(TAG_NEXT_ID, nextId);
        return compound;
    }

//
//    @Override
//    public void fromTag(CompoundTag compound) {
//        if (compound.contains(TAG_NEXT_ID, NbtType.NUMBER)) {
//            nextId = compound.getInt(TAG_NEXT_ID);
//        } else {
//            nextId = 1;
//        }
//    }
//
//    @Override
//    public CompoundTag toTag(CompoundTag var1) {
//        var1.putInt(TAG_NEXT_ID, nextId);
//        return var1;
//    }
}
