package top.ctnstudios.stonecraft.common.item.ToolMaterials;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import top.ctnstudios.stonecraft.common.registry.ModItems;

public class lv5ToolMaterial implements ToolMaterial {
    public static final lv5ToolMaterial INSTANCE = new lv5ToolMaterial();
    @Override
    public int getDurability() {
        return 3254;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 15.0F;
    }
    @Override
    public float getAttackDamage() {
        return 5.0F;
    }
    @Override
    public int getMiningLevel() {
        return 4;
    }
    @Override
    public int getEnchantability() {
        return 20;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems((ItemConvertible) ModItems.LV5STONE);
    }
}
