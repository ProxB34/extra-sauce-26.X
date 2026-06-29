package net.xsm.extrasauce.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.xsm.extrasauce.ExtraSauce;
import net.xsm.extrasauce.item.ModItems;

public class ModCreativeModeTabs {
    //duplicate CreativeModeTab if other tabs are required (likely not to)
    //this adds creative mode tabs (duh) to access items in creative mode. ensure to add the translatable component in en_us.json
    public static final CreativeModeTab EXTRA_SAUCE_MOD_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ExtraSauce.MOD_ID, "extra_sauce_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EXTRASAUCE))
                    .title(Component.translatable("creativemodetab.extrasauce.extra_sauce_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.EXTRASAUCE);
                        output.accept(ModItems.FLORAL_SCYTHE);
                    }).build());

    public static void registerModCreativeModeTabs() {
        ExtraSauce.LOGGER.info("Registering Creative Mode Tabs for " + ExtraSauce.MOD_ID);
    }
}
