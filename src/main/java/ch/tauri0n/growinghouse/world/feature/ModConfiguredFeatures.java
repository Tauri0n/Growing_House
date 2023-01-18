package ch.tauri0n.growinghouse.world.feature;

import ch.tauri0n.growinghouse.GrowingHouse;
import com.google.common.base.Suppliers;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;
import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES.getRegistryName(), GrowingHouse.MODID);

    //public static final Supplier<List<OreConfiguration.TargetBlockState>> RANDOM_ORES = Suppliers.memoize(() -> List.of(
    //        OreConfiguration.target(OreFeatures.ORE_CLAY, Blocks.OAK_LOG.defaultBlockState())
    //))

    //public static final RegistryObject<ConfiguredFeature<?, ?>> SOME_ORE = CONFIGURED_FEATURES.register("some_ore", () ->
    //        new ConfiguredFeature<>(Feature.ORE, new OreConfiguration()))

    @SubscribeEvent
    public void register(IEventBus event) {
        CONFIGURED_FEATURES.register(event);
    }
}
