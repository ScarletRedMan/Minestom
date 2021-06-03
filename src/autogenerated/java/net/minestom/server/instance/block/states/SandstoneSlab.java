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
public final class SandstoneSlab {
    public static void initStates() {
        Block.SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 8352, "type=top","waterlogged=true"));
        Block.SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 8353, "type=top","waterlogged=false"));
        Block.SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 8354, "type=bottom","waterlogged=true"));
        Block.SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 8355, "type=bottom","waterlogged=false"));
        Block.SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 8356, "type=double","waterlogged=true"));
        Block.SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 8357, "type=double","waterlogged=false"));
    }
}
