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
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Item;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.io.BukkitObjectInputStream;

import javax.naming.Name;
import java.util.List;


public class Craft {

    public static void init(FileConfiguration config){
        boolean rare_things = config.getBoolean("Rare");
        boolean back_things = config.getBoolean("Back");
        boolean useful_things = config.getBoolean("Useful");
        boolean fun_things = config.getBoolean("Fun");
        boolean bucket_things = config.getBoolean("Bucket");
        boolean disc_things = config.getBoolean("Disc");

        if (rare_things) rare();
        if (back_things) back();
        if (useful_things) useful();
        if (fun_things) fun();
        if (bucket_things) bucket();
        if (disc_things) disc();
        }

    public static void rare(){
        Enchanted_two_apple(); //1.0.0_pre-alpha_2 -> changed 1.0.0_pre-alpha_4 = sl
        Experience_bottle(); //1.0.0_pre-alpha_2
        Horse_armors(); //1.0.0_pre-alpha_4
        Name_tag(); //1.0.0 = sl
        Netherite_upgrade();//1.0.3
    }

    public static void back(){
        Snow_ball(); //1.0.0_pre-alpha_4 = sl
        String(); //1.0.0_pre-alpha_4 = sl
    }

    public static void useful(){
        Lava_stone_bucket(); //1.0.0
        Powder_snow_bucket();//1.0.3
    }

    public static void fun() { //sl = shapeless
        Diamond_fool(); //1.0.0_pre-alpha_4

    }

    public static void bucket(){
        Salmon_bucket();
        Tadpole_bucket();
        Tropical_fish_bucket();
        Puffer_fish_bucket();
    }

    public static void disc(){
        Plastic(); //1.0.4
        Disc_13(); //1.0.4
        Disc_cat(); //1.0.4
        Disc_block(); //1.0.4
        Disc_chirp(); //1.0.4
        Disc_far(); //1.0.4
        Disc_mall(); //1.0.4
        Disc_mellohi(); //1.0.4
        Disc_stal(); //1.0.4
        Disc_strad(); //1.0.4
        Disc_ward(); //1.0.4
        Disc_11(); //1.0.4
        Disc_wait(); //1.0.4
        Disc_pigstep(); //1.0.4
        Disc_otherside(); //1.0.4
        Disc_relic(); //1.0.4
    }

//recipe settings below

    public static void Diamond_fool() {
        ItemStack fooled_diamond = new ItemStack(Material.COAL);
        ItemMeta fooled_diamond_meta = fooled_diamond.getItemMeta();
        fooled_diamond_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"難道你不知道鑽石是由碳組成的嗎","你看他都失去價值了"));
        fooled_diamond.setItemMeta(fooled_diamond_meta);

        FurnaceRecipe diamond_fool_f = new FurnaceRecipe(NamespacedKey.minecraft("diamond_fool_furnace"), fooled_diamond,
                Material.DIAMOND, 0.0f, 20);
        Bukkit.addRecipe(diamond_fool_f);
        BlastingRecipe diamond_fool_b = new BlastingRecipe(NamespacedKey.minecraft("diamond_fool_blast"), fooled_diamond,
                Material.DIAMOND, 0.0f, 20);
        Bukkit.addRecipe(diamond_fool_b);
    }

    public static void Diamond_horse_armor() {
        ShapelessRecipe diamond_horse_armor = new ShapelessRecipe(NamespacedKey.minecraft("diamond_horse_armor"), new ItemStack(Material.DIAMOND_HORSE_ARMOR));
        diamond_horse_armor.addIngredient(Material.LEATHER_HORSE_ARMOR);
        diamond_horse_armor.addIngredient(Material.DIAMOND);
        Bukkit.addRecipe(diamond_horse_armor);
    }

    public static void Disc_13() {
        ShapedRecipe disc_13 = new ShapedRecipe(NamespacedKey.minecraft("disc_13"),new ItemStack(Material.MUSIC_DISC_13));
        disc_13.shape("###","#*#","###");
        disc_13.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_13.setIngredient('*', Material.IRON_INGOT);
        Bukkit.addRecipe(disc_13);
    }

    public static void Disc_cat() {
        ShapedRecipe disc_cat = new ShapedRecipe(NamespacedKey.minecraft("disc_cat"),new ItemStack(Material.MUSIC_DISC_CAT));
        disc_cat.shape("###","#*#","###");
        disc_cat.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_cat.setIngredient('*', Material.EMERALD);
        Bukkit.addRecipe(disc_cat);
    }

    public static void Disc_block() {
        ShapedRecipe disc_block = new ShapedRecipe(NamespacedKey.minecraft("disc_block"),new ItemStack(Material.MUSIC_DISC_BLOCKS));
        disc_block.shape("###","#*#","###");
        disc_block.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_block.setIngredient('*', Material.REDSTONE);
        Bukkit.addRecipe(disc_block);
    }

    public static void Disc_chirp() {
        ShapedRecipe disc_chirp = new ShapedRecipe(NamespacedKey.minecraft("disc_chirp"),new ItemStack(Material.MUSIC_DISC_CHIRP));
        disc_chirp.shape("###","#*#","###");
        disc_chirp.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_chirp.setIngredient('*', Material.REDSTONE_BLOCK);
        Bukkit.addRecipe(disc_chirp);
    }

    public static void Disc_far() {
        ShapedRecipe disc_far = new ShapedRecipe(NamespacedKey.minecraft("disc_far"),new ItemStack(Material.MUSIC_DISC_FAR));
        disc_far.shape("###","#*#","###");
        disc_far.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_far.setIngredient('*', Material.SLIME_BALL);
        Bukkit.addRecipe(disc_far);
    }

    public static void Disc_mall() {
        ShapedRecipe disc_mall = new ShapedRecipe(NamespacedKey.minecraft("disc_mall"),new ItemStack(Material.MUSIC_DISC_MALL));
        disc_mall.shape("###","#*#","###");
        disc_mall.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_mall.setIngredient('*', Material.AMETHYST_SHARD);
        Bukkit.addRecipe(disc_mall);
    }

    public static void Disc_mellohi() {
        ShapedRecipe disc_mellohi = new ShapedRecipe(NamespacedKey.minecraft("disc_mellohi"),new ItemStack(Material.MUSIC_DISC_MELLOHI));
        disc_mellohi.shape("###","#*#","###");
        disc_mellohi.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_mellohi.setIngredient('*', Material.QUARTZ);
        Bukkit.addRecipe(disc_mellohi);
    }

    public static void Disc_stal() {
        ShapedRecipe disc_stal = new ShapedRecipe(NamespacedKey.minecraft("disc_stal"),new ItemStack(Material.MUSIC_DISC_STAL));
        disc_stal.shape("###","#*#","###");
        disc_stal.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_stal.setIngredient('*', Material.DEEPSLATE);
        Bukkit.addRecipe(disc_stal);
    }

    public static void Disc_strad() {
        ShapedRecipe disc_strad = new ShapedRecipe(NamespacedKey.minecraft("disc_strad"),new ItemStack(Material.MUSIC_DISC_STRAD));
        disc_strad.shape("###","#*#","###");
        disc_strad.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_strad.setIngredient('*', Material.GLOWSTONE_DUST);
        Bukkit.addRecipe(disc_strad);
    }

    public static void Disc_ward() {
        ShapedRecipe disc_ward = new ShapedRecipe(NamespacedKey.minecraft("disc_ward"),new ItemStack(Material.MUSIC_DISC_WARD));
        disc_ward.shape("###","#*#","###");
        disc_ward.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_ward.setIngredient('*', Material.LAPIS_LAZULI);
        Bukkit.addRecipe(disc_ward);
    }

    public static void Disc_11() {
        ShapedRecipe disc_11 = new ShapedRecipe(NamespacedKey.minecraft("disc_11"),new ItemStack(Material.MUSIC_DISC_11));
        disc_11.shape("###","#*#","###");
        disc_11.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_11.setIngredient('*', Material.TNT);
        Bukkit.addRecipe(disc_11);
    }

    public static void Disc_wait() {
        ShapedRecipe disc_wait = new ShapedRecipe(NamespacedKey.minecraft("disc_wait"),new ItemStack(Material.MUSIC_DISC_WAIT));
        disc_wait.shape("###","#*#","###");
        disc_wait.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_wait.setIngredient('*', Material.BLUE_ICE);
        Bukkit.addRecipe(disc_wait);
    }

    public static void Disc_pigstep() {
        ShapedRecipe disc_pigstep = new ShapedRecipe(NamespacedKey.minecraft("disc_pigstep"),new ItemStack(Material.MUSIC_DISC_PIGSTEP));
        disc_pigstep.shape("###","$*$","###");
        disc_pigstep.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_pigstep.setIngredient('*', Material.GLOWSTONE_DUST);
        disc_pigstep.setIngredient('$', Material.BRICK);
        Bukkit.addRecipe(disc_pigstep);
    }

    public static void Disc_otherside() {
        ShapedRecipe disc_otherside = new ShapedRecipe(NamespacedKey.minecraft("disc_otherside"),new ItemStack(Material.MUSIC_DISC_OTHERSIDE));
        disc_otherside.shape("###","#*#","###");
        disc_otherside.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_otherside.setIngredient('*', Material.WARPED_PLANKS);
        Bukkit.addRecipe(disc_otherside);
    }

    public static void Disc_relic() {
        ShapedRecipe disc_relic = new ShapedRecipe(NamespacedKey.minecraft("disc_relic"),new ItemStack(Material.MUSIC_DISC_RELIC));
        disc_relic.shape("###","#*#","###");
        disc_relic.setIngredient('#', new RecipeChoice.ExactChoice(plastic()));
        disc_relic.setIngredient('*', Material.SAND);
        Bukkit.addRecipe(disc_relic);
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

    public static void Lava_stone_bucket() {
        ItemStack stone_bucket = new ItemStack(Material.BUCKET);
        ItemMeta stone_bucket_meta = stone_bucket.getItemMeta();
        stone_bucket_meta.setDisplayName(ChatColor.GREEN+""+ChatColor.BOLD+"石頭桶");
        stone_bucket_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"裝著石頭的桶子","聽說拿去熔爐燒就會變成熔岩喔","記得是熔爐不是高爐"));
        stone_bucket.setItemMeta(stone_bucket_meta);
        ShapelessRecipe stone_bucket_rec = new ShapelessRecipe(NamespacedKey.minecraft("stone_bucket"),stone_bucket);
        stone_bucket_rec.addIngredient(Material.STONE);
        stone_bucket_rec.addIngredient(Material.BUCKET);
        Bukkit.addRecipe(stone_bucket_rec);

        //lava
        FurnaceRecipe lava_bucket_rec = new FurnaceRecipe(NamespacedKey.minecraft("lava_bucket"), new ItemStack(Material.LAVA_BUCKET),
                new RecipeChoice.ExactChoice(stone_bucket), 50.0f, 60*20);
        Bukkit.addRecipe(lava_bucket_rec);
        //wrong use

        ItemStack failed_lava = new ItemStack(Material.RAW_IRON,2);
        ItemMeta failed_lava_meta = failed_lava.getItemMeta();
        failed_lava_meta.setDisplayName(ChatColor.DARK_GRAY+""+ChatColor.BOLD+"廢鐵");
        failed_lava_meta.setLore(List.of(ChatColor.RED+"你不小心用錯爐子","桶子融化造成熔煉失敗","現在只剩這堆廢鐵"));
        failed_lava.setItemMeta(failed_lava_meta);
        BlastingRecipe lava_failed_rec = new BlastingRecipe(NamespacedKey.minecraft("lava_failed"), failed_lava,
                new RecipeChoice.ExactChoice(stone_bucket), 1.0f, 10*20);
        Bukkit.addRecipe(lava_failed_rec);
    }

    public static void Name_tag() {
        ShapelessRecipe name_tag = new ShapelessRecipe(NamespacedKey.minecraft("name_tag"), new ItemStack(Material.NAME_TAG));
        name_tag.addIngredient(Material.STRING);
        name_tag.addIngredient(Material.PAPER);
        Bukkit.addRecipe(name_tag);
    }

    public static void Netherite_upgrade() {
        ShapedRecipe netherite_upgrade = new ShapedRecipe(NamespacedKey.minecraft("netherite_upgrade"), new ItemStack(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE));
        netherite_upgrade.shape("###","#*#","###");
        netherite_upgrade.setIngredient('#',Material.NETHERRACK);
        netherite_upgrade.setIngredient('*',Material.NETHERITE_SCRAP);
        Bukkit.addRecipe(netherite_upgrade);
    }

    public static void Salmon_bucket() {
        ShapelessRecipe salmon_bucket_rec = new ShapelessRecipe(NamespacedKey.minecraft("salmon_bucket"), new ItemStack(Material.SALMON_BUCKET));
        salmon_bucket_rec.addIngredient(Material.SALMON_SPAWN_EGG);
        salmon_bucket_rec.addIngredient(Material.WATER_BUCKET);
        Bukkit.addRecipe(salmon_bucket_rec);
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

    public static void Tadpole_bucket() {
        ShapelessRecipe tadpole_bucket_rec = new ShapelessRecipe(NamespacedKey.minecraft("tadpole_bucket"), new ItemStack(Material.TADPOLE_BUCKET));
        tadpole_bucket_rec.addIngredient(Material.TADPOLE_SPAWN_EGG);
        tadpole_bucket_rec.addIngredient(Material.WATER_BUCKET);
        Bukkit.addRecipe(tadpole_bucket_rec);
    }

    public static void Tropical_fish_bucket() {
        ShapelessRecipe tropical_fish_bucket_rec = new ShapelessRecipe(NamespacedKey.minecraft("tropical_fish_bucket"), new ItemStack(Material.TROPICAL_FISH_BUCKET));
        tropical_fish_bucket_rec.addIngredient(Material.TROPICAL_FISH_SPAWN_EGG);
        tropical_fish_bucket_rec.addIngredient(Material.WATER_BUCKET);
        Bukkit.addRecipe(tropical_fish_bucket_rec);
    }

    public static ItemStack plastic(){ //item setting
        ItemStack plastic = new ItemStack(Material.BLACK_DYE);
        ItemMeta plastic_meta = plastic.getItemMeta();
        plastic_meta.setDisplayName(ChatColor.LIGHT_PURPLE+"塑膠");
        plastic.setItemMeta(plastic_meta);
        return plastic;
    }

    public static void Plastic(){
        ItemStack plastic = plastic();
        FurnaceRecipe plastic_rec = new FurnaceRecipe(NamespacedKey.minecraft("plastic"),plastic,
                Material.COAL,50f,30*20);
        Bukkit.addRecipe(plastic_rec);
    }

    public static void Powder_snow_bucket() {
        ShapelessRecipe powder_snow_bucket = new ShapelessRecipe(NamespacedKey.minecraft("powder_snow_bucket"), new ItemStack(Material.POWDER_SNOW_BUCKET));
        powder_snow_bucket.addIngredient(Material.BUCKET);
        powder_snow_bucket.addIngredient(Material.SNOW_BLOCK);
        Bukkit.addRecipe(powder_snow_bucket);
    }

    public static void Puffer_fish_bucket() {
        ShapelessRecipe puffer_fish_bucket_rec = new ShapelessRecipe(NamespacedKey.minecraft("puffer_fish_bucket"), new ItemStack(Material.PUFFERFISH_BUCKET));
        puffer_fish_bucket_rec.addIngredient(Material.PUFFERFISH_SPAWN_EGG);
        puffer_fish_bucket_rec.addIngredient(Material.WATER_BUCKET);
        Bukkit.addRecipe(puffer_fish_bucket_rec);
    }

}
