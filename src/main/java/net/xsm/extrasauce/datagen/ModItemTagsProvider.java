package net.xsm.extrasauce.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.xsm.extrasauce.item.ModItems;
import net.xsm.extrasauce.tags.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
//        valueLookupBuilder(ModTags.Items.MODDEDTAG_NAMES)
//                .add(ModItems.MODDEDITEM);
    }
}
