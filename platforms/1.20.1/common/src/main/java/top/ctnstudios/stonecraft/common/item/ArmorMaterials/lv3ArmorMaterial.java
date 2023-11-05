package top.ctnstudios.stonecraft.common.item.ArmorMaterials;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import top.ctnstudios.stonecraft.common.registry.ModItems;

public class lv3ArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {431, 542, 505, 357};
    private static final int[] PROTECTION_VALUES = new int[] {2, 5, 4, 1};

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_VALUES[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 7;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.BLOCK_STONE_STEP;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems((ItemConvertible) ModItems.LV1STONE);
    }

    @Override
    public String getName() {
        return "lv3armor";
    }

    @Override
    public float getToughness() {
        return 1.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.5F;
    }
}
