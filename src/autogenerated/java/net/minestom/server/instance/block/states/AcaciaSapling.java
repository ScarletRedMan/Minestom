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
public final class AcaciaSapling {
    public static void initStates() {
        Block.ACACIA_SAPLING.addBlockAlternative(new BlockAlternative((short) 29, "stage=0"));
        Block.ACACIA_SAPLING.addBlockAlternative(new BlockAlternative((short) 30, "stage=1"));
    }
}
