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
public final class BubbleCoralFan {
    public static void initStates() {
        Block.BUBBLE_CORAL_FAN.addBlockAlternative(new BlockAlternative((short) 9558, "waterlogged=true"));
        Block.BUBBLE_CORAL_FAN.addBlockAlternative(new BlockAlternative((short) 9559, "waterlogged=false"));
    }
}
