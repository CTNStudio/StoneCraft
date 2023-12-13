package top.ctnstudios.stonecraft;

import com.google.common.collect.Sets;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Set;

public class ItemCleanNegative extends Item {
    private final Set<StatusEffectInstance> effects;

    public ItemCleanNegative(int hunger, float saturation, StatusEffectInstance ... effects) {
        super(new Item.Settings().arch$tab(MainCommon.STONE_CRAFT_TABS).food(
                new FoodComponent.Builder()
                        .hunger(hunger)
                        .saturationModifier(saturation)
                        .alwaysEdible()
                        .build()
        ));

        this.effects = Sets.newHashSet(effects);
    }
    @Override
    public ItemStack finishUsing(ItemStack item, World world, LivingEntity user) {
        if (user instanceof PlayerEntity player) {
            player.getStatusEffects().forEach((effect) -> checkAndCleanNegativeEffectInstance(player, effect.getEffectType()));
            effects.forEach((effect) -> player.addStatusEffect(effect));
        }

        return super.finishUsing(item, world, user);
    }

    private void checkAndCleanNegativeEffectInstance(PlayerEntity player, StatusEffect effect) {
        if (effect.getCategory() == StatusEffectCategory.HARMFUL) {
            player.removeStatusEffect(effect);
        }
    }
}
