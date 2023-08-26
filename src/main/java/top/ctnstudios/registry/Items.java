package top.ctnstudios.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static top.ctnstudios.StoneCraft.MODID;
import static top.ctnstudios.registry.Blocks.*;

import top.ctnstudios.items.CanClearBadEffects;
import top.ctnstudios.items.Foods;
import top.ctnstudios.registry.ArmorMaterials.*;
import top.ctnstudios.registry.ToolMaterials.*;

public class Items {
    public static final Item STONE_STAR = new Item(new FabricItemSettings().maxCount(64));
    public static final Item HEAD_SHARD = new Item(new FabricItemSettings().maxCount(64));
    public static final Item HEAD_DEBRIS = new Item(new FabricItemSettings().maxCount(64));
    public static final Item STONE_COIN = new Item(new FabricItemSettings().maxCount(64));
    public static final Item STONE_NUGGET = new Item(new FabricItemSettings().maxCount(64));
    public static final Item RAW_STONE_ESSENCE = new Item(new FabricItemSettings().maxCount(64));
    public static final Item STONE_ESSENCE_NUGGET = new Item(new FabricItemSettings().maxCount(64));
    public static final Item STONE_ESSENCE = new Item(new FabricItemSettings().maxCount(64));
    public static final Item ACTIVE_STONE_ESSENCE = new Item(new FabricItemSettings().maxCount(64));
    public static final Item STONE_KEY = new Item(new FabricItemSettings().maxCount(64));
    // Foods
    public static final CanClearBadEffects STONE_APPLE = new CanClearBadEffects(new FabricItemSettings().food(Foods.STONE_APPLE).maxCount(64));
    public static final Item STONE_BREAD = new Item(new FabricItemSettings().food(Foods.STONE_BREAD).maxCount(64));
    public static final Item STONE_POTATO = new Item(new FabricItemSettings().food(Foods.STONE_POTATO).maxCount(64));
    public static final Item STONE_CARROT = new Item(new FabricItemSettings().food(Foods.STONE_CARROT).maxCount(64));
    public static final Item STONE_MELON = new Item(new FabricItemSettings().food(Foods.STONE_MELON).maxCount(64));
    public static final Item STONE_KELP = new Item(new FabricItemSettings().food(Foods.STONE_KELP).maxCount(64));
    public static final CanClearBadEffects STONE_HODGEPODGE = new CanClearBadEffects(new FabricItemSettings().food(Foods.STONE_HODGEPODGE).maxCount(1));
    // Blocks
    public static final Item LV1STONE_ITEM = new BlockItem(LV1STONE, new FabricItemSettings().maxCount(64));
    public static final Item LV2STONE_ITEM = new BlockItem(LV2STONE, new FabricItemSettings().maxCount(64));
    public static final Item LV3STONE_ITEM = new BlockItem(LV3STONE, new FabricItemSettings().maxCount(64));
    public static final Item LV4STONE_ITEM = new BlockItem(LV4STONE, new FabricItemSettings().maxCount(64));
    public static final Item LV5STONE_ITEM = new BlockItem(LV5STONE, new FabricItemSettings().maxCount(64));
    // Armors
    public static final ArmorMaterial LV0_ARMOR_MATERIAL = new lv0ArmorMaterial();
    public static final Item LV0_STONE_HELMET = new ArmorItem(LV0_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item LV0_STONE_CHESTPLATE = new ArmorItem(LV0_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item LV0_STONE_LEGGINGS = new ArmorItem(LV0_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item LV0_STONE_BOOTS = new ArmorItem(LV0_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings());
    public static final ArmorMaterial LV1_ARMOR_MATERIAL = new lv1ArmorMaterial();
    public static final Item LV1_STONE_HELMET = new ArmorItem(LV1_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item LV1_STONE_CHESTPLATE = new ArmorItem(LV1_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item LV1_STONE_LEGGINGS = new ArmorItem(LV1_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item LV1_STONE_BOOTS = new ArmorItem(LV1_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings());
    public static final ArmorMaterial LV2_ARMOR_MATERIAL = new lv2ArmorMaterial();
    public static final Item LV2_STONE_HELMET = new ArmorItem(LV2_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item LV2_STONE_CHESTPLATE = new ArmorItem(LV2_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item LV2_STONE_LEGGINGS = new ArmorItem(LV2_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item LV2_STONE_BOOTS = new ArmorItem(LV2_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings());
    public static final ArmorMaterial LV3_ARMOR_MATERIAL = new lv3ArmorMaterial();
    public static final Item LV3_STONE_HELMET = new ArmorItem(LV3_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item LV3_STONE_CHESTPLATE = new ArmorItem(LV3_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item LV3_STONE_LEGGINGS = new ArmorItem(LV3_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item LV3_STONE_BOOTS = new ArmorItem(LV3_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings());
    public static final ArmorMaterial LV4_ARMOR_MATERIAL = new lv4ArmorMaterial();
    public static final Item LV4_STONE_HELMET = new ArmorItem(LV4_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item LV4_STONE_CHESTPLATE = new ArmorItem(LV4_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item LV4_STONE_LEGGINGS = new ArmorItem(LV4_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item LV4_STONE_BOOTS = new ArmorItem(LV4_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings());
    public static final ArmorMaterial LV5_ARMOR_MATERIAL = new lv5ArmorMaterial();
    public static final Item LV5_STONE_HELMET = new ArmorItem(LV5_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item LV5_STONE_CHESTPLATE = new ArmorItem(LV5_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item LV5_STONE_LEGGINGS = new ArmorItem(LV5_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item LV5_STONE_BOOTS = new ArmorItem(LV5_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings());
    // Pickaxes
    //public static ToolItem LV1_STONE_PICKAXE =new PickaxeItem(lv1ToolMaterial.INSTANCE)

    public static void init(){
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_star"), STONE_STAR);
        Registry.register(Registries.ITEM, new Identifier(MODID, "head_shard"), HEAD_SHARD);
        Registry.register(Registries.ITEM, new Identifier(MODID, "head_debris"), HEAD_DEBRIS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_key"), STONE_KEY);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_coin"), STONE_COIN);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_nugget"), STONE_NUGGET);
        Registry.register(Registries.ITEM, new Identifier(MODID, "raw_stone_essence"), RAW_STONE_ESSENCE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_essence_nugget"), STONE_ESSENCE_NUGGET);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_essence"), STONE_ESSENCE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "activated_stone_essence"), ACTIVE_STONE_ESSENCE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_apple"), STONE_APPLE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_bread"), STONE_BREAD);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_potato"), STONE_POTATO);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_carrot"), STONE_CARROT);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_melon"), STONE_MELON);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_kelp"), STONE_KELP);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_hodgepodge"), STONE_HODGEPODGE);
        // Armors
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_helmet"), LV0_STONE_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_chestplate"), LV0_STONE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_leggings"), LV0_STONE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_boots"), LV0_STONE_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv1stone_helmet"), LV1_STONE_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv1stone_chestplate"), LV1_STONE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv1stone_leggings"), LV1_STONE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv1stone_boots"), LV1_STONE_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv2stone_helmet"), LV2_STONE_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv2stone_chestplate"), LV2_STONE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv2stone_leggings"), LV2_STONE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv2stone_boots"), LV2_STONE_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv3stone_helmet"), LV3_STONE_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv3stone_chestplate"), LV3_STONE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv3stone_leggings"), LV3_STONE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv3stone_boots"), LV3_STONE_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv4stone_helmet"), LV4_STONE_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv4stone_chestplate"), LV4_STONE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv4stone_leggings"), LV4_STONE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv4stone_boots"), LV4_STONE_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv5stone_helmet"), LV5_STONE_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv5stone_chestplate"), LV5_STONE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv5stone_leggings"), LV5_STONE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv5stone_boots"), LV5_STONE_BOOTS);
        // Blocks
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv1stone"), LV1STONE_ITEM);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv2stone"), LV2STONE_ITEM);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv3stone"), LV3STONE_ITEM);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv4stone"), LV4STONE_ITEM);
        Registry.register(Registries.ITEM, new Identifier(MODID, "lv5stone"), LV5STONE_ITEM);
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_essence_ore"), new BlockItem(STONE_ESSENCE_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MODID, "deepslate_stone_essence_ore"), new BlockItem(DEEPSLATE_STONE_ESSENCE_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_conversion_table"), new BlockItem(STONE_CONVERSION_TABLE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_crafting_table"), new BlockItem(STONE_CRAFTING_TABLE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MODID, "stone_summoner"), new BlockItem(STONE_SUMMONER, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MODID, "activated_stone_summoner"), new BlockItem(ACTIVE_STONE_SUMMONER, new FabricItemSettings()));
    }
}
