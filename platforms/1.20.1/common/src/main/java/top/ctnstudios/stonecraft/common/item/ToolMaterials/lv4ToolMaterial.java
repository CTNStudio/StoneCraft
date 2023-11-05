package top.ctnstudios.stonecraft.common.item.ToolMaterials;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import top.ctnstudios.stonecraft.common.registry.ModItems;

public class lv4ToolMaterial implements ToolMaterial {
    public static final lv4ToolMaterial INSTANCE = new lv4ToolMaterial();
    @Override
    public int getDurability() {
        return 2753;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 11.0F;
    }
    @Override
    public float getAttackDamage() {
        return 4.5F;
    }
    @Override
    public int getMiningLevel() {
        return 3;
    }
    @Override
    public int getEnchantability() {
        return 15;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems((ItemConvertible) ModItems.LV4STONE);
    }
}
