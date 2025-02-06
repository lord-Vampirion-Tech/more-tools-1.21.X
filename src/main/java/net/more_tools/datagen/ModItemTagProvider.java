package net.more_tools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.more_tools.item.ModItems;
import net.more_tools.util.CustomTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(CustomTags.Items.BIG_SHOVELS)
                .add(ModItems.STONE_BIG_SHOVEL)
                .add(ModItems.COPPER_BIG_SHOVEL)
                .add(ModItems.IRON_BIG_SHOVEL)
                .add(ModItems.IRON_BIG_SHOVEL_LVL_2)
                .add(ModItems.GOLD_BIG_SHOVEL)
                .add(ModItems.DIAMOND_BIG_SHOVEL)
                .add(ModItems.DIAMOND_BIG_SHOVEL_LVL_2)
                .add(ModItems.NETHERITE_BIG_SHOVEL)
                .add(ModItems.NETHERITE_BIG_SHOVEL_LVL_2)
                .add(ModItems.NETHERITE_BIG_SHOVEL_LVL_3);

        getOrCreateTagBuilder(CustomTags.Items.CLEAVERS)
                .add(ModItems.STONE_CLEAVER)
                .add(ModItems.COPPER_CLEAVER)
                .add(ModItems.IRON_CLEAVER)
                .add(ModItems.IRON_CLEAVER_LVL_2)
                .add(ModItems.GOLD_CLEAVER)
                .add(ModItems.DIAMOND_CLEAVER)
                .add(ModItems.DIAMOND_CLEAVER_LVL_2)
                .add(ModItems.NETHERITE_CLEAVER)
                .add(ModItems.NETHERITE_CLEAVER_LVL_2)
                .add(ModItems.NETHERITE_CLEAVER_LVL_3);

        getOrCreateTagBuilder(CustomTags.Items.HAMMERS)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.COPPER_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.IRON_HAMMER_LVL_2)
                .add(ModItems.GOLD_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.DIAMOND_HAMMER_LVL_2)
                .add(ModItems.NETHERITE_HAMMER)
                .add(ModItems.NETHERITE_HAMMER_LVL_2)
                .add(ModItems.NETHERITE_HAMMER_LVL_3);

        getOrCreateTagBuilder(CustomTags.Items.BIG_HOES)
                .add(ModItems.STONE_BIG_HOE)
                .add(ModItems.COPPER_BIG_HOE)
                .add(ModItems.IRON_BIG_HOE)
                .add(ModItems.IRON_BIG_HOE_LVL_2)
                .add(ModItems.GOLD_BIG_HOE)
                .add(ModItems.DIAMOND_BIG_HOE)
                .add(ModItems.DIAMOND_BIG_HOE_LVL_2)
                .add(ModItems.NETHERITE_BIG_HOE)
                .add(ModItems.NETHERITE_BIG_HOE_LVL_2)
                .add(ModItems.NETHERITE_BIG_HOE_LVL_3);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL)

                .add(ModItems.STONE_BIG_SHOVEL)
                .add(ModItems.COPPER_BIG_SHOVEL)
                .add(ModItems.IRON_BIG_SHOVEL)
                .add(ModItems.IRON_BIG_SHOVEL_LVL_2)
                .add(ModItems.GOLD_BIG_SHOVEL)
                .add(ModItems.DIAMOND_BIG_SHOVEL)
                .add(ModItems.DIAMOND_BIG_SHOVEL_LVL_2)
                .add(ModItems.NETHERITE_BIG_SHOVEL)
                .add(ModItems.NETHERITE_BIG_SHOVEL_LVL_2)
                .add(ModItems.NETHERITE_BIG_SHOVEL_LVL_3);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.COPPER_AXE)

                .add(ModItems.STONE_CLEAVER)
                .add(ModItems.COPPER_CLEAVER)
                .add(ModItems.IRON_CLEAVER)
                .add(ModItems.IRON_CLEAVER_LVL_2)
                .add(ModItems.GOLD_CLEAVER)
                .add(ModItems.DIAMOND_CLEAVER)
                .add(ModItems.DIAMOND_CLEAVER_LVL_2)
                .add(ModItems.NETHERITE_CLEAVER)
                .add(ModItems.NETHERITE_CLEAVER_LVL_2)
                .add(ModItems.NETHERITE_CLEAVER_LVL_3);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.COPPER_PICKAXE)

                .add(ModItems.STONE_HAMMER)
                .add(ModItems.COPPER_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.IRON_HAMMER_LVL_2)
                .add(ModItems.GOLD_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.DIAMOND_HAMMER_LVL_2)
                .add(ModItems.NETHERITE_HAMMER)
                .add(ModItems.NETHERITE_HAMMER_LVL_2)
                .add(ModItems.NETHERITE_HAMMER_LVL_3);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.COPPER_HOE)

                .add(ModItems.STONE_BIG_HOE)
                .add(ModItems.COPPER_BIG_HOE)
                .add(ModItems.IRON_BIG_HOE)
                .add(ModItems.IRON_BIG_HOE_LVL_2)
                .add(ModItems.GOLD_BIG_HOE)
                .add(ModItems.DIAMOND_BIG_HOE)
                .add(ModItems.DIAMOND_BIG_HOE_LVL_2)
                .add(ModItems.NETHERITE_BIG_HOE)
                .add(ModItems.NETHERITE_BIG_HOE_LVL_2)
                .add(ModItems.NETHERITE_BIG_HOE_LVL_3);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD)

                .add(ModItems.STONE_OMNI_TOOL)
                .add(ModItems.COPPER_OMNI_TOOL)
                .add(ModItems.IRON_OMNI_TOOL)
                .add(ModItems.GOLD_OMNI_TOOL)
                .add(ModItems.DIAMOND_OMNI_TOOL)
                .add(ModItems.NETHERITE_OMNI_TOOL);
    }
}
