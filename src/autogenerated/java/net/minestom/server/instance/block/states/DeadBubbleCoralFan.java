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
public final class DeadBubbleCoralFan {
    public static void initStates() {
        Block.DEAD_BUBBLE_CORAL_FAN.addBlockAlternative(new BlockAlternative((short) 9548, "waterlogged=true"));
        Block.DEAD_BUBBLE_CORAL_FAN.addBlockAlternative(new BlockAlternative((short) 9549, "waterlogged=false"));
    }
}
