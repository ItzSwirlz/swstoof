package com.github.itzswirlz.swstoof;

import org.quiltmc.loader.api.ModContainer;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SWSTOOFParticles {
    public static final DefaultParticleType COPPER_FIRE_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType IRON_FIRE_FLAME = FabricParticleTypes.simple();

    public static void registerFireParticles(ModContainer mod) {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(mod.metadata().id(), "copper_fire_flame"), COPPER_FIRE_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(mod.metadata().id(), "iron_fire_flame"), IRON_FIRE_FLAME);
    }
}
