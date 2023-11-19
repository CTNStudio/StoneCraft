package top.ctnstudios.stonecraft.common.item.ToolMaterials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class uc3ToolMaterial implements ToolMaterial {
    public static final uc3ToolMaterial INSTANCE = new uc3ToolMaterial();
    @Override
    public int getDurability() {
        return 114514;
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
        return Ingredient.ofItems(Items.AIR);
    }
}
