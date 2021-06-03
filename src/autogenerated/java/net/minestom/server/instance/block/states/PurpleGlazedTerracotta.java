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
public final class PurpleGlazedTerracotta {
    public static void initStates() {
        Block.PURPLE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9418, "facing=north"));
        Block.PURPLE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9419, "facing=south"));
        Block.PURPLE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9420, "facing=west"));
        Block.PURPLE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9421, "facing=east"));
    }
}
