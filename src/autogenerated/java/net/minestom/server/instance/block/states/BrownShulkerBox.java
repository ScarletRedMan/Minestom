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
public final class BrownShulkerBox {
    public static void initStates() {
        Block.BROWN_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9354, "facing=north"));
        Block.BROWN_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9355, "facing=east"));
        Block.BROWN_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9356, "facing=south"));
        Block.BROWN_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9357, "facing=west"));
        Block.BROWN_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9358, "facing=up"));
        Block.BROWN_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9359, "facing=down"));
    }
}
