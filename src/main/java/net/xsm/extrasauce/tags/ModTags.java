package net.xsm.extrasauce.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.xsm.extrasauce.ExtraSauce;

public class ModTags {
    // Create tags relating to vanilla or modded blocks
    // e.g. Having blocks require a specific tool or material to be dropped
    public static class Blocks {
        public static final TagKey<Block> NEEDS_FLORAL_FLOWER_TOOL = createTag("needs_floral_flower_tool");
        public static final TagKey<Block> INCORRECT_FOR_FLORAL_FLOWER_TOOL = createTag("incorrect_for_floral_flower_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ExtraSauce.MOD_ID, name));
        }
    }

    // Tags relating to vanilla or modded items
    // e.g. Having modded tools and weapons be repairable, enchantable etc
    public static class Items {
        public static final TagKey<Item> FLORAL_REPAIR = createTag("floral_repair");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ExtraSauce.MOD_ID, name));
        }
    }
}
