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
public final class Beetroots {
    public static void initStates() {
        Block.BEETROOTS.addBlockAlternative(new BlockAlternative((short) 9223, "age=0"));
        Block.BEETROOTS.addBlockAlternative(new BlockAlternative((short) 9224, "age=1"));
        Block.BEETROOTS.addBlockAlternative(new BlockAlternative((short) 9225, "age=2"));
        Block.BEETROOTS.addBlockAlternative(new BlockAlternative((short) 9226, "age=3"));
    }
}
