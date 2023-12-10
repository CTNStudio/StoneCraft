package top.ctnstudios.stonecraft;

import com.google.common.collect.Sets;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import top.ctnstudios.stonecraft.MainCommon;

import java.util.Set;

public class ItemCleanNegative extends Item {
    private final Set<MobEffectInstance> effects;

    public ItemCleanNegative(int hunger, float saturation, MobEffectInstance ... effects) {
        super(new Item.Properties().arch$tab(MainCommon.STONE_CRAFT_TABS).food(
                new FoodProperties.Builder()
                        .nutrition(hunger)
                        .saturationMod(saturation)
                        .alwaysEat()
                        .build()
        ));

        this.effects = Sets.newHashSet(effects);
    }
    @Override
    public ItemStack finishUsingItem(ItemStack item, Level world, LivingEntity user) {
        if (user instanceof Player player) {
            player.getActiveEffects().forEach((effect) -> checkAndCleanNegativeEffectInstance(player, effect.getEffect()));
            effects.forEach((effect) -> player.addEffect(effect));
        }

        return super.finishUsingItem(item, world, user);
    }

    private void checkAndCleanNegativeEffectInstance(Player player, MobEffect effect) {
        if (effect.getCategory() == MobEffectCategory.HARMFUL) {
            player.removeEffect(effect);
        }
    }
}
