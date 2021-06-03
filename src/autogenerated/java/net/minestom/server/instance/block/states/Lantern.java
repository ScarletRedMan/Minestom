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
public final class Lantern {
    public static void initStates() {
        Block.LANTERN.addBlockAlternative(new BlockAlternative((short) 14890, "hanging=true","waterlogged=true"));
        Block.LANTERN.addBlockAlternative(new BlockAlternative((short) 14891, "hanging=true","waterlogged=false"));
        Block.LANTERN.addBlockAlternative(new BlockAlternative((short) 14892, "hanging=false","waterlogged=true"));
        Block.LANTERN.addBlockAlternative(new BlockAlternative((short) 14893, "hanging=false","waterlogged=false"));
    }
}
