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
public final class PolishedGraniteSlab {
    public static void initStates() {
        Block.POLISHED_GRANITE_SLAB.addBlockAlternative(new BlockAlternative((short) 10793, "type=top","waterlogged=true"));
        Block.POLISHED_GRANITE_SLAB.addBlockAlternative(new BlockAlternative((short) 10794, "type=top","waterlogged=false"));
        Block.POLISHED_GRANITE_SLAB.addBlockAlternative(new BlockAlternative((short) 10795, "type=bottom","waterlogged=true"));
        Block.POLISHED_GRANITE_SLAB.addBlockAlternative(new BlockAlternative((short) 10796, "type=bottom","waterlogged=false"));
        Block.POLISHED_GRANITE_SLAB.addBlockAlternative(new BlockAlternative((short) 10797, "type=double","waterlogged=true"));
        Block.POLISHED_GRANITE_SLAB.addBlockAlternative(new BlockAlternative((short) 10798, "type=double","waterlogged=false"));
    }
}
