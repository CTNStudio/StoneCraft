package top.ctnstudios.registry.ToolMaterials;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static top.ctnstudios.registry.Items.LV4STONE_ITEM;

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
        return MiningLevels.DIAMOND;
    }
    @Override
    public int getEnchantability() {
        return 15;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(LV4STONE_ITEM);
    }
}
