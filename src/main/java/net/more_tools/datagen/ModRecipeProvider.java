package net.more_tools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.more_tools.MoreTools;
import net.more_tools.item.ModItems;
import net.minecraft.data.server.recipe.*;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;


import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static void generateShapedRecipeToolRecipe(RecipeExporter exporter, Item resultItem, Item baseTool, TagKey<Item> tagItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, resultItem)
                .pattern("#x#")
                .pattern(" / ")
                .pattern(" / ")
                .input('#', tagItem)
                .input('x', baseTool)
                .input('/', Items.STICK)
                .criterion("", RecipeProvider.conditionsFromTag(tagItem))
                .criterion("", RecipeProvider.conditionsFromItem(baseTool))
                .criterion("", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
    }
    public static void generateShapedRecipeToolRecipe(RecipeExporter exporter, Item resultItem, Item baseTool, Item resource) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, resultItem)
                .pattern("#x#")
                .pattern(" / ")
                .pattern(" / ")
                .input('#', resource)
                .input('x', baseTool)
                .input('/', Items.STICK)
                .criterion("", RecipeProvider.conditionsFromItem(resource))
                .criterion("", RecipeProvider.conditionsFromItem(baseTool))
                .criterion("", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
    }
    public static void generateSmithingTransformToolRecipe(RecipeExporter exporter, Item template, Item base, Item addition, Item result, RecipeCategory recipeCategory) {
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(template), // Шаблон
                        Ingredient.ofItems(base), // База
                        Ingredient.ofItems(addition), // Дополнительный материал
                        recipeCategory,// Категория крафта
                        result)// Результат
                .criterion(hasItem(base), conditionsFromItem(base))
                .criterion(hasItem(addition), conditionsFromItem(addition))
                .criterion(hasItem(result), conditionsFromItem(result))
                .offerTo(exporter, result.getName().getString().replace("item."+ MoreTools.MOD_ID +".", "") + "_smithing");
    }

    @Override
    public void generate(RecipeExporter exporter) {
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_BIG_SHOVEL, Items.NETHERITE_BLOCK, ModItems.NETHERITE_BIG_SHOVEL, RecipeCategory.TOOLS);
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_BIG_SHOVEL_LVL_2, Items.NETHERITE_BLOCK, ModItems.NETHERITE_BIG_SHOVEL_LVL_2, RecipeCategory.TOOLS);
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.NETHERITE_BIG_SHOVEL_LVL_2, Items.NETHERITE_BLOCK, ModItems.NETHERITE_BIG_SHOVEL_LVL_3, RecipeCategory.TOOLS);

        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_CLEAVER, Items.NETHERITE_BLOCK, ModItems.NETHERITE_CLEAVER, RecipeCategory.TOOLS);
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_CLEAVER_LVL_2, Items.NETHERITE_BLOCK, ModItems.NETHERITE_CLEAVER_LVL_2, RecipeCategory.TOOLS);
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.NETHERITE_CLEAVER_LVL_2, Items.NETHERITE_BLOCK, ModItems.NETHERITE_CLEAVER_LVL_3, RecipeCategory.TOOLS);

        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_HAMMER, Items.NETHERITE_BLOCK, ModItems.NETHERITE_HAMMER, RecipeCategory.TOOLS);
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_HAMMER_LVL_2, Items.NETHERITE_BLOCK, ModItems.NETHERITE_HAMMER_LVL_2, RecipeCategory.TOOLS);
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.NETHERITE_HAMMER_LVL_2, Items.NETHERITE_BLOCK, ModItems.NETHERITE_HAMMER_LVL_3, RecipeCategory.TOOLS);

        generateShapedRecipeToolRecipe(exporter, ModItems.STONE_BIG_SHOVEL, Items.STONE_SHOVEL, ItemTags.STONE_CRAFTING_MATERIALS);
        generateShapedRecipeToolRecipe(exporter, ModItems.COPPER_BIG_SHOVEL, ModItems.COPPER_SHOVEL, Items.COPPER_INGOT);
        generateShapedRecipeToolRecipe(exporter, ModItems.IRON_BIG_SHOVEL, Items.IRON_SHOVEL, Items.IRON_BLOCK);
        generateShapedRecipeToolRecipe(exporter, ModItems.IRON_BIG_SHOVEL_LVL_2, Items.IRON_SHOVEL, Items.IRON_BLOCK);
        generateShapedRecipeToolRecipe(exporter, ModItems.GOLD_BIG_SHOVEL, Items.GOLDEN_SHOVEL, Items.GOLD_BLOCK);
        generateShapedRecipeToolRecipe(exporter, ModItems.DIAMOND_BIG_SHOVEL, Items.DIAMOND_SHOVEL, Items.DIAMOND_BLOCK);
        generateShapedRecipeToolRecipe(exporter, ModItems.DIAMOND_BIG_SHOVEL_LVL_2, Items.DIAMOND_SHOVEL, Items.DIAMOND_BLOCK);

        generateShapedRecipeToolRecipe(exporter, ModItems.STONE_CLEAVER, Items.STONE_AXE, ItemTags.STONE_CRAFTING_MATERIALS);
        generateShapedRecipeToolRecipe(exporter, ModItems.COPPER_CLEAVER, ModItems.COPPER_SHOVEL, Items.COPPER_INGOT);
        generateShapedRecipeToolRecipe(exporter, ModItems.IRON_CLEAVER, Items.IRON_AXE, Items.IRON_BLOCK);
        generateShapedRecipeToolRecipe(exporter, ModItems.IRON_CLEAVER_LVL_2, Items.IRON_AXE, Items.IRON_BLOCK);
        generateShapedRecipeToolRecipe(exporter, ModItems.GOLD_CLEAVER, Items.GOLDEN_AXE,Items.GOLD_BLOCK);
        generateShapedRecipeToolRecipe(exporter, ModItems.DIAMOND_CLEAVER, Items.DIAMOND_AXE,Items.DIAMOND_BLOCK);
        generateShapedRecipeToolRecipe(exporter, ModItems.DIAMOND_CLEAVER_LVL_2, Items.DIAMOND_AXE,Items.DIAMOND_BLOCK);

        generateShapedRecipeToolRecipe(exporter, ModItems.STONE_HAMMER, Items.STONE_PICKAXE, ItemTags.STONE_CRAFTING_MATERIALS);
        generateShapedRecipeToolRecipe(exporter, ModItems.COPPER_HAMMER, ModItems.COPPER_PICKAXE, Items.COPPER_INGOT);
        generateShapedRecipeToolRecipe(exporter, ModItems.IRON_HAMMER, Items.IRON_PICKAXE, Items.IRON_BLOCK);
        generateShapedRecipeToolRecipe(exporter, ModItems.IRON_HAMMER_LVL_2, Items.IRON_PICKAXE, Items.IRON_BLOCK);
        generateShapedRecipeToolRecipe(exporter, ModItems.GOLD_HAMMER, Items.GOLDEN_PICKAXE, Items.GOLD_BLOCK);
        generateShapedRecipeToolRecipe(exporter, ModItems.DIAMOND_HAMMER, Items.DIAMOND_PICKAXE, Items.DIAMOND_BLOCK);
        generateShapedRecipeToolRecipe(exporter, ModItems.DIAMOND_HAMMER_LVL_2, Items.DIAMOND_PICKAXE, Items.DIAMOND_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL)
                .pattern("#")
                .pattern("/")
                .pattern("/")
                .input('#', Items.COPPER_INGOT)
                .input('/', Items.STICK)
                .criterion("has_planks", RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion("has_stick", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_AXE)
                .pattern("##")
                .pattern("#/")
                .pattern(" /")
                .input('#', Items.COPPER_INGOT)
                .input('/', Items.STICK)
                .criterion("",RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion("",RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE)
                .pattern("###")
                .pattern(" / ")
                .pattern(" / ")
                .input('#', Items.COPPER_INGOT)
                .input('/', Items.STICK)
                .criterion("",RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion("",RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HOE)
                .pattern("##")
                .pattern(" /")
                .pattern(" /")
                .input('#', Items.COPPER_INGOT)
                .input('/', Items.STICK)
                .criterion("",RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion("",RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SWORD)
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .input('#', Items.COPPER_INGOT)
                .input('/', Items.STICK)
                .criterion("",RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion("",RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
    }
}
