package top.ctnstudios.stonecraft.init;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public enum MaterialTool implements ToolMaterial {
    STONE_LV_1(175, 5.0f, 1.5f, 1, 7, ItemInit.LV1STONE.get()),
    STONE_LV_2(227, 5.0f, 1.5f, 1, 7, ItemInit.LV2STONE.get()),
    STONE_LV_3(1550, 6.0f, 2.5f, 1, 6, ItemInit.LV3STONE.get()),
    STONE_LV_4(2753, 11.0f, 4.5f, 1, 4, ItemInit.LV4STONE.get()),
    STONE_LV_5(3254, 15.0f, 5.0f, 1, 2, ItemInit.LV5STONE.get())
    ;

    private final int durability;
    private final float speed;
    private final float damage;
    private final int lv;
    private final int enchantmentValue;
    private final ItemConvertible[] items;

    MaterialTool(int durability, float speed, float damage, int lv, int enchantmentValue, ItemConvertible ... items) {
        this.durability = durability;
        this.speed = speed;
        this.damage = damage;
        this.lv = lv;
        this.enchantmentValue = enchantmentValue;
        this.items = items;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return speed;
    }

    @Override
    public float getAttackDamage() {
        return damage;
    }

    @Override
    public int getMiningLevel() {
        return lv;
    }

    @Override
    public int getEnchantability() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(items);
    }
}
