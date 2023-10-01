package top.ctnstudios.registry.ToolMaterials;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static top.ctnstudios.registry.Items.LV3STONE_ITEM;

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
        return MiningLevels.STONE;
    }
    @Override
    public int getEnchantability() {
        return 6;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(LV3STONE_ITEM);
    }
}
