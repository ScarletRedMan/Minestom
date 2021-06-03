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
public final class LightBlueGlazedTerracotta {
    public static void initStates() {
        Block.LIGHT_BLUE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9390, "facing=north"));
        Block.LIGHT_BLUE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9391, "facing=south"));
        Block.LIGHT_BLUE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9392, "facing=west"));
        Block.LIGHT_BLUE_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 9393, "facing=east"));
    }
}
