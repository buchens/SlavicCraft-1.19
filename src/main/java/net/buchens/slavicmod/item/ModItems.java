package net.buchens.slavicmod.item;

import net.buchens.slavicmod.SlavicMod;
import net.buchens.slavicmod.base.ModArmorMaterial;
import net.buchens.slavicmod.block.ModBlocks;
import net.buchens.slavicmod.entity.ModEntityTypes;
import net.buchens.slavicmod.item.custom.HolyHammerOfSvarozhits;
import net.buchens.slavicmod.item.custom.MightyHammerOfVeles;
import net.buchens.slavicmod.item.custom.PerunsLightningSword;
import net.buchens.slavicmod.item.custom.ReinforcedBoarArmorItem;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;





public class ModItems {


    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SlavicMod.MOD_ID);

    public static final RegistryObject<Item> MIGHTY_HAMMER_OF_VELES = ITEMS.register("mighty_hammer_of_veles",
            () -> new MightyHammerOfVeles(Tiers.VELES, 10, -3.0f, props() ) );
    public static final RegistryObject<Item> PERUNS_LIGHTNING_SWORD = ITEMS.register("peruns_lightning_sword",
            () -> new PerunsLightningSword(Tiers.PERUN, 8, -1.5f, props() ) );
    public static final RegistryObject<Item> HOLY_HAMMER_OF_SVAROZHITS = ITEMS.register("holy_hammer_of_svarozhits",
            () -> new HolyHammerOfSvarozhits(Tiers.SVAROZHITS, 9, -2.5f, props() ) );

    public static final RegistryObject<Item> ALCOHOL = ITEMS.register("alcohol",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB))) ;
    public static final RegistryObject<Item> CHAINMAILBRAID = ITEMS.register("chainmailbraid",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> WOLF_FUR = ITEMS.register("wolf_fur",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> WOLF_HELMET_COMPONENT = ITEMS.register("wolf_helmet_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> WOLF_CHESTPLATE_COMPONENT = ITEMS.register("wolf_chestplate_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> WOLF_LEGGINS_COMPONENT = ITEMS.register("wolf_leggins_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> WOLF_BOOTS_COMPONENT = ITEMS.register("wolf_boots_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BEAR_FUR = ITEMS.register("bear_fur",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BEAR_BOOTS_COMPONENT = ITEMS.register("bear_boots_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BEAR_LEGGINS_COMPONENT = ITEMS.register("bear_leggins_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BEAR_CHESTPLATE_COMPONENT = ITEMS.register("bear_chestplate_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BEAR_HELMET_COMPONENT = ITEMS.register("bear_helmet_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BOAR_FUR = ITEMS.register("boar_fur",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );

    public static final RegistryObject<Item> DROWNER_SPAWN_EGG = ITEMS.register("drowner_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DROWNER, 0x314E82, 0xFF9E24,
                    new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)));
    public static final RegistryObject<Item> WILD_HUNT_WARRIOR_SPAWN_EGG = ITEMS.register("wild_hunt_warrior_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.WILDHUNTWARRIOR, 0x243F34, 0x6C6377,
                    new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)));

    public static final RegistryObject<Item> DROWNER_BRAIN = ITEMS.register("drowner_brain",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BUCKET_GON_STEEL = ITEMS.register("bucket_gon_steel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );

    public static final RegistryObject<Item> BOAR_HELMET_COMPONENT = ITEMS.register("boar_helmet_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BOAR_CHESTPLATE_COMPONENT = ITEMS.register("boar_chestplate_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BOAR_LEGGINS_COMPONENT = ITEMS.register("boar_leggins_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> BOAR_BOOTS_COMPONENT = ITEMS.register("boar_boots_component",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> STEEL_WIRE = ITEMS.register("steel_wire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> CHROME_INGOT = ITEMS.register("chrome_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> RAW_CHROME = ITEMS.register("raw_chrome",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> MANGANESE_INGOT = ITEMS.register("manganese_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> RAW_MANGANESE = ITEMS.register("raw_manganese",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> RAW_STEEL = ITEMS.register("raw_steel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> RAW_VANADIUM = ITEMS.register("raw_vanadium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> VANADIUM_INGOT = ITEMS.register("vanadium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> GON_STEEL = ITEMS.register("gon_steel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );
    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );

    public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );

    public static final RegistryObject<Item> BERBERCANEFRUIT_SEED = ITEMS.register("berbercanefruit_seed",
            () -> new ItemNameBlockItem(ModBlocks.BERBERCANEFRUIT_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)) );

    public static final RegistryObject<Item> BERBERCANEFRUIT = ITEMS.register("berbercanefruit",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB)
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(2f).build() )) );
    public static final RegistryObject<SwordItem> BOAR_SWORD = ITEMS.register("boar_sword",
            () -> new SwordItem(Tiers.BOAR, 5, -2.0f, props() ) );

    public static final RegistryObject<ArmorItem> REINFORCED_BOAR_HELMET = ITEMS.register("reinforced_boar_helmet",
            () -> new ReinforcedBoarArmorItem(ArmorTiers.REINFORCED_BOAR, EquipmentSlot.HEAD, props() ) );
    public static final RegistryObject<ArmorItem> REINFORCED_BOAR_CHESTPLATE = ITEMS.register("reinforced_boar_chestplate",
            () -> new ReinforcedBoarArmorItem(ArmorTiers.REINFORCED_BOAR, EquipmentSlot.CHEST, props() ) );
    public static final RegistryObject<ArmorItem> REINFORCED_BOAR_LEGGINGS = ITEMS.register("reinforced_boar_leggings",
            () -> new ReinforcedBoarArmorItem(ArmorTiers.REINFORCED_BOAR, EquipmentSlot.LEGS, props() ) );
    public static final RegistryObject<ArmorItem> REINFORCED_BOAR_BOOTS = ITEMS.register("reinforced_boar_boots",
            () -> new ReinforcedBoarArmorItem(ArmorTiers.REINFORCED_BOAR, EquipmentSlot.FEET, props() ) );

    public static final RegistryObject<SwordItem> BEAR_SWORD = ITEMS.register("bear_sword",
            () -> new SwordItem(Tiers.BEAR, 5, -2.0f, props() ) );

    private static Item.Properties props() {
        return new Item.Properties().tab(ModCreativeModeTab.SLAVICCRAFT_TAB);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);



    }
    public static class Tiers {
        public static final Tier BOAR = new ForgeTier(
                4,
                2000,
                8f,
                1f,
                0,
                null,
                () -> Ingredient.of(ModItems.BOAR_FUR.get()));
        public static final Tier PERUN = new ForgeTier(
                10,
                2500,
                8f,
                4f,
                10,
                null,
                () -> Ingredient.of(ModBlocks.SILVER_BLOCK.get()));
        public static final Tier SVAROZHITS = new ForgeTier(
                5,
                2000,
                6f,
                4.5f,
                8,
                null,
                () -> Ingredient.of(ModBlocks.SILVER_BLOCK.get()));
        public static final Tier VELES = new ForgeTier(
                5,
                20000,
                0.1f,
                5f,
                5,
                null,
                () -> Ingredient.of(ModBlocks.STEEL_BLOCK.get()));
        public static final Tier BEAR = new ForgeTier(
                6,
                2500,
                8f,
                1.5f,
                10,
                null,
                () -> Ingredient.of(ModItems.BEAR_FUR.get()));
    }
    public static class ArmorTiers {
        public static final ArmorMaterial REINFORCED_BOAR = new ModArmorMaterial(
                "reinforced_boar",
                500,
                new int[]{3, 6, 8, 3},
                10,
                SoundEvents.ARMOR_EQUIP_CHAIN,
                0.0F,
                0.0F,
                () -> Ingredient.of(ModItems.BOAR_FUR.get())
        );


    }
}
