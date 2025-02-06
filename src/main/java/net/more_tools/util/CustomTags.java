package net.more_tools.util;

import net.more_tools.MoreTools;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class CustomTags {
    public static class Blocks {
        public static final TagKey<Block> MULTI_TOOL_MINEABLE = createTag("multi_tool_mineable");
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MoreTools.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> BIG_SHOVELS = createTag("big_shovels");
        public static final TagKey<Item> CLEAVERS = createTag("cleavers");
        public static final TagKey<Item> HAMMERS = createTag("hammers");
        public static final TagKey<Item> BIG_HOES = createTag("big_hoe");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreTools.MOD_ID, name));
        }
    }
}
