package top.ctnstudios.stonecraft.stonecraft.registry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static top.ctnstudios.stonecraft.stonecraft.StoneCraft.MODID;

public class Items {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final RegistryObject<Item> STONE_STAR = ITEMS.register("stone_star", () -> new Item(new Item.Settings().maxCount(64)));
    public static final RegistryObject<Item> HEAD_SHARD = ITEMS.register("head_shard", () -> new Item(new Item.Settings().maxCount(64)));
    public static final RegistryObject<Item> HEAD_DEBRIS = ITEMS.register("head_debris", () -> new Item(new Item.Settings().maxCount(64)));
    public static final RegistryObject<Item> STONE_COIN = ITEMS.register("stone_coin", () -> new Item(new Item.Settings().maxCount(64)));
    public static final RegistryObject<Item> STONE_NUGGET = ITEMS.register("stone_nugget", () -> new Item(new Item.Settings().maxCount(64)));
    public static final RegistryObject<Item> RAW_STONE_ESSENCE = ITEMS.register("raw_stone_essence", () -> new Item(new Item.Settings().maxCount(64)));
    public static final RegistryObject<Item> STONE_ESSENCE_NUGGET = ITEMS.register("stone_essence_nugget", () -> new Item(new Item.Settings().maxCount(64)));
    public static final RegistryObject<Item> STONE_ESSENCE = ITEMS.register("stone_essence", () -> new Item(new Item.Settings().maxCount(64)));
    public static final RegistryObject<Item> ACTIVE_STONE_ESSENCE = ITEMS.register("activated_stone_essence", () -> new Item(new Item.Settings().maxCount(64)));
    public static final RegistryObject<Item> STONE_KEY = ITEMS.register("stone_key", () -> new Item(new Item.Settings().maxCount(64)));
    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
