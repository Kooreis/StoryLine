package net.kreis.storyline.overlay;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.kreis.storyline.StoryLine;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import java.util.Collection;

//The OverlayManager is responsible for influencing the player's perspective depending on their currently active potion effects.
//This was pulled from https://github.com/magistermaks/mod-stylishoccult/blob/master/src/main/java/net/darktree/stylishoccult/overlay/OverlayManager.java
@Environment(EnvType.CLIENT)
public class OverlayManager {
    private static float intensity = 0;
    private static Identifier texture;
    //In the original, it mentioned .NAMESPACE instead of .MOD_ID, but perhaps it means the same thing?
    //This is where you define the texture to be used along with each effect.
    public static final Identifier STATIC = new Identifier(StoryLine.MOD_ID, "textures/misc/static.png");
    public static void show(Identifier texture, float intensity) {
        OverlayManager.texture = texture;
        OverlayManager.intensity = intensity;
    }

    public static void hide() {
        OverlayManager.texture = null;
    }

    public static float getIntensity() {
        return intensity;
    }

    public static Identifier getTexture() {
        return OverlayManager.texture;
    }

}
