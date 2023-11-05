package top.ctnstudios.stonecraft.common.item.ArmorMaterials;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import top.ctnstudios.stonecraft.common.registry.ModItems;

public class lv5ArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {1282, 1971, 1724, 985};
    private static final int[] PROTECTION_VALUES = new int[] {4, 7, 6, 3};

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
        return 17;
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
        return "lv5armor";
    }

    @Override
    public float getToughness() {
        return 5.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 1.5F;
    }
}
