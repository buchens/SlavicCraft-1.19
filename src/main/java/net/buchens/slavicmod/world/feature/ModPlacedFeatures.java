package net.buchens.slavicmod.world.feature;

import net.buchens.slavicmod.SlavicMod;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.core.Registry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;


import java.util.List;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, SlavicMod.MOD_ID);


    public static final RegistryObject<PlacedFeature> NICKEL_ORE_PLACED = PLACED_FEATURES.register("nickel_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NICKEL_ORE.getHolder().get(),
                    commmonOrePlacement( 8,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom( 0), VerticalAnchor.aboveBottom( 100)))));

    public static final RegistryObject<PlacedFeature> Vanadium_ORE_PLACED = PLACED_FEATURES.register("vanadium_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.Vanadium_Ore.getHolder().get(),
                    commmonOrePlacement( 4,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom( -60), VerticalAnchor.aboveBottom( 10)))));
    public static final RegistryObject<PlacedFeature> Chrome_ORE_PLACED = PLACED_FEATURES.register("chrome_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.Chorme_Ore.getHolder().get(),
                    commmonOrePlacement( 10,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom( 0), VerticalAnchor.aboveBottom( 100)))));
    public static final RegistryObject<PlacedFeature> Manganese_ORE_PLACED = PLACED_FEATURES.register("manganese_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.Manganese_Ore.getHolder().get(),
                    commmonOrePlacement( 8,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom( -10), VerticalAnchor.aboveBottom( 50)))));

    public static final RegistryObject<PlacedFeature> Silver_ORE_PLACED = PLACED_FEATURES.register("silver_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.Silver_Ore.getHolder().get(),
                    commmonOrePlacement( 5,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom( -10), VerticalAnchor.aboveBottom( 60)))));


    public static final RegistryObject<PlacedFeature> CELANDINE_PLACED = PLACED_FEATURES.register("celandine_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.Celandine.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> WHITE_MYRTLE_PLACED = PLACED_FEATURES.register("white_myrtle_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.White_myrtle.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> CORTINARIUS_PLACED = PLACED_FEATURES.register("cortinarius_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.Cortinarius.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> MOLEYARROW_PLACED = PLACED_FEATURES.register("moleyarrow_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.Moleyarrow.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> ALLSPICE_PLACED = PLACED_FEATURES.register("allspice_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.Allspice.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> VERBENA_PLACED = PLACED_FEATURES.register("verbena_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.Verbena.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));




    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_ ) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());

    }
    public static List<PlacementModifier> commmonOrePlacement(int p_195344_, PlacementModifier p_195345_ ) {
    return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }
    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_ ) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
