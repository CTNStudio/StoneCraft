package top.ctnstudios.stonecraft.common.item.ToolMaterials;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import top.ctnstudios.stonecraft.common.registry.ModItems;

public class lv3ToolMaterial implements ToolMaterial {
    public static final lv3ToolMaterial INSTANCE = new lv3ToolMaterial();
    @Override
    public int getDurability() {
        return 1550;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 6.0F;
    }
    @Override
    public float getAttackDamage() {
        return 2.5F;
    }
    @Override
    public int getMiningLevel() {
        return 1;
    }
    @Override
    public int getEnchantability() {
        return 6;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems((ItemConvertible) ModItems.LV3STONE);
    }
}
