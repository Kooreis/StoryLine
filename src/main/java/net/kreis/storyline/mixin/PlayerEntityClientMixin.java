package net.kreis.storyline.mixin;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.kreis.storyline.effect.ModEffects;
import net.kreis.storyline.effect.StaticEffect;
import net.kreis.storyline.overlay.OverlayManager;
import net.kreis.storyline.overlay.PlayerEntityOverlay;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class PlayerEntityClientMixin {
    @Unique
    @Environment(EnvType.CLIENT)
    @Inject(method = "tickMovement", at=@At("HEAD"))
    public void tick(CallbackInfo ci) {
        float value = MathHelper.sin(((PlayerEntityOverlay) this).getStatic() * MathHelper.HALF_PI);
        OverlayManager.show(OverlayManager.STATIC, value);
    }
}
