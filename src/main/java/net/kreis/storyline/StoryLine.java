package net.kreis.storyline;

import net.fabricmc.api.ModInitializer;
import net.kreis.storyline.item.items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StoryLine implements ModInitializer {
	public static final String MOD_ID = "storyline";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		items.registerItems();
		//This is registering the items in the storyline>item>items.class file.
	}
}
