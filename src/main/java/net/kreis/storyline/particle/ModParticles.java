package net.kreis.storyline.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.kreis.storyline.StoryLine;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModParticles {
    public static final DefaultParticleType MUSICAL_PARTICLE = FabricParticleTypes.simple();
    public static void registerParticles() {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(StoryLine.MOD_ID, "musical_particle"),
        MUSICAL_PARTICLE);
    }
}
