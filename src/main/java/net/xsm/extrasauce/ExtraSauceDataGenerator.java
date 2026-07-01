package net.xsm.extrasauce;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.xsm.extrasauce.datagen.ModBlockLootTableProvider;
import net.xsm.extrasauce.datagen.ModBlockTagsProvider;
import net.xsm.extrasauce.datagen.ModModelProvider;
import net.xsm.extrasauce.datagen.ModRecipeProvider;

public class ExtraSauceDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
