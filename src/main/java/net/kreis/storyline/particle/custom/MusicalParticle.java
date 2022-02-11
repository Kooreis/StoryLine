package net.kreis.storyline.particle.custom;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.entity.effect.StatusEffects;

public class MusicalParticle extends SpriteBillboardParticle {
    protected MusicalParticle(ClientWorld level, double xCoord, double yCoord, double zCoord,
                              SpriteProvider spriteSet, double xd, double yd, double zd) {
        super(level, xCoord, yCoord, zCoord, xd, yd, zd);

        this.velocityMultiplier = 8.6f; //Multiplying the Velocity lol
        this.x = xd;
        this.y = yd;
        this.z = zd;
        this.scale *= 0.75F; //This is how much we're scaling it up as it progresses.
        this.maxAge = 20; //This is how long the sprite exists for. (How long it ticks for)
        this.setSpriteForAge(spriteSet);

        this.red = 1f;
        this.green = 1f;
        this.blue = 1f;
    }
    //Causes the particle to fade out
    @Override
    public void tick() {
        super.tick();
        fadeOut();
    }

    private void fadeOut() {
        //This is a linear formula that makes it go from 1 to 0- making the age decrease until it reaches max age.
        //Very straight forward math but I'm a monkey
        this.alpha = (-(1/(float)maxAge) * age + 1);
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }
        //This next section is what creates the actual particle
    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider sprites;

        public Factory(SpriteProvider spriteSet) {
            this.sprites = spriteSet;
        }

        public Particle createParticle(DefaultParticleType particleType, ClientWorld level, double x, double y, double z,
                                                                                            double dx, double dy, double dz) {
         return new MusicalParticle(level, x, y, z, this.sprites, dx, dy, dz);
        }
    }
}
