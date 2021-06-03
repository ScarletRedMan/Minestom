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
public final class Loom {
    public static void initStates() {
        Block.LOOM.addBlockAlternative(new BlockAlternative((short) 14791, "facing=north"));
        Block.LOOM.addBlockAlternative(new BlockAlternative((short) 14792, "facing=south"));
        Block.LOOM.addBlockAlternative(new BlockAlternative((short) 14793, "facing=west"));
        Block.LOOM.addBlockAlternative(new BlockAlternative((short) 14794, "facing=east"));
    }
}
