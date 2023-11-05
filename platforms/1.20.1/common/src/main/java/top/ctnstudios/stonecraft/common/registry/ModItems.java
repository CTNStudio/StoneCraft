package top.ctnstudios.stonecraft.common.registry;

import com.teamresourceful.resourcefullib.common.item.tabs.ResourcefulCreativeTab;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import top.ctnstudios.stonecraft.StoneCraft;
import top.ctnstudios.stonecraft.api.CanClearBadEffects;
import top.ctnstudios.stonecraft.common.item.ToolMaterials.*;
import top.ctnstudios.stonecraft.common.item.tools.AxeItem;
import top.ctnstudios.stonecraft.common.item.tools.HoeItem;
import top.ctnstudios.stonecraft.common.item.tools.PickaxeItem;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class ModItems {
    public static final ResourcefulRegistry<Item> ITEMS = ResourcefulRegistries.create(Registries.ITEM, StoneCraft.MODID);

    public static final RegistryEntry<Item> STONE_STAR = ITEMS.register("stone_star",
        () -> new Item(new Item.Settings()
            .maxCount(64)));
    public static final RegistryEntry<Item> HEAD_SHARD = ITEMS.register("head_shard",
        () -> new Item(new Item.Settings()
            .maxCount(64)));
    public static final RegistryEntry<Item> HEAD_DEBRIS = ITEMS.register("head_debris",
        () -> new Item(new Item.Settings()
            .maxCount(64)));
    public static final RegistryEntry<Item> STONE_KEY = ITEMS.register("stone_key",
        () -> new Item(new Item.Settings()
            .maxCount(64)));
    public static final RegistryEntry<Item> STONE_COIN = ITEMS.register("stone_coin",
        () -> new Item(new Item.Settings()
            .maxCount(64)));
    public static final RegistryEntry<Item> STONE_NUGGET = ITEMS.register("stone_nugget",
        () -> new Item(new Item.Settings()
            .maxCount(64)));
    public static final RegistryEntry<Item> RAW_STONE_ESSENCE = ITEMS.register("raw_stone_essence",
        () -> new Item(new Item.Settings()
            .maxCount(64)));
    public static final RegistryEntry<Item> STONE_ESSENCE_NUGGET = ITEMS.register("stone_essence_nugget",
        () -> new Item(new Item.Settings()
            .maxCount(64)));
    public static final RegistryEntry<Item> STONE_ESSENCE = ITEMS.register("stone_essence",
        () -> new Item(new Item.Settings()
            .maxCount(64)));
    public static final RegistryEntry<Item> ACTIVE_STONE_ESSENCE = ITEMS.register("activated_stone_essence",
        () -> new Item(new Item.Settings()
            .maxCount(64)));
    public static final RegistryEntry<CanClearBadEffects> STONE_APPLE = ITEMS.register("stone_apple",
        () -> new CanClearBadEffects(new Item.Settings().food(new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(4.8F)
            .alwaysEdible()
            .build())
            .maxCount(64)));
    public static final RegistryEntry<Item> STONE_BREAD = ITEMS.register("stone_bread",
        () -> new Item(new Item.Settings().food(new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(12.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,80*20,1),1)
            .alwaysEdible()
            .build())
            .maxCount(64)));
    public static final RegistryEntry<Item> STONE_POTATO = ITEMS.register("stone_potato",
        () -> new Item(new Item.Settings().food(new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,80*20,0),1)
            .alwaysEdible()
            .build())
            .maxCount(64)));
    public static final RegistryEntry<Item> STONE_CARROT = ITEMS.register("stone_carrot",
        () -> new Item(new Item.Settings().food(new FoodComponent.Builder()
            .hunger(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,40*20,0),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,40*20,0),1)
            .alwaysEdible()
            .build())
            .maxCount(64)));
    public static final RegistryEntry<Item> STONE_MELON = ITEMS.register("stone_melon",
        () -> new Item(new Item.Settings().food(new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(2.4F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,40*20,1),1)
            .alwaysEdible()
            .build())
            .maxCount(64)));
    public static final RegistryEntry<Item> STONE_KELP = ITEMS.register("stone_kelp",
        () -> new Item(new Item.Settings().food(new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,160*20,0),1)
            .alwaysEdible()
            .snack()
            .build())
            .maxCount(64)));
    public static final RegistryEntry<CanClearBadEffects> STONE_HODGEPODGE = ITEMS.register("stone_hodgepodge",
        () -> new CanClearBadEffects(new Item.Settings().food(new FoodComponent.Builder()
            .hunger(30)
            .saturationModifier(25.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,160*20,1),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,160*20,1),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,160*20,1),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,160*20,1),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,160*20,1),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,160*20,1),1)
            .alwaysEdible()
            .build())
            .maxCount(1)));
    // Blocks
    public static final RegistryEntry<Item> LV1STONE = ITEMS.register("lv1stone", () -> new BlockItem(
        ModBlocks.LV1STONE.get(),
        new Item.Settings())
    );
    public static final RegistryEntry<Item> LV2STONE = ITEMS.register("lv2stone", () -> new BlockItem(
        ModBlocks.LV2STONE.get(),
        new Item.Settings())
    );
    public static final RegistryEntry<Item> LV3STONE = ITEMS.register("lv3stone", () -> new BlockItem(
        ModBlocks.LV3STONE.get(),
        new Item.Settings())
    );
    public static final RegistryEntry<Item> LV4STONE = ITEMS.register("lv4stone", () -> new BlockItem(
        ModBlocks.LV4STONE.get(),
        new Item.Settings())
    );
    public static final RegistryEntry<Item> LV5STONE = ITEMS.register("lv5stone", () -> new BlockItem(
        ModBlocks.LV5STONE.get(),
        new Item.Settings())
    );
    public static final RegistryEntry<Item> STONE_ESSENCE_ORE = ITEMS.register("stone_essence_ore", () -> new BlockItem(
        ModBlocks.STONE_ESSENCE_ORE.get(),
        new Item.Settings())
    );
    public static final RegistryEntry<Item> DEEPSLATE_STONE_ESSENCE_ORE = ITEMS.register("deepslate_stone_essence_ore", () -> new BlockItem(
        ModBlocks.DEEPSLATE_STONE_ESSENCE_ORE.get(),
        new Item.Settings())
    );
    public static final RegistryEntry<Item> STONE_CONVERT_TABLE = ITEMS.register("stone_convert_table", () -> new BlockItem(
        ModBlocks.STONE_CONVERT_TABLE.get(),
        new Item.Settings())
    );
    public static final RegistryEntry<Item> STONE_CRAFTING_TABLE = ITEMS.register("stone_crafting_table", () -> new BlockItem(
        ModBlocks.STONE_CRAFTING_TABLE.get(),
        new Item.Settings())
    );
    public static final RegistryEntry<Item> STONE_SUMMONER = ITEMS.register("stone_summoner", () -> new BlockItem(
        ModBlocks.STONE_SUMMONER.get(),
        new Item.Settings())
    );
    public static final RegistryEntry<Item> ACTIVE_STONE_SUMMONER = ITEMS.register("activated_stone_summoner", () -> new BlockItem(
        ModBlocks.ACTIVE_STONE_SUMMONER.get(),
        new Item.Settings())
    );

    public static final RegistryEntry<Item> LV1_STONE_SHOVEL = ITEMS.register("lv1stone_shovel", () -> new ShovelItem(
        lv1ToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV2_STONE_SHOVEL = ITEMS.register("lv2stone_shovel", () -> new ShovelItem(
        lv2ToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV3_STONE_SHOVEL = ITEMS.register("lv3stone_shovel", () -> new ShovelItem(
        lv3ToolMaterial.INSTANCE, 1.5F, -3.5F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV4_STONE_SHOVEL = ITEMS.register("lv4stone_shovel", () -> new ShovelItem(
        lv4ToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV5_STONE_SHOVEL = ITEMS.register("lv5stone_shovel", () -> new ShovelItem(
        lv5ToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV1_STONE_SWORD = ITEMS.register("lv1stone_sword", () -> new SwordItem(
        lv1ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV2_STONE_SWORD = ITEMS.register("lv2stone_sword", () -> new SwordItem(
        lv2ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV3_STONE_SWORD = ITEMS.register("lv3stone_sword", () -> new SwordItem(
        lv3ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV4_STONE_SWORD = ITEMS.register("lv4stone_sword", () -> new SwordItem(
        lv4ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV5_STONE_SWORD = ITEMS.register("lv5stone_sword", () -> new SwordItem(
        lv5ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV1_STONE_PICKAXE = ITEMS.register("lv1stone_pickaxe", () -> new PickaxeItem(
        lv1ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV2_STONE_PICKAXE = ITEMS.register("lv2stone_pickaxe", () -> new PickaxeItem(
        lv2ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV3_STONE_PICKAXE = ITEMS.register("lv3stone_pickaxe", () -> new PickaxeItem(
        lv3ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV4_STONE_PICKAXE = ITEMS.register("lv4stone_pickaxe", () -> new PickaxeItem(
        lv4ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV5_STONE_PICKAXE = ITEMS.register("lv5stone_pickaxe", () -> new PickaxeItem(
        lv5ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV1_STONE_AXE = ITEMS.register("lv1stone_axe", () -> new AxeItem(
        lv1ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV2_STONE_AXE = ITEMS.register("lv2stone_axe", () -> new AxeItem(
        lv2ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV3_STONE_AXE = ITEMS.register("lv3stone_axe", () -> new AxeItem(
        lv3ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV4_STONE_AXE = ITEMS.register("lv4stone_axe", () -> new AxeItem(
        lv4ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV5_STONE_AXE = ITEMS.register("lv5stone_axe", () -> new AxeItem(
        lv5ToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV1_STONE_HOE = ITEMS.register("lv1stone_hoe", () -> new HoeItem(
        lv1ToolMaterial.INSTANCE, -1, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV2_STONE_HOE = ITEMS.register("lv2stone_hoe", () -> new HoeItem(
        lv2ToolMaterial.INSTANCE, -1, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV3_STONE_HOE = ITEMS.register("lv3stone_hoe", () -> new HoeItem(
        lv3ToolMaterial.INSTANCE, -2, -2.4F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV4_STONE_HOE = ITEMS.register("lv4stone_hoe", () -> new HoeItem(
        lv4ToolMaterial.INSTANCE, -5, 0.0F, new Item.Settings())
    );
    public static final RegistryEntry<Item> LV5_STONE_HOE = ITEMS.register("lv5stone_hoe", () -> new HoeItem(
        lv5ToolMaterial.INSTANCE, -5, 0.0F, new Item.Settings())
    );
    public static final Supplier<ItemGroup> TABS = new ResourcefulCreativeTab(new Identifier(StoneCraft.MODID, "main"))
        .setItemIcon(STONE_STAR)
        .addRegistry(ITEMS)
        .build();
}
