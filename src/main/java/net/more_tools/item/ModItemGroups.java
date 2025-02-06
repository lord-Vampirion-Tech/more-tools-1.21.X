package net.more_tools.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.more_tools.MoreTools;

public class ModItemGroups {
    public static final ItemGroup MORE_TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreTools.MOD_ID, "more_tools_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.NETHERITE_HAMMER))
                    .displayName(Text.translatable("more_tools.more_tools_group"))
                    .entries(((displayContext, entries) -> {

                        entries.add(ModItems.STONE_BIG_SHOVEL);
                        entries.add(ModItems.COPPER_BIG_SHOVEL);
                        entries.add(ModItems.IRON_BIG_SHOVEL);
                        entries.add(ModItems.IRON_BIG_SHOVEL_LVL_2);
                        entries.add(ModItems.GOLD_BIG_SHOVEL);
                        entries.add(ModItems.DIAMOND_BIG_SHOVEL);
                        entries.add(ModItems.DIAMOND_BIG_SHOVEL_LVL_2);
                        entries.add(ModItems.NETHERITE_BIG_SHOVEL);
                        entries.add(ModItems.NETHERITE_BIG_SHOVEL_LVL_2);
                        entries.add(ModItems.NETHERITE_BIG_SHOVEL_LVL_3);

                        entries.add(ModItems.STONE_CLEAVER);
                        entries.add(ModItems.COPPER_CLEAVER);
                        entries.add(ModItems.IRON_CLEAVER);
                        entries.add(ModItems.IRON_CLEAVER_LVL_2);
                        entries.add(ModItems.GOLD_CLEAVER);
                        entries.add(ModItems.DIAMOND_CLEAVER);
                        entries.add(ModItems.DIAMOND_CLEAVER_LVL_2);
                        entries.add(ModItems.NETHERITE_CLEAVER);
                        entries.add(ModItems.NETHERITE_CLEAVER_LVL_2);
                        entries.add(ModItems.NETHERITE_CLEAVER_LVL_3);

                        entries.add(ModItems.STONE_HAMMER);
                        entries.add(ModItems.COPPER_HAMMER);
                        entries.add(ModItems.IRON_HAMMER);
                        entries.add(ModItems.IRON_HAMMER_LVL_2);
                        entries.add(ModItems.GOLD_HAMMER);
                        entries.add(ModItems.DIAMOND_HAMMER);
                        entries.add(ModItems.DIAMOND_HAMMER_LVL_2);
                        entries.add(ModItems.NETHERITE_HAMMER);
                        entries.add(ModItems.NETHERITE_HAMMER_LVL_2);
                        entries.add(ModItems.NETHERITE_HAMMER_LVL_3);

                        entries.add(ModItems.STONE_BIG_HOE);
                        entries.add(ModItems.COPPER_BIG_HOE);
                        entries.add(ModItems.IRON_BIG_HOE);
                        entries.add(ModItems.IRON_BIG_HOE_LVL_2);
                        entries.add(ModItems.GOLD_BIG_HOE);
                        entries.add(ModItems.DIAMOND_BIG_HOE);
                        entries.add(ModItems.DIAMOND_BIG_HOE_LVL_2);
                        entries.add(ModItems.NETHERITE_BIG_HOE);
                        entries.add(ModItems.NETHERITE_BIG_HOE_LVL_2);
                        entries.add(ModItems.NETHERITE_BIG_HOE_LVL_3);

                        entries.add(ModItems.STONE_OMNI_TOOL);
                        entries.add(ModItems.COPPER_OMNI_TOOL);
                        entries.add(ModItems.IRON_OMNI_TOOL);
                        entries.add(ModItems.GOLD_OMNI_TOOL);
                        entries.add(ModItems.DIAMOND_OMNI_TOOL);
                        entries.add(ModItems.NETHERITE_OMNI_TOOL);
                    })).build());


    public static void registerModItems() {
        MoreTools.LOGGER.info("Регистарция модовый вкладки для предметов: "+ MoreTools.MOD_ID);
    }
}
