package top.ctnstudios.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static top.ctnstudios.StoneCraft.MODID;

import top.ctnstudios.entities.StoneElderEntity;

public class Entities {
    public static final EntityType<StoneElderEntity> STONE_ELDER = Registry.register(
        Registries.ENTITY_TYPE,
        new Identifier(MODID, "stone_elder"),
        FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, StoneElderEntity::new).dimensions(EntityDimensions.fixed(1f, 1f)).build()
    );
    public static void init(){
        FabricDefaultAttributeRegistry.register(STONE_ELDER, StoneElderEntity.createMobAttributes());
    }
}
