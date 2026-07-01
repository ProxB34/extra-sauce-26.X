package net.xsm.extrasauce.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.xsm.extrasauce.block.ModBlocks;
import net.xsm.extrasauce.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {

                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.EXTRASAUCE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXTRASAUCEBLOCK);
            }
        };
    }

    @Override
    public String getName() {
        return "ExtraSauceMod Recipes";
    }
}
