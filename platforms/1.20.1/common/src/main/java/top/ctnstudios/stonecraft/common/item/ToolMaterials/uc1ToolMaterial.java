package top.ctnstudios.stonecraft.common.item.ToolMaterials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class uc1ToolMaterial implements ToolMaterial {
    public static final uc1ToolMaterial INSTANCE = new uc1ToolMaterial();
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
