package top.ctnstudios.registry.ToolMaterials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static top.ctnstudios.registry.Items.LV1STONE_ITEM;

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
        return Ingredient.ofItems(LV1STONE_ITEM);
    }
}
