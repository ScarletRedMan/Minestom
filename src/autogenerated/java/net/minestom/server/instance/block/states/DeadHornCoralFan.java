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
public final class DeadHornCoralFan {
    public static void initStates() {
        Block.DEAD_HORN_CORAL_FAN.addBlockAlternative(new BlockAlternative((short) 9552, "waterlogged=true"));
        Block.DEAD_HORN_CORAL_FAN.addBlockAlternative(new BlockAlternative((short) 9553, "waterlogged=false"));
    }
}
