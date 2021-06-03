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
public final class PolishedBlackstonePressurePlate {
    public static void initStates() {
        Block.POLISHED_BLACKSTONE_PRESSURE_PLATE.addBlockAlternative(new BlockAlternative((short) 16759, "powered=true"));
        Block.POLISHED_BLACKSTONE_PRESSURE_PLATE.addBlockAlternative(new BlockAlternative((short) 16760, "powered=false"));
    }
}
