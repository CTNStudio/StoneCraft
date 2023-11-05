package top.ctnstudios.stonecraft.common.registry;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;

import top.ctnstudios.stonecraft.StoneCraft;

@SuppressWarnings("unused")
public class ModBlocks {
    public static final ResourcefulRegistry<Block> BLOCKS = ResourcefulRegistries.create(Registries.BLOCK, StoneCraft.MODID);
    public static final RegistryEntry<Block> LV1STONE = BLOCKS.register("lv1stone",
        () -> new Block(AbstractBlock.Settings
            .create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(Instrument.BASEDRUM)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .strength(4.0f,12.0f)));
    public static final RegistryEntry<Block> LV2STONE = BLOCKS.register("lv2stone",
        () -> new Block(AbstractBlock.Settings
            .create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(Instrument.BASEDRUM)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .strength(8.0f,24.0f)));
    public static final RegistryEntry<Block> LV3STONE = BLOCKS.register("lv3stone",
        () -> new Block(AbstractBlock.Settings
            .create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(Instrument.BASEDRUM)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .strength(16.0f,48.0f)));
    public static final RegistryEntry<Block> LV4STONE = BLOCKS.register("lv4stone",
        () -> new Block(AbstractBlock.Settings
            .create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(Instrument.BASEDRUM)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .strength(32.0f,96.0f)));
    public static final RegistryEntry<Block> LV5STONE = BLOCKS.register("lv5stone",
        () -> new Block(AbstractBlock.Settings
            .create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(Instrument.BASEDRUM)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .strength(64.0f,192.0f)));
    public static final RegistryEntry<Block> STONE_ESSENCE_ORE = BLOCKS.register("stone_essence_ore",
        () -> new Block(AbstractBlock.Settings
            .create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(Instrument.BASEDRUM)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .strength(3.0f,3.0f)));
    public static final RegistryEntry<Block> DEEPSLATE_STONE_ESSENCE_ORE = BLOCKS.register("deepslate_stone_essence_ore",
        () -> new Block(AbstractBlock.Settings
            .create()
            .mapColor(MapColor.DEEPSLATE_GRAY)
            .sounds(BlockSoundGroup.DEEPSLATE)
            .requiresTool()
            .strength(4.5f,3.0f)));
    public static final RegistryEntry<Block> STONE_CONVERT_TABLE = BLOCKS.register("stone_convert_table",
        () -> new Block(AbstractBlock.Settings
            .create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(Instrument.BASEDRUM)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .strength(2.0f,6.0f)));
    public static final RegistryEntry<Block> STONE_CRAFTING_TABLE = BLOCKS.register("stone_crafting_table",
        () -> new Block(AbstractBlock.Settings
            .create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(Instrument.BASEDRUM)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .strength(2.0f,6.0f)));
    public static final RegistryEntry<Block> STONE_SUMMONER = BLOCKS.register("stone_summoner",
        () -> new Block(AbstractBlock.Settings
            .create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(Instrument.BASEDRUM)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .luminance(state -> 5)
            .strength(-1.0f,3600000.0f)));
    public static final RegistryEntry<Block> ACTIVE_STONE_SUMMONER = BLOCKS.register("activated_stone_summoner",
        () -> new Block(AbstractBlock.Settings
            .create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(Instrument.BASEDRUM)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .luminance(state -> 3)
            .strength(2.0f,6.0f)));
}
