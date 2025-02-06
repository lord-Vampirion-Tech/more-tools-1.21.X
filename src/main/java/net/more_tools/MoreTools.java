package net.more_tools;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.more_tools.block.ModBlocks;
import net.more_tools.item.ModItemGroups;
import net.more_tools.item.ModItems;
import net.more_tools.util.CustomUsageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreTools implements ModInitializer {
	public static final String MOD_ID = "more_tools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerModItems();


		PlayerBlockBreakEvents.BEFORE.register(new CustomUsageEvent());
	}
}