/*
 ItemStack potion = new ItemStack(Material.POTION);
 PotionMeta meta = (PotionMeta) potion.getItemMeta();
 meta.setBasePotionData(new PotionData(PotionType.FIRE_RESISTANCE, true, false));
 potion.setItemMeta(meta);
*/

package com.ks.realcraft.craft;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;


public class Craft {

    public static void init(){ create_recipes(); }

    public static void create_recipes() { //sl = shapeless

        Diamond_fool(); //1.0.0_pre-alpha_4
        Enchanted_two_apple(); //1.0.0_pre-alpha_2 -> changed 1.0.0_pre-alpha_4 = sl
        Experience_bottle(); //1.0.0_pre-alpha_2
        Horse_armors(); //1.0.0_pre-alpha_4
        Name_tag(); //1.0.0 = sl
        Snow_ball(); //1.0.0_pre-alpha_4 = sl
        String(); //1.0.0_pre-alpha_4 = sl
    }

    public static void Diamond_fool() {
        ItemStack fooled_diamond = new ItemStack(Material.COAL);
        ItemMeta fooled_diamond_meta = fooled_diamond.getItemMeta();
        fooled_diamond_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"難道你不知道鑽石是由碳組成的嗎","你看他都失去價值了"));
        fooled_diamond.setItemMeta(fooled_diamond_meta);

        FurnaceRecipe diamond_fool_f = new FurnaceRecipe(NamespacedKey.minecraft("diamond_fool_f"), fooled_diamond,
                Material.DIAMOND, 0.0f, 20);
        Bukkit.addRecipe(diamond_fool_f);
        BlastingRecipe diamond_fool_b = new BlastingRecipe(NamespacedKey.minecraft("diamond_fool_b"), fooled_diamond,
                Material.DIAMOND, 0.0f, 20);
        Bukkit.addRecipe(diamond_fool_b);
    }

    public static void Diamond_horse_armor() {
        ShapelessRecipe diamond_horse_armor = new ShapelessRecipe(NamespacedKey.minecraft("diamond_horse_armor"), new ItemStack(Material.DIAMOND_HORSE_ARMOR));
        diamond_horse_armor.addIngredient(Material.LEATHER_HORSE_ARMOR);
        diamond_horse_armor.addIngredient(Material.DIAMOND);
        Bukkit.addRecipe(diamond_horse_armor);
    }

    public static void Enchanted_two_apple() {
        ItemStack compressed_golden_apple = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta compressed_golden_apple_meta = compressed_golden_apple.getItemMeta();
        assert compressed_golden_apple_meta != null;
        compressed_golden_apple_meta.setDisplayName(ChatColor.GREEN+""+ChatColor.BOLD+"壓縮金蘋果");
        compressed_golden_apple_meta.setLore(List.of(ChatColor.RED+"請不要吃掉我","把我合成成附魔金蘋果吧"));
        compressed_golden_apple.setItemMeta(compressed_golden_apple_meta);

        ItemStack original_golden_apple = new ItemStack(Material.GOLDEN_APPLE);
        original_golden_apple.setItemMeta(original_golden_apple.getItemMeta());
        ShapelessRecipe compressed_golden_apple_rec = new ShapelessRecipe(NamespacedKey.minecraft("compressed_golden_apple"),compressed_golden_apple);
        compressed_golden_apple_rec.addIngredient(new RecipeChoice.ExactChoice(original_golden_apple)); //change
        compressed_golden_apple_rec.addIngredient(new RecipeChoice.ExactChoice(original_golden_apple));
        compressed_golden_apple_rec.addIngredient(new RecipeChoice.ExactChoice(original_golden_apple));
        Bukkit.addRecipe(compressed_golden_apple_rec);

        //Enchanted apple
        ShapelessRecipe Enchanted_golden_apple_rec = new ShapelessRecipe(NamespacedKey.minecraft("enchanted_apple"), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
        Enchanted_golden_apple_rec.addIngredient(new RecipeChoice.ExactChoice(compressed_golden_apple));
        Enchanted_golden_apple_rec.addIngredient(new RecipeChoice.ExactChoice(compressed_golden_apple));
        Enchanted_golden_apple_rec.addIngredient(new RecipeChoice.ExactChoice(compressed_golden_apple));
        Bukkit.addRecipe(Enchanted_golden_apple_rec);
    }

    public static void Experience_bottle() {
        FurnaceRecipe Experience_bottle_rec = new FurnaceRecipe(NamespacedKey.minecraft("experience_bottle"), new ItemStack(Material.EXPERIENCE_BOTTLE),
                Material.GLASS_BOTTLE, 0.0f, 30 * 20);
        Bukkit.addRecipe(Experience_bottle_rec);
    }

    public static void Golden_horse_armor() {
        ShapelessRecipe golden_horse_armor = new ShapelessRecipe(NamespacedKey.minecraft("golden_horse_armor"), new ItemStack(Material.GOLDEN_HORSE_ARMOR));
        golden_horse_armor.addIngredient(Material.LEATHER_HORSE_ARMOR);
        golden_horse_armor.addIngredient(Material.GOLD_INGOT);
        Bukkit.addRecipe(golden_horse_armor);
    }

    public static void Horse_armors() {
        Diamond_horse_armor();
        Golden_horse_armor();
        Iron_horse_armor();
    }

    public static void Iron_horse_armor() {
        ShapelessRecipe iron_horse_armor = new ShapelessRecipe(NamespacedKey.minecraft("iron_horse_armor"), new ItemStack(Material.IRON_HORSE_ARMOR));
        iron_horse_armor.addIngredient(Material.LEATHER_HORSE_ARMOR);
        iron_horse_armor.addIngredient(Material.IRON_INGOT);
        Bukkit.addRecipe(iron_horse_armor);
    }

    public static void Name_tag() {
        ShapelessRecipe name_tag = new ShapelessRecipe(NamespacedKey.minecraft("name_tag"), new ItemStack(Material.NAME_TAG));
        name_tag.addIngredient(Material.STRING);
        name_tag.addIngredient(Material.PAPER);
        Bukkit.addRecipe(name_tag);
    }

    public static void Snow_ball() {
        ShapelessRecipe snow_ball_rec = new ShapelessRecipe(NamespacedKey.minecraft("snow_ball"), new ItemStack(Material.SNOWBALL,4));
        snow_ball_rec.addIngredient(Material.SNOW_BLOCK);
        Bukkit.addRecipe(snow_ball_rec);
    }

    public static void String() {
        ShapelessRecipe string_rec = new ShapelessRecipe(NamespacedKey.minecraft("string"), new ItemStack(Material.STRING,4));
        string_rec.addIngredient(Material.WHITE_WOOL);
        Bukkit.addRecipe(string_rec);
    }

}
