package top.ctnstudios.stonecraft.registry.ArmorMaterials;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import top.ctnstudios.stonecraft.registry.Items;

public class lv1ArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {171, 274, 240, 137};
    private static final int[] PROTECTION_VALUES = new int[] {2, 3, 3, 1};

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
        return 3;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.BLOCK_STONE_STEP;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.LV1STONE_ITEM);
    }

    @Override
    public String getName() {
        // Must be all lowercase
        return "lv1armor";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.1F;
    }
}
