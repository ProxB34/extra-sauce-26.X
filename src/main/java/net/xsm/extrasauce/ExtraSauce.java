package net.xsm.extrasauce;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.xsm.extrasauce.block.ModBlocks;
import net.xsm.extrasauce.creativemodetab.ModCreativeModeTabs;
import net.xsm.extrasauce.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtraSauce implements ModInitializer {
	public static final String MOD_ID = "extra-sauce";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}