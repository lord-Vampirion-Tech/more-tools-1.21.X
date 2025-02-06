package net.more_tools.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.more_tools.MoreTools;

public class ModBlocks {
//    public static final Block MODEL_TOOL_BLOCK = registerBlock("model_tool_block",
//    new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block){
        registerModBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreTools.MOD_ID, name),block);
    }

    private static void registerModBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MoreTools.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MoreTools.LOGGER.info("Регистрация модовых блоков: "+ MoreTools.MOD_ID);
    }
}
