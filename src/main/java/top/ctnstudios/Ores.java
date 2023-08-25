package top.ctnstudios;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

import static top.ctnstudios.StoneCraft.MODID;

public class Ores {
    public static final RegistryKey<PlacedFeature> ORE_STONE_ESSENCE = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MODID,"stone_essence"));
    public static final RegistryKey<PlacedFeature> ORE_STONE_ESSENCE_LOWER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MODID,"stone_essence_deep"));
    public static final RegistryKey<PlacedFeature> ORE_STONE_ESSENCE_UPPER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MODID,"stone_essence_mountain"));
    public static void init(){
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_STONE_ESSENCE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_STONE_ESSENCE_LOWER);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_STONE_ESSENCE_UPPER);
        StoneCraft.LOGGER.info("Ores placed.");
    }
}
