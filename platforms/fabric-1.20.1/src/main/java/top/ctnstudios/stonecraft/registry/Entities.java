package top.ctnstudios.stonecraft.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import top.ctnstudios.stonecraft.entities.StoneElderEntity;
import top.ctnstudios.stonecraft.StoneCraft;

public class Entities {
    public static final EntityType<StoneElderEntity> STONE_ELDER = Registry.register(
        Registries.ENTITY_TYPE,
        new Identifier(StoneCraft.MODID, "stone_elder"),
        FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, StoneElderEntity::new).dimensions(EntityDimensions.fixed(1f, 1f)).build()
    );
    public static void init(){
        FabricDefaultAttributeRegistry.register(STONE_ELDER, StoneElderEntity.createMobAttributes());
    }
}
