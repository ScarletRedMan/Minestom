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
public final class Furnace {
    public static void initStates() {
        Block.FURNACE.addBlockAlternative(new BlockAlternative((short) 3373, "facing=north","lit=true"));
        Block.FURNACE.addBlockAlternative(new BlockAlternative((short) 3374, "facing=north","lit=false"));
        Block.FURNACE.addBlockAlternative(new BlockAlternative((short) 3375, "facing=south","lit=true"));
        Block.FURNACE.addBlockAlternative(new BlockAlternative((short) 3376, "facing=south","lit=false"));
        Block.FURNACE.addBlockAlternative(new BlockAlternative((short) 3377, "facing=west","lit=true"));
        Block.FURNACE.addBlockAlternative(new BlockAlternative((short) 3378, "facing=west","lit=false"));
        Block.FURNACE.addBlockAlternative(new BlockAlternative((short) 3379, "facing=east","lit=true"));
        Block.FURNACE.addBlockAlternative(new BlockAlternative((short) 3380, "facing=east","lit=false"));
    }
}
