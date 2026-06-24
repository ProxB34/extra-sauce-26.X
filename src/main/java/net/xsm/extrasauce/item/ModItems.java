package net.xsm.extrasauce.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.xsm.extrasauce.ExtraSauce;

import java.util.function.Function;

//start adding modded items in ModItems
public class ModItems {

    public static final Item EXTRASAUCE = registerItem( "extrasauce", Item::new);


    public static final Item FLORAL_SCYTHE = registerItem("floral_scythe", Item::new);


    //register "helper" method
    private static Item registerItem(String name, Function<Item.Properties, Item> function){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ExtraSauce.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ExtraSauce.MOD_ID, name)))));
    }

    //register items in the creative menu (and place it into the appropriate category
    public static void registerModItems() {
        ExtraSauce.LOGGER.info("Registering Mod items for " + ExtraSauce.MOD_ID);

        //add INGREDIENT items
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(fabricCreativeModeTabOutput -> {
            fabricCreativeModeTabOutput.accept(EXTRASAUCE);
        });

        //add COMBAT items
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(fabricCreativeModeTabOutput -> {
            fabricCreativeModeTabOutput.accept(FLORAL_SCYTHE);
        });
    }
}
