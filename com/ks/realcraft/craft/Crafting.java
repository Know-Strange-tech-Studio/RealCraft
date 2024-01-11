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
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.type.TNT;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.BlockDataMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;


public class Crafting {

    public static void init(FileConfiguration config){
        boolean rare_things = config.getBoolean("Rare");
        boolean back_things = config.getBoolean("Back");
        boolean useful_things = config.getBoolean("Useful");
        boolean fun_things = config.getBoolean("Fun");
        boolean bucket_things = config.getBoolean("Bucket");
        boolean disc_things = config.getBoolean("Disc");
        boolean chemistry_things = config.getBoolean("Chemistry");

        if (rare_things) rare();
        if (back_things) back();
        if (useful_things) useful();
        if (fun_things) fun();
        if (bucket_things) bucket();
        if (disc_things) disc();
        if (chemistry_things) chemistry();
        }

    public static void rare(){
        Elytra(); //1.0.4
        Enchanted_two_apple(); //1.0.0_pre-alpha_2 -> changed 1.0.0_pre-alpha_4 = sl
        Experience_bottle(); //1.0.0_pre-alpha_2
        Horse_armors(); //1.0.0_pre-alpha_4
        Name_tag(); //1.0.0 = sl
        Netherite_upgrade();//1.0.3
    }

    public static void back(){
        Nether_wart(); //1.0.5
        Snow_ball(); //1.0.0_pre-alpha_4 = sl
        String(); //1.0.0_pre-alpha_4 = sl
        Quartz(); //1.0.5
    }

    public static void useful(){
        Lava_stone_bucket(); //1.0.0
        Powder_snow_bucket();//1.0.3
        String2(); //1.0.5
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

    public static void chemistry() {
        Production_selector(); //1.0.5
        Grass_ash(); //1.0.5
        Potassium_nitrate_solution(); //1.0.5
        //Potassium_nitrate(); //1.0.5 loaded in Potassium_nitrate_solution
        Sulfur(); //1.0.5
        Gunpowder(); //1.0.5
        Hydrogen_peroxide(); //1.0.5
        Sulfur_dioxide(); //1.0.5
        Sulfuric_acid(); //1.0.5
        Nitric_acid(); //1.0.5
        Fat(); //1.0.5
        Glycerol(); //1.0.5
        Unstable_tnt(); //1.0.5
        Calcium_carbonate(); //1.0.5
        Calcite(); //1.0.5
        Salt(); //1.0.5
    }

//recipe settings below

    public static void Calcite() {
        ShapelessRecipe calcite_rec = new ShapelessRecipe(NamespacedKey.minecraft("calcite_rec"),new ItemStack(Material.CALCITE));
        calcite_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.calcium_carbonate));
        calcite_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.calcium_carbonate));
        calcite_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.calcium_carbonate));
        calcite_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.calcium_carbonate));
        calcite_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.calcium_carbonate));
        calcite_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.calcium_carbonate));
        calcite_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.calcium_carbonate));
        calcite_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.calcium_carbonate));
        calcite_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.calcium_carbonate));
        Bukkit.addRecipe(calcite_rec);
    }

    public static void Calcium_carbonate() {
        ItemStack calcium_carbonate = new ItemStack(Material.SUGAR);
        ItemMeta calcium_carbonate_meta = calcium_carbonate.getItemMeta();
        assert calcium_carbonate_meta != null;
        calcium_carbonate_meta.setDisplayName(ChatColor.GOLD+"碳酸鈣粉");
        calcium_carbonate_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"碳酸鈣"));
        calcium_carbonate.setItemMeta(calcium_carbonate_meta);
        ItemControl.calcium_carbonate = calcium_carbonate;
        ShapelessRecipe calcium_carbonate_rec1 = new ShapelessRecipe(NamespacedKey.minecraft("calcium_carbonate1"),calcium_carbonate);
        calcium_carbonate_rec1.addIngredient(Material.BASALT);
        calcium_carbonate_rec1.addIngredient(Material.BASALT);
        calcium_carbonate_rec1.addIngredient(Material.BASALT);
        calcium_carbonate_rec1.addIngredient(Material.BASALT);
        Bukkit.addRecipe(calcium_carbonate_rec1);

        ShapelessRecipe calcium_carbonate_rec2 = new ShapelessRecipe(NamespacedKey.minecraft("calcium_carbonate2"),calcium_carbonate);
        calcium_carbonate_rec2.addIngredient(Material.POINTED_DRIPSTONE);
        Bukkit.addRecipe(calcium_carbonate_rec2);

        ShapelessRecipe calcium_carbonate_rec3 = new ShapelessRecipe(NamespacedKey.minecraft("calcium_carbonate3"),calcium_carbonate);
        calcium_carbonate_rec3.addIngredient(new RecipeChoice.MaterialChoice(List.of(Material.DEAD_TUBE_CORAL,Material.DEAD_BRAIN_CORAL,Material.DEAD_BUBBLE_CORAL,Material.DEAD_FIRE_CORAL,Material.DEAD_HORN_CORAL)));
        Bukkit.addRecipe(calcium_carbonate_rec3);

        ItemStack calcium_carbonate_9 = calcium_carbonate.clone();
        calcium_carbonate_9.setAmount(9);
        ShapelessRecipe calcium_carbonate_rec4 = new ShapelessRecipe(NamespacedKey.minecraft("calcium_carbonate4"),calcium_carbonate);
        calcium_carbonate_rec4.addIngredient(new RecipeChoice.MaterialChoice(List.of(Material.DEAD_TUBE_CORAL_BLOCK,Material.DEAD_BRAIN_CORAL_BLOCK,Material.DEAD_BUBBLE_CORAL_BLOCK,Material.DEAD_FIRE_CORAL_BLOCK,Material.DEAD_HORN_CORAL_BLOCK)));
        Bukkit.addRecipe(calcium_carbonate_rec4);

        ShapelessRecipe calcium_carbonate_rec5 = new ShapelessRecipe(NamespacedKey.minecraft("calcium_carbonate5"),calcium_carbonate_9);
        calcium_carbonate_rec5.addIngredient(Material.CALCITE);
        Bukkit.addRecipe(calcium_carbonate_rec5);
    }

    public static void Diamond_fool() {
        ItemStack fooled_diamond = new ItemStack(Material.COAL);
        ItemMeta fooled_diamond_meta = fooled_diamond.getItemMeta();
        assert fooled_diamond_meta != null;
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

    public static void Elytra() {
        ItemStack elytra_item = new ItemStack(Material.ELYTRA);
        ItemMeta elytra_meta = elytra_item.getItemMeta();
        assert elytra_meta != null;
        elytra_meta.setDisplayName(ChatColor.LIGHT_PURPLE+"合成出來的鞘翅");
        elytra_meta.setLore(List.of(ChatColor.GOLD+"遜咖 不會自己找船嗎",ChatColor.GOLD+"還要自己合成",ChatColor.RED+"垃圾人一個"));
        elytra_item.setItemMeta(elytra_meta);
        ShapedRecipe elytra = new ShapedRecipe(NamespacedKey.minecraft("elytra"),elytra_item);
        elytra.shape("###","#*#","#*#");
        elytra.setIngredient('#',Material.PHANTOM_MEMBRANE);
        elytra.setIngredient('*',Material.AIR);
        Bukkit.addRecipe(elytra);
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

    public static void Fat() {
        ItemStack fat = new ItemStack(Material.BONE_MEAL);
        ItemMeta fat_meta = fat.getItemMeta();
        assert fat_meta != null;
        fat_meta.setDisplayName(ChatColor.GOLD+"油脂");
        fat_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"三酸甘油酯"));
        fat.setItemMeta(fat_meta);
        ItemControl.fat = fat;
        ShapelessRecipe fat_rec = new ShapelessRecipe(NamespacedKey.minecraft("fat"),fat);
        fat_rec.addIngredient(new RecipeChoice.MaterialChoice(List.of(Material.BEEF,Material.PORKCHOP,Material.RABBIT,Material.MUTTON,Material.CHICKEN,Material.SALMON,Material.COD,Material.TROPICAL_FISH)));
        Bukkit.addRecipe(fat_rec);
    }

    public static void Glycerol() {
        ItemStack glycerol = new ItemStack(Material.POTION);
        ItemMeta glycerol_meta = glycerol.getItemMeta();
        assert glycerol_meta != null;
        glycerol_meta.setDisplayName(ChatColor.GOLD+"甘油");
        glycerol_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"丙三醇"));
        glycerol.setItemMeta(glycerol_meta);
        ItemControl.glycerol = glycerol;
        ShapelessRecipe glycerol_rec = new ShapelessRecipe(NamespacedKey.minecraft("glycerol"),glycerol);
        glycerol_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.potassium_nitrate_solution));
        glycerol_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.fat));
        glycerol_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.production_selector));
        Bukkit.addRecipe(glycerol_rec);
    }

    public static void Golden_horse_armor() {
        ShapelessRecipe golden_horse_armor = new ShapelessRecipe(NamespacedKey.minecraft("golden_horse_armor"), new ItemStack(Material.GOLDEN_HORSE_ARMOR));
        golden_horse_armor.addIngredient(Material.LEATHER_HORSE_ARMOR);
        golden_horse_armor.addIngredient(Material.GOLD_INGOT);
        Bukkit.addRecipe(golden_horse_armor);
    }
    public static void Grass_ash() {
        ItemStack grass_ash = new ItemStack(Material.DRIED_KELP);
        ItemMeta grass_ash_meta = grass_ash.getItemMeta();
        assert grass_ash_meta != null;
        grass_ash_meta.setDisplayName(ChatColor.GOLD+"草灰");
        grass_ash_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"燒過的草"));
        grass_ash.setItemMeta(grass_ash_meta);
        ItemControl.grass_ash = grass_ash;
        FurnaceRecipe grass_ash_rec = new FurnaceRecipe(NamespacedKey.minecraft("grass_ash"),grass_ash,Material.GRASS,1f, 20);
        Bukkit.addRecipe(grass_ash_rec);
    }

    public static void Gunpowder() {
        ShapelessRecipe gunpowder_rec1 = new ShapelessRecipe(NamespacedKey.minecraft("gunpowder1"),new ItemStack(Material.GUNPOWDER,10));
        gunpowder_rec1.addIngredient(new RecipeChoice.ExactChoice(ItemControl.sulfur));
        gunpowder_rec1.addIngredient(new RecipeChoice.ExactChoice(ItemControl.potassium_nitrate));
        gunpowder_rec1.addIngredient(new RecipeChoice.MaterialChoice(List.of(Material.COAL,Material.CHARCOAL)));
        Bukkit.addRecipe(gunpowder_rec1);
    }

    public static void Hydrochloric_acid() {
        
    }

    public static void Hydrogen_peroxide() {
        ItemStack hydrogen_peroxide = new ItemStack(Material.WATER_BUCKET);
        ItemMeta hydrogen_peroxide_meta = hydrogen_peroxide.getItemMeta();
        assert hydrogen_peroxide_meta != null;
        hydrogen_peroxide_meta.setDisplayName(ChatColor.GOLD+"雙氧水");
        hydrogen_peroxide_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"過氧化氫"));
        hydrogen_peroxide.setItemMeta(hydrogen_peroxide_meta);
        ItemControl.hydrogen_peroxide = hydrogen_peroxide;
        ShapelessRecipe hydrogen_peroxide_rec = new ShapelessRecipe(NamespacedKey.minecraft("hydrogen_preoxide"),hydrogen_peroxide);
        hydrogen_peroxide_rec.addIngredient(new RecipeChoice.ExactChoice(new ItemStack(Material.WATER_BUCKET)));
        Bukkit.addRecipe(hydrogen_peroxide_rec);
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
        assert stone_bucket_meta != null;
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
        assert failed_lava_meta != null;
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

    public static void Nether_wart() {
        ShapelessRecipe nether_wart_rec = new ShapelessRecipe(NamespacedKey.minecraft("nether_wart"),new ItemStack(Material.NETHER_WART,9));
        nether_wart_rec.addIngredient(Material.NETHER_WART_BLOCK);
        Bukkit.addRecipe(nether_wart_rec);
    }

    public static void Nitric_acid() {
        ItemStack nitric_acid = new ItemStack(Material.POTION);
        ItemMeta nitric_acid_meta = nitric_acid.getItemMeta();
        //PotionMeta meta = (PotionMeta) nitric_acid_meta;
        assert nitric_acid_meta != null;
        //meta.setBasePotionData(new PotionData(PotionType.INSTANT_DAMAGE, true, true));
        nitric_acid_meta.setDisplayName(ChatColor.GOLD+"硝酸");
        nitric_acid_meta.setLore(List.of(ChatColor.GOLD+"硝酸"));
        nitric_acid.setItemMeta(nitric_acid_meta);
        ItemControl.nitric_acid = nitric_acid;
        ShapelessRecipe nitric_acid_rec = new ShapelessRecipe(NamespacedKey.minecraft("nitric_acid"),nitric_acid);
        nitric_acid_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.potassium_nitrate_solution));
        nitric_acid_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.sulfuric_acid));
        Bukkit.addRecipe(nitric_acid_rec);
    }

    public static ItemStack plastic(){ //item setting
        ItemStack plastic = new ItemStack(Material.BLACK_DYE);
        ItemMeta plastic_meta = plastic.getItemMeta();
        assert plastic_meta != null;
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

    public static void Potassium_nitrate_solution() {
        ItemStack potassium_nitrate_solution = new ItemStack(Material.WATER_BUCKET);
        ItemMeta potassium_nitrate_solution_meta = potassium_nitrate_solution.getItemMeta();
        assert potassium_nitrate_solution_meta != null;
        potassium_nitrate_solution_meta.setDisplayName(ChatColor.GOLD+"硝酸鉀溶液");
        potassium_nitrate_solution_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"硝酸鉀"));
        potassium_nitrate_solution.setItemMeta(potassium_nitrate_solution_meta);
        ItemControl.potassium_nitrate_solution = potassium_nitrate_solution;
        ShapelessRecipe potassium_nitrate_solution_rec = new ShapelessRecipe(NamespacedKey.minecraft("kno3"),potassium_nitrate_solution);
        potassium_nitrate_solution_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.grass_ash));
        potassium_nitrate_solution_rec.addIngredient(new RecipeChoice.ExactChoice(new ItemStack(Material.WATER_BUCKET)));
        Bukkit.addRecipe(potassium_nitrate_solution_rec);
        ShapelessRecipe potassium_nitrate_solution_rec2 = new ShapelessRecipe(NamespacedKey.minecraft("kno3_s"),potassium_nitrate_solution);
        potassium_nitrate_solution_rec2.addIngredient(new RecipeChoice.ExactChoice(new ItemStack(Material.WATER_BUCKET)));
        Potassium_nitrate();
        potassium_nitrate_solution_rec2.addIngredient(new RecipeChoice.ExactChoice(ItemControl.potassium_nitrate));
        Bukkit.addRecipe(potassium_nitrate_solution_rec2);
    }

    public static void Potassium_nitrate() {
        ItemStack potassium_nitrate = new ItemStack(Material.SUGAR);
        ItemMeta potassium_nitrate_meta = potassium_nitrate.getItemMeta();
        assert potassium_nitrate_meta != null;
        potassium_nitrate_meta.setDisplayName(ChatColor.GOLD+"硝酸鉀粉末");
        potassium_nitrate_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"硝酸鉀"));
        potassium_nitrate.setItemMeta(potassium_nitrate_meta);
        ItemControl.potassium_nitrate = potassium_nitrate;
        FurnaceRecipe potassium_nitrate_rec = new FurnaceRecipe(NamespacedKey.minecraft("kno3_powder"),potassium_nitrate,new RecipeChoice.ExactChoice(ItemControl.potassium_nitrate_solution),1f,10*20);
        Bukkit.addRecipe(potassium_nitrate_rec);
    }

    public static void Powder_snow_bucket() {
        ShapelessRecipe powder_snow_bucket = new ShapelessRecipe(NamespacedKey.minecraft("powder_snow_bucket"), new ItemStack(Material.POWDER_SNOW_BUCKET));
        powder_snow_bucket.addIngredient(Material.BUCKET);
        powder_snow_bucket.addIngredient(Material.SNOW_BLOCK);
        Bukkit.addRecipe(powder_snow_bucket);
    }

    public static void Production_selector() {
        ItemStack production_selector = new ItemStack(Material.BLACK_DYE);
        ItemMeta production_selector_meta = production_selector.getItemMeta();
        assert production_selector_meta != null;
        production_selector_meta.setDisplayName(ChatColor.GOLD+"產物選擇器");
        production_selector_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"選擇產物用的",ChatColor.GREEN+"添加1個用來選擇第2個產物",ChatColor.GREEN+"添加2個用來選擇第3個產物",ChatColor.YELLOW+"以此類推"));
        production_selector.setItemMeta(production_selector_meta);
        ItemControl.production_selector = production_selector;
        ShapelessRecipe production_selector_rec = new ShapelessRecipe(NamespacedKey.minecraft("production_selector"),production_selector);
        production_selector_rec.addIngredient(new RecipeChoice.MaterialChoice(List.of(Material.DIRT,Material.GRASS_BLOCK)));
        Bukkit.addRecipe(production_selector_rec);
    }

    public static void Puffer_fish_bucket() {
        ShapelessRecipe puffer_fish_bucket_rec = new ShapelessRecipe(NamespacedKey.minecraft("puffer_fish_bucket"), new ItemStack(Material.PUFFERFISH_BUCKET));
        puffer_fish_bucket_rec.addIngredient(Material.PUFFERFISH_SPAWN_EGG);
        puffer_fish_bucket_rec.addIngredient(Material.WATER_BUCKET);
        Bukkit.addRecipe(puffer_fish_bucket_rec);
    }

    public static void Quartz() {
        ShapelessRecipe quartz_rec = new ShapelessRecipe(NamespacedKey.minecraft("quartzz"),new ItemStack(Material.QUARTZ,4));
        quartz_rec.addIngredient(Material.QUARTZ_BLOCK);
        Bukkit.addRecipe(quartz_rec);
    }

    public static void Salmon_bucket() {
        ShapelessRecipe salmon_bucket_rec = new ShapelessRecipe(NamespacedKey.minecraft("salmon_bucket"), new ItemStack(Material.SALMON_BUCKET));
        salmon_bucket_rec.addIngredient(Material.SALMON_SPAWN_EGG);
        salmon_bucket_rec.addIngredient(Material.WATER_BUCKET);
        Bukkit.addRecipe(salmon_bucket_rec);
    }

    public static void Salt() {
        ItemStack salt = new ItemStack(Material.SUGAR);
        ItemMeta salt_meta = salt.getItemMeta();
        assert salt_meta != null;
        salt_meta.setDisplayName(ChatColor.GOLD+"食鹽");
        salt_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"氯化鈉"));
        salt.setItemMeta(salt_meta);
        ItemControl.salt = salt;
        ShapelessRecipe salt_rec1 = new ShapelessRecipe(NamespacedKey.minecraft("salt1"),salt);
        salt_rec1.addIngredient(new RecipeChoice.MaterialChoice(List.of(Material.STONE,Material.ANDESITE,Material.GRANITE,Material.DIORITE)));
        Bukkit.addRecipe(salt_rec1);

        FurnaceRecipe salt_rec2 = new FurnaceRecipe(NamespacedKey.minecraft("salt2"),salt,new RecipeChoice.ExactChoice(new ItemStack(Material.WATER_BUCKET)),2.0f,10*20);
        Bukkit.addRecipe(salt_rec2);
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

    public static void String2() {
        ShapedRecipe string2_rec = new ShapedRecipe(NamespacedKey.minecraft("string2"),new ItemStack(Material.STRING,3));
        string2_rec.shape("#**","*#*","**#");
        string2_rec.setIngredient('#',Material.WHEAT);
        string2_rec.setIngredient('*',Material.AIR);
        Bukkit.addRecipe(string2_rec);
    }

    public static void Sulfur() {
        ItemStack sulfur = new ItemStack(Material.GLOWSTONE_DUST,8);
        ItemMeta sulfur_meta = sulfur.getItemMeta();
        assert sulfur_meta != null;
        sulfur_meta.setDisplayName(ChatColor.GOLD+"硫磺");
        sulfur_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"硫"));
        sulfur.setItemMeta(sulfur_meta);
        ItemControl.sulfur = sulfur;
        ShapelessRecipe sulfur_rec = new ShapelessRecipe(NamespacedKey.minecraft("sulfur"),sulfur);
        sulfur_rec.addIngredient(Material.LAVA_BUCKET);
        Bukkit.addRecipe(sulfur_rec);
    }

    public static void Sulfuric_acid() {
        ItemStack sulfuric_acid = new ItemStack(Material.POTION);
        ItemMeta sulfuric_acid_meta = sulfuric_acid.getItemMeta();
        //PotionMeta meta = (PotionMeta) sulfuric_acid_meta;
        //meta.setBasePotionData(new PotionData(PotionType.INSTANT_DAMAGE, true, true));
        assert sulfuric_acid_meta != null;
        sulfuric_acid_meta.setDisplayName(ChatColor.GOLD+"硫酸");
        sulfuric_acid_meta.setLore(List.of(ChatColor.GOLD+"硫酸"));
        sulfuric_acid.setItemMeta(sulfuric_acid_meta);
        ItemControl.sulfuric_acid = sulfuric_acid;
        ShapelessRecipe sulfuric_acid_rec = new ShapelessRecipe(NamespacedKey.minecraft("sulfuric_acid"),sulfuric_acid);
        sulfuric_acid_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.sulfur_dioxide));
        sulfuric_acid_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.hydrogen_peroxide));
        Bukkit.addRecipe(sulfuric_acid_rec);
    }

    public static void Sulfur_dioxide() {
        ItemStack sulfur_dioxide = new ItemStack(Material.GLASS_BOTTLE);
        ItemMeta sulfur_dioxide_meta = sulfur_dioxide.getItemMeta();
        assert sulfur_dioxide_meta != null;
        sulfur_dioxide_meta.setDisplayName(ChatColor.GOLD+"二氧化硫");
        sulfur_dioxide_meta.setLore(List.of(ChatColor.GOLD+"二氧化硫"));
        sulfur_dioxide.setItemMeta(sulfur_dioxide_meta);
        ItemControl.sulfur_dioxide = sulfur_dioxide;
        FurnaceRecipe sulfur_dioxide_rec = new FurnaceRecipe(NamespacedKey.minecraft("sulfur_dioxide"),sulfur_dioxide,new RecipeChoice.ExactChoice(ItemControl.sulfur),1f,5*20);
        Bukkit.addRecipe(sulfur_dioxide_rec);
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

    public static void Unstable_tnt() {
        ItemStack unstable_tnt = new ItemStack(Material.TNT);
        ItemMeta unstable_tnt_meta = unstable_tnt.getItemMeta();
        assert unstable_tnt_meta != null;
        BlockData unstable_tnt_data = ((BlockDataMeta) unstable_tnt_meta).getBlockData(Material.TNT);
        ((TNT) unstable_tnt_data).setUnstable(true);
        ((BlockDataMeta) unstable_tnt_meta).setBlockData(unstable_tnt_data);
        unstable_tnt_meta.setDisplayName(ChatColor.GOLD+"不穩定的炸藥");
        unstable_tnt_meta.setLore(List.of(ChatColor.LIGHT_PURPLE+"硝化甘油"));
        unstable_tnt.setItemMeta(unstable_tnt_meta);
        ItemControl.unstable_tnt = unstable_tnt;
        ShapelessRecipe unstable_tnt_rec = new ShapelessRecipe(NamespacedKey.minecraft("unstable_tnt"),unstable_tnt);
        unstable_tnt_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.nitric_acid));
        unstable_tnt_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.sulfuric_acid));
        unstable_tnt_rec.addIngredient(new RecipeChoice.ExactChoice(ItemControl.glycerol));
        Bukkit.addRecipe(unstable_tnt_rec);
    }
}