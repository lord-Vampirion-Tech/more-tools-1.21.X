package net.more_tools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.more_tools.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MODEL_TOOL_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.STONE_BIG_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_BIG_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_BIG_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_BIG_SHOVEL_LVL_2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLD_BIG_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_BIG_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_BIG_SHOVEL_LVL_2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_BIG_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_BIG_SHOVEL_LVL_2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_BIG_SHOVEL_LVL_3, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STONE_CLEAVER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_CLEAVER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_CLEAVER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_CLEAVER_LVL_2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLD_CLEAVER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_CLEAVER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_CLEAVER_LVL_2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_CLEAVER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_CLEAVER_LVL_2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_CLEAVER_LVL_3, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STONE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_HAMMER_LVL_2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLD_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_HAMMER_LVL_2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_HAMMER_LVL_2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_HAMMER_LVL_3, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STONE_BIG_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_BIG_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_BIG_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_BIG_HOE_LVL_2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLD_BIG_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_BIG_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_BIG_HOE_LVL_2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_BIG_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_BIG_HOE_LVL_2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_BIG_HOE_LVL_3, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STONE_OMNI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_OMNI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_OMNI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLD_OMNI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_OMNI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_OMNI_TOOL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);

    }
}
