package top.ctnstudios.stonecraft.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.AbstractBlock;

import static top.ctnstudios.stonecraft.MainCommon.MOD_ID;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, RegistryKeys.BLOCK);

    public static final RegistrySupplier<Block> LV1STONE = BLOCKS.register("lv1stone", () -> BlockInit.getBlockByLV(1));
    public static final RegistrySupplier<Block> LV2STONE = BLOCKS.register("lv2stone", () -> BlockInit.getBlockByLV(2));
    public static final RegistrySupplier<Block> LV3STONE = BLOCKS.register("lv3stone", () -> BlockInit.getBlockByLV(3));
    public static final RegistrySupplier<Block> LV4STONE = BLOCKS.register("lv4stone", () -> BlockInit.getBlockByLV(4));
    public static final RegistrySupplier<Block> LV5STONE = BLOCKS.register("lv5stone", () -> BlockInit.getBlockByLV(5));

    private static Block getBlockByLV(int lv) {
        return new Block(AbstractBlock.Settings.copy(Blocks.COBBLESTONE).strength(0.4f * lv, 1.2f * lv));
    }
}
