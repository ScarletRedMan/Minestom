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
public final class SoulWallTorch {
    public static void initStates() {
        Block.SOUL_WALL_TORCH.addBlockAlternative(new BlockAlternative((short) 4009, "facing=north"));
        Block.SOUL_WALL_TORCH.addBlockAlternative(new BlockAlternative((short) 4010, "facing=south"));
        Block.SOUL_WALL_TORCH.addBlockAlternative(new BlockAlternative((short) 4011, "facing=west"));
        Block.SOUL_WALL_TORCH.addBlockAlternative(new BlockAlternative((short) 4012, "facing=east"));
    }
}
