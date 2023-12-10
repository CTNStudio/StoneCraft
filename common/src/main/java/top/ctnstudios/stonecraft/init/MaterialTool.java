package top.ctnstudios.stonecraft.init;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

public enum MaterialTool implements Tier {
    // TODO
    STONE_LV_1(175, 5.0f, 1.5f, 1, 7)
    ;

    private final int durability;
    private final float speed;
    private final float damage;
    private final int lv;
    private final int enchantmentValue;
    private final ItemLike[] items;

    MaterialTool(int durability, float speed, float damage, int lv, int enchantmentValue, ItemLike ... items) {
        this.durability = durability;
        this.speed = speed;
        this.damage = damage;
        this.lv = lv;
        this.enchantmentValue = enchantmentValue;
        this.items = items;
    }

    @Override
    public int getUses() {
        return durability;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public int getLevel() {
        return lv;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(items);
    }
}
