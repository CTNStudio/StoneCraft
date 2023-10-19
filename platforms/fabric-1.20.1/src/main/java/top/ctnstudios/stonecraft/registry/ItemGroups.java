package top.ctnstudios.stonecraft.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static top.ctnstudios.stonecraft.StoneCraft.MODID;
import static top.ctnstudios.stonecraft.registry.Blocks.*;
import static top.ctnstudios.stonecraft.registry.Items.*;

public class ItemGroups {
    private static final ItemGroup STONE_CRAFT_TAB = FabricItemGroup.builder()
        .icon(() -> new ItemStack(STONE_STAR))
        .displayName(Text.translatable("itemGroup.stonecraft"))
        .entries((context, entries) -> {
            entries.add(STONE_STAR);
            entries.add(HEAD_SHARD);
            entries.add(HEAD_DEBRIS);
            entries.add(STONE_KEY);
            entries.add(STONE_COIN);
            entries.add(STONE_NUGGET);
            entries.add(RAW_STONE_ESSENCE);
            entries.add(STONE_ESSENCE_NUGGET);
            entries.add(STONE_ESSENCE);
            entries.add(ACTIVE_STONE_ESSENCE);
            entries.add(STONE_APPLE);
            entries.add(STONE_BREAD);
            entries.add(STONE_POTATO);
            entries.add(STONE_CARROT);
            entries.add(STONE_MELON);
            entries.add(STONE_KELP);
            entries.add(STONE_HODGEPODGE);
            entries.add(LV1STONE);
            entries.add(LV2STONE);
            entries.add(LV3STONE);
            entries.add(LV4STONE);
            entries.add(LV5STONE);
            entries.add(STONE_ESSENCE_ORE);
            entries.add(DEEPSLATE_STONE_ESSENCE_ORE);
            entries.add(STONE_CONVERT_TABLE);
            entries.add(STONE_CRAFTING_TABLE);
            entries.add(STONE_SUMMONER);
            entries.add(ACTIVE_STONE_SUMMONER);
            entries.add(LV0_STONE_HELMET);
            entries.add(LV0_STONE_CHESTPLATE);
            entries.add(LV0_STONE_LEGGINGS);
            entries.add(LV0_STONE_BOOTS);
            entries.add(LV1_STONE_HELMET);
            entries.add(LV1_STONE_CHESTPLATE);
            entries.add(LV1_STONE_LEGGINGS);
            entries.add(LV1_STONE_BOOTS);
            entries.add(LV2_STONE_HELMET);
            entries.add(LV2_STONE_CHESTPLATE);
            entries.add(LV2_STONE_LEGGINGS);
            entries.add(LV2_STONE_BOOTS);
            entries.add(LV3_STONE_HELMET);
            entries.add(LV3_STONE_CHESTPLATE);
            entries.add(LV3_STONE_LEGGINGS);
            entries.add(LV3_STONE_BOOTS);
            entries.add(LV4_STONE_HELMET);
            entries.add(LV4_STONE_CHESTPLATE);
            entries.add(LV4_STONE_LEGGINGS);
            entries.add(LV4_STONE_BOOTS);
            entries.add(LV5_STONE_HELMET);
            entries.add(LV5_STONE_CHESTPLATE);
            entries.add(LV5_STONE_LEGGINGS);
            entries.add(LV5_STONE_BOOTS);
            entries.add(LV1_STONE_PICKAXE);
            entries.add(LV2_STONE_PICKAXE);
            entries.add(LV3_STONE_PICKAXE);
            entries.add(LV4_STONE_PICKAXE);
            entries.add(LV5_STONE_PICKAXE);
            entries.add(STONE_ELDER_SPAWN_EGG);
        })
        .build();
    public static void init(){
        Registry.register(Registries.ITEM_GROUP, new Identifier(MODID, "stone_craft_tab"), STONE_CRAFT_TAB);
    }
}
