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
public final class WarpedWallSign {
    public static void initStates() {
        Block.WARPED_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 15735, "facing=north","waterlogged=true"));
        Block.WARPED_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 15736, "facing=north","waterlogged=false"));
        Block.WARPED_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 15737, "facing=south","waterlogged=true"));
        Block.WARPED_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 15738, "facing=south","waterlogged=false"));
        Block.WARPED_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 15739, "facing=west","waterlogged=true"));
        Block.WARPED_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 15740, "facing=west","waterlogged=false"));
        Block.WARPED_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 15741, "facing=east","waterlogged=true"));
        Block.WARPED_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 15742, "facing=east","waterlogged=false"));
    }
}
