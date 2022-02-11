package net.kreis.storyline.effect;

import net.kreis.storyline.StoryLine;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEffects {
    public static StatusEffect STATIC;
    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(StoryLine.MOD_ID, name),
                new StaticEffect(StatusEffectCategory.HARMFUL, 3124687));
    }

    public static void registerEffects() {
        STATIC = registerStatusEffect("static");
    }
}
