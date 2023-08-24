package top.ctnstudios.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static top.ctnstudios.StoneCraft.LOGGER;
import static top.ctnstudios.StoneCraft.MODID;
import static top.ctnstudios.registry.Blocks.*;
import static top.ctnstudios.registry.Items.*;

public class ItemGroups {
    public static final ItemGroup StoneCraftTab = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MODID, "stonecraft"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.stonecraft"))
                    .icon(()-> new ItemStack(STONE_STAR))
                    .entries((displayContext, entries) -> {
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
                        entries.add(STONE_CONVERSION_TABLE);
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
                    }).build());
    public static void init(){
        LOGGER.info("Registering Item Group for " + MODID);
    }
}
