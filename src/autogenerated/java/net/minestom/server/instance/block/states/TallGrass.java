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
public final class TallGrass {
    public static void initStates() {
        Block.TALL_GRASS.addBlockAlternative(new BlockAlternative((short) 7897, "half=upper"));
        Block.TALL_GRASS.addBlockAlternative(new BlockAlternative((short) 7898, "half=lower"));
    }
}
