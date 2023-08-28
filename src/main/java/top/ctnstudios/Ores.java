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
    public static RegistryKey<PlacedFeature> placed(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, getResource(id));
    }
    public static Identifier getResource(String name) {
        return new Identifier(MODID, name);
    }
    public static final RegistryKey<PlacedFeature> ORE_STONE_ESSENCE = placed("stone_essence");
    public static final RegistryKey<PlacedFeature> ORE_STONE_ESSENCE_LOWER = placed("stone_essence_deep");
    public static final RegistryKey<PlacedFeature> ORE_STONE_ESSENCE_UPPER = placed("stone_essence_mountain");
    public static void init(){
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_STONE_ESSENCE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_STONE_ESSENCE_LOWER);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_STONE_ESSENCE_UPPER);
    }
}
