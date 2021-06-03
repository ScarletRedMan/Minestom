package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockAlternative;

/**
 * AUTOGENERATED by BlockGenerator
 */
@Deprecated(
        since = "forever",
        forRemoval = false
)
public final class StoneBrickSlab {
    public static void initStates() {
        Block.STONE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 8382, "type=top","waterlogged=true"));
        Block.STONE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 8383, "type=top","waterlogged=false"));
        Block.STONE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 8384, "type=bottom","waterlogged=true"));
        Block.STONE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 8385, "type=bottom","waterlogged=false"));
        Block.STONE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 8386, "type=double","waterlogged=true"));
        Block.STONE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 8387, "type=double","waterlogged=false"));
    }
}
