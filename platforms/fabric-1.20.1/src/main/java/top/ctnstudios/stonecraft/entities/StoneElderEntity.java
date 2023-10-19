package top.ctnstudios.stonecraft.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class StoneElderEntity extends PathAwareEntity {
    public StoneElderEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType,world);
    }
}
