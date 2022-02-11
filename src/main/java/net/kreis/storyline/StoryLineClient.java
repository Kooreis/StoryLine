package net.kreis.storyline;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.impl.client.particle.ParticleFactoryRegistryImpl;
import net.kreis.storyline.particle.ModParticles;
import net.kreis.storyline.particle.custom.MusicalParticle;

public class StoryLineClient implements ClientModInitializer{
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ModParticles.MUSICAL_PARTICLE, MusicalParticle.Factory::new);
    }
}
