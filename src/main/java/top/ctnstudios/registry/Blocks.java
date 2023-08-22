package top.ctnstudios.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static top.ctnstudios.StoneCraft.MODID;

public class Blocks {
    public static final Block LV1STONE  = new Block(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).requiresTool().strength(4.0f,12.0f));
    public static final Block LV2STONE  = new Block(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).requiresTool().strength(8.0f,24.0f));
    public static final Block LV3STONE  = new Block(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).requiresTool().strength(16.0f,48.0f));
    public static final Block LV4STONE  = new Block(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).requiresTool().strength(32.0f,96.0f));
    public static final Block LV5STONE  = new Block(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).requiresTool().strength(64.0f,192.0f));
    public static final Block STONE_ESSENCE_ORE  = new Block(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f,3.0f));
    public static final Block DEEPSLATE_STONE_ESSENCE_ORE  = new Block(FabricBlockSettings.create().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE).requiresTool().strength(4.5f,3.0f));
    public static final Block STONE_CONVERSION_TABLE  = new CraftingTableBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f,6.0f));
    public static final Block STONE_CRAFTING_TABLE  = new CraftingTableBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f,6.0f));
    public static final Block STONE_SUMMONER  = new Block(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).requiresTool().strength(-1.0f,3600000.0f));
    public static final Block ACTIVE_STONE_SUMMONER  = new Block(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f,6.0f));
    public static void init(){
        Registry.register(Registries.BLOCK, new Identifier(MODID, "lv1stone"), LV1STONE);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "lv2stone"), LV2STONE);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "lv3stone"), LV3STONE);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "lv4stone"), LV4STONE);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "lv5stone"), LV5STONE);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "stone_essence_ore"), STONE_ESSENCE_ORE);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "deepslate_stone_essence_ore"), DEEPSLATE_STONE_ESSENCE_ORE);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "stone_conversion_table"), STONE_CONVERSION_TABLE);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "stone_crafting_table"), STONE_CRAFTING_TABLE);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "stone_summoner"), STONE_SUMMONER);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "activated_stone_summoner"), ACTIVE_STONE_SUMMONER);
    }
}
