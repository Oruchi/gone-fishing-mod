package com.oruchi.gonefishing;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoneFishingMod implements ModInitializer {
	public static final String MOD_ID = "gonefishing";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
	LOGGER.info("Gone Fishing, ENJOY!");
	}
}