package top.ctnstudios.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class Foods {
    public static final FoodComponent STONE_APPLE = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(4.8F)
            .alwaysEdible()
            .build();
    public static final FoodComponent STONE_BREAD = new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(12.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,80*20,1),1)
            .alwaysEdible()
            .build();
    public static final FoodComponent STONE_POTATO = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,80*20,0),1)
            .alwaysEdible()
            .build();
    public static final FoodComponent STONE_CARROT = new FoodComponent.Builder()
            .hunger(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,40*20,0),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,40*20,0),1)
            .alwaysEdible()
            .build();
    public static final FoodComponent STONE_MELON = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(2.4F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,40*20,1),1)
            .alwaysEdible()
            .build();
    public static final FoodComponent STONE_KELP = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,160*20,0),1)
            .alwaysEdible()
            .snack()
            .build();
    public static final FoodComponent STONE_HODGEPODGE = new FoodComponent.Builder()
            .hunger(30)
            .saturationModifier(25.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,160*20,1),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,160*20,1),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,160*20,1),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,160*20,1),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,160*20,1),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,160*20,1),1)
            .alwaysEdible()
            .build();
}
