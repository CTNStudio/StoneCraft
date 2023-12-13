package top.ctnstudios.stonecraft.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import top.ctnstudios.stonecraft.MainCommon;
import top.ctnstudios.stonecraft.ItemCleanNegative;

import static top.ctnstudios.stonecraft.MainCommon.MOD_ID;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, RegistryKeys.ITEM);

    public static final RegistrySupplier<Item> STONE_STAR = ITEMS.register("stone_star", ItemInit::getItemBase);
    public static final RegistrySupplier<Item> HEAD_SHARD = ITEMS.register("head_shard", ItemInit::getItemBase);
    public static final RegistrySupplier<Item> HEAD_DEBRIS = ITEMS.register("head_debris", ItemInit::getItemBase);
    public static final RegistrySupplier<Item> STONE_KEY = ITEMS.register("stone_key", ItemInit::getItemBase);
    public static final RegistrySupplier<Item> STONE_COIN = ITEMS.register("stone_coin", ItemInit::getItemBase);
    public static final RegistrySupplier<Item> STONE_NUGGET = ITEMS.register("stone_nugget", ItemInit::getItemBase);
    public static final RegistrySupplier<Item> RAW_STONE_ESSENCE = ITEMS.register("raw_stone_essence", ItemInit::getItemBase);
    public static final RegistrySupplier<Item> STONE_ESSENCE_NUGGET = ITEMS.register("stone_essence_nugget", ItemInit::getItemBase);
    public static final RegistrySupplier<Item> STONE_ESSENCE = ITEMS.register("stone_essence", ItemInit::getItemBase);
    public static final RegistrySupplier<Item> ACTIVE_STONE_ESSENCE = ITEMS.register("activated_stone_essence", ItemInit::getItemBase);

    public static final RegistrySupplier<Item> STONE_APPLE = ITEMS.register("stone_apple", () -> new ItemCleanNegative(4, 0.48F));
    public static final RegistrySupplier<Item> STONE_BREAD = ITEMS.register("stone_bread", () -> new ItemCleanNegative(10, 1.2f));
    public static final RegistrySupplier<Item> STONE_POTATO = ITEMS.register("stone_potato", () -> new ItemCleanNegative(10, 1.2f));
    public static final RegistrySupplier<Item> STONE_MELON = ITEMS.register("stone_melon", () -> new ItemCleanNegative(4, 0.24f, new StatusEffectInstance(StatusEffects.REGENERATION,40*20,1)));
    public static final RegistrySupplier<Item> STONE_KELP = ITEMS.register("stone_kelp", () -> new ItemCleanNegative(2, 0.12f, new StatusEffectInstance(StatusEffects.WATER_BREATHING,160*20,0)));
    public static final RegistrySupplier<Item> STONE_HODGEPODGE = ITEMS.register("stone_hodgepodge",
            () -> new ItemCleanNegative(30, 2.5f,
                    new StatusEffectInstance(StatusEffects.RESISTANCE,160*20,1),
                    new StatusEffectInstance(StatusEffects.SPEED,160*20,1),
                    new StatusEffectInstance(StatusEffects.JUMP_BOOST,160*20,1),
                    new StatusEffectInstance(StatusEffects.NIGHT_VISION,160*20,1),
                    new StatusEffectInstance(StatusEffects.REGENERATION,160*20,1),
                    new StatusEffectInstance(StatusEffects.WATER_BREATHING,160*20,1)
            ));

    public static final RegistrySupplier<Item> LV1STONE = ITEMS.register("lv1stone", () -> new BlockItem(BlockInit.LV1STONE.get(), new Item.Settings().arch$tab(MainCommon.STONE_CRAFT_TABS)));
    public static final RegistrySupplier<Item> LV2STONE = ITEMS.register("lv2stone", () -> new BlockItem(BlockInit.LV2STONE.get(), new Item.Settings().arch$tab(MainCommon.STONE_CRAFT_TABS)));
    public static final RegistrySupplier<Item> LV3STONE = ITEMS.register("lv3stone", () -> new BlockItem(BlockInit.LV3STONE.get(), new Item.Settings().arch$tab(MainCommon.STONE_CRAFT_TABS)));
    public static final RegistrySupplier<Item> LV4STONE = ITEMS.register("lv4stone", () -> new BlockItem(BlockInit.LV4STONE.get(), new Item.Settings().arch$tab(MainCommon.STONE_CRAFT_TABS)));
    public static final RegistrySupplier<Item> LV5STONE = ITEMS.register("lv5stone", () -> new BlockItem(BlockInit.LV5STONE.get(), new Item.Settings().arch$tab(MainCommon.STONE_CRAFT_TABS)));

    private static Item getItemBase() {
        return new Item(new Item.Settings().arch$tab(MainCommon.STONE_CRAFT_TABS));
    }
}
