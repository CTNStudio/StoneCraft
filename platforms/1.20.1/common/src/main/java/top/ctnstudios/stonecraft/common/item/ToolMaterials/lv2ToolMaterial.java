package top.ctnstudios.stonecraft.common.item.ToolMaterials;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import top.ctnstudios.stonecraft.common.registry.ModItems;

public class lv2ToolMaterial implements ToolMaterial {
    public static final lv2ToolMaterial INSTANCE = new lv2ToolMaterial();
    @Override
    public int getDurability() {
        return 227;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }
    @Override
    public float getAttackDamage() {
        return 1.5F;
    }
    @Override
    public int getMiningLevel() {
        return 1;
    }
    @Override
    public int getEnchantability() {
        return 7;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems((ItemConvertible) ModItems.LV1STONE);
    }
}
