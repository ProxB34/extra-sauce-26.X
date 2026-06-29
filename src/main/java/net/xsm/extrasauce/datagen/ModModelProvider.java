package net.xsm.extrasauce.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.xsm.extrasauce.block.ModBlocks;
import net.xsm.extrasauce.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.EXTRASAUCEBLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.EXTRASAUCE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLORAL_SCYTHE, ModelTemplates.FLAT_ITEM);
    }
}
