package net.more_tools.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.more_tools.MoreTools;
import net.more_tools.item.custom.*;
import net.more_tools.util.CustomEnumToolMaterials;
import net.more_tools.util.CustomTags;


import static net.more_tools.util.CustomToolMaterials.CUSTOM;

public class ModItems {

    public static final Item STONE_BIG_SHOVEL = registerItem("stone_big_shovel", new Custom_Shovel(CUSTOM(ToolMaterials.STONE,2),1.5f,-3.0F, BlockTags.SHOVEL_MINEABLE, new Item.Settings(),1,0));
    public static final Item STONE_CLEAVER = registerItem("stone_cleaver", new Custom_Axe(CUSTOM(ToolMaterials.STONE,2),7.0F,-3.2F, BlockTags.AXE_MINEABLE, new Item.Settings(),1,0));
    public static final Item STONE_HAMMER = registerItem("stone_hammer", new Custom_Pickaxe(CUSTOM(ToolMaterials.STONE,2),1.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, new Item.Settings(),1,0));
    public static final Item STONE_BIG_HOE = registerItem("stone_big_hoe", new Custom_Hoe(CUSTOM(ToolMaterials.STONE,2),-1.0F,-2.0F, BlockTags.HOE_MINEABLE, new Item.Settings(),1,0));

    public static final Item STONE_OMNI_TOOL = registerItem("stone_omni_tool", new Omni_tool(CUSTOM(ToolMaterials.STONE,1.5f),1F,-1.0F, CustomTags.Blocks.MULTI_TOOL_MINEABLE, new Item.Settings()));

    public static final Item COPPER_SHOVEL = registerItem_2("copper_shovel", new ShovelItem(CustomEnumToolMaterials.COPPER,new Item.Settings().attributeModifiers(MiningToolItem.createAttributeModifiers(CustomEnumToolMaterials.COPPER, 1.5f, -3.0f))), ItemGroups.TOOLS,Items.IRON_SHOVEL);
    public static final Item COPPER_PICKAXE = registerItem_2("copper_pickaxe",new PickaxeItem(CustomEnumToolMaterials.COPPER,new Item.Settings().attributeModifiers(MiningToolItem.createAttributeModifiers(CustomEnumToolMaterials.COPPER, 1.5f, -2.8f))), ItemGroups.TOOLS,Items.IRON_SHOVEL);
    public static final Item COPPER_AXE = registerItem_2("copper_axe",new AxeItem(CustomEnumToolMaterials.COPPER,new Item.Settings().attributeModifiers(MiningToolItem.createAttributeModifiers(CustomEnumToolMaterials.COPPER, 7f, -3.2f))), ItemGroups.TOOLS,Items.IRON_SHOVEL);
    public static final Item COPPER_HOE = registerItem_2("copper_hoe",new HoeItem(CustomEnumToolMaterials.COPPER,new Item.Settings().attributeModifiers(MiningToolItem.createAttributeModifiers(CustomEnumToolMaterials.COPPER, -1f, -1.0f))), ItemGroups.TOOLS,Items.IRON_SHOVEL);
    public static final Item COPPER_SWORD = registerItem_2("copper_sword",new SwordItem(CustomEnumToolMaterials.COPPER,new Item.Settings().attributeModifiers(MiningToolItem.createAttributeModifiers(CustomEnumToolMaterials.COPPER, 3, -2.4f))), ItemGroups.COMBAT,Items.IRON_SWORD);

    public static final Item COPPER_BIG_SHOVEL = registerItem("copper_big_shovel", new Custom_Shovel(CUSTOM(CustomEnumToolMaterials.COPPER,2),1.5f,-3.0F, BlockTags.SHOVEL_MINEABLE, new Item.Settings(),1,0));
    public static final Item COPPER_CLEAVER = registerItem("copper_cleaver", new Custom_Axe(CUSTOM(CustomEnumToolMaterials.COPPER,2),7.5F,-3.2F, BlockTags.AXE_MINEABLE, new Item.Settings(),1,0));
    public static final Item COPPER_HAMMER = registerItem("copper_hammer", new Custom_Pickaxe(CUSTOM(CustomEnumToolMaterials.COPPER,2),1.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, new Item.Settings(),1,0));
    public static final Item COPPER_BIG_HOE = registerItem("copper_big_hoe", new Custom_Hoe(CUSTOM(CustomEnumToolMaterials.COPPER,2),-1.0F,-2.0F, BlockTags.HOE_MINEABLE, new Item.Settings(),1,0));

    public static final Item COPPER_OMNI_TOOL = registerItem("copper_omni_tool", new Omni_tool(CUSTOM(CustomEnumToolMaterials.COPPER,1.5f),1F,-1.0F, CustomTags.Blocks.MULTI_TOOL_MINEABLE, new Item.Settings()));

    public static final Item IRON_BIG_SHOVEL = registerItem("iron_big_shovel", new Custom_Shovel(CUSTOM(ToolMaterials.IRON,2),1.5f,-3.0F, BlockTags.SHOVEL_MINEABLE, new Item.Settings()));
    public static final Item IRON_CLEAVER = registerItem("iron_cleaver", new Custom_Axe(CUSTOM(ToolMaterials.IRON,2),6.0F,-3.1F, BlockTags.AXE_MINEABLE, new Item.Settings()));
    public static final Item IRON_HAMMER = registerItem("iron_hammer", new Custom_Pickaxe(CUSTOM(ToolMaterials.IRON,2),1.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, new Item.Settings()));
    public static final Item IRON_BIG_HOE = registerItem("iron_big_hoe", new Custom_Hoe(CUSTOM(ToolMaterials.IRON,2),-1.0F,-2.0F, BlockTags.HOE_MINEABLE, new Item.Settings()));

    public static final Item IRON_OMNI_TOOL = registerItem("iron_omni_tool", new Omni_tool(CUSTOM(ToolMaterials.IRON,1.5f),1F,-1.0F, CustomTags.Blocks.MULTI_TOOL_MINEABLE, new Item.Settings()));

    public static final Item IRON_BIG_SHOVEL_LVL_2 = registerItem("iron_big_shovel_lvl_2", new Custom_Shovel(CUSTOM(ToolMaterials.IRON,2),1.5f,-3.0F, BlockTags.SHOVEL_MINEABLE, new Item.Settings(),2));
    public static final Item IRON_CLEAVER_LVL_2 = registerItem("iron_cleaver_lvl_2", new Custom_Axe(CUSTOM(ToolMaterials.IRON,2),6.0F,-3.1F, BlockTags.AXE_MINEABLE, new Item.Settings(),2));
    public static final Item IRON_HAMMER_LVL_2 = registerItem("iron_hammer_lvl_2", new Custom_Pickaxe(CUSTOM(ToolMaterials.IRON,2),1.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, new Item.Settings(),2));
    public static final Item IRON_BIG_HOE_LVL_2 = registerItem("iron_big_hoe_lvl_2", new Custom_Hoe(CUSTOM(ToolMaterials.IRON,2),-1.0F,-2.0F, BlockTags.HOE_MINEABLE, new Item.Settings(),2));

    public static final Item GOLD_BIG_SHOVEL = registerItem("gold_big_shovel", new Custom_Shovel(CUSTOM(ToolMaterials.GOLD,2),1.5f,-3.0F, BlockTags.SHOVEL_MINEABLE, new Item.Settings()));
    public static final Item GOLD_CLEAVER = registerItem("gold_cleaver", new Custom_Axe(CUSTOM(ToolMaterials.GOLD,2),6.0F,-3.0F, BlockTags.AXE_MINEABLE, new Item.Settings()));
    public static final Item GOLD_HAMMER = registerItem("gold_hammer", new Custom_Pickaxe(CUSTOM(ToolMaterials.GOLD,2),1.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, new Item.Settings()));
    public static final Item GOLD_BIG_HOE = registerItem("gold_big_hoe", new Custom_Hoe(CUSTOM(ToolMaterials.GOLD,2),-1.0F,-2.0F, BlockTags.HOE_MINEABLE, new Item.Settings(),2));

    public static final Item GOLD_OMNI_TOOL = registerItem("gold_omni_tool", new Omni_tool(CUSTOM(ToolMaterials.GOLD,1.5f),1F,-1.0F, CustomTags.Blocks.MULTI_TOOL_MINEABLE, new Item.Settings()));

    public static final Item DIAMOND_BIG_SHOVEL = registerItem("diamond_big_shovel", new Custom_Shovel(CUSTOM(ToolMaterials.DIAMOND,2,-1f),1.5f,-3.0F, BlockTags.SHOVEL_MINEABLE, new Item.Settings()));
    public static final Item DIAMOND_CLEAVER = registerItem("diamond_cleaver", new Custom_Axe(CUSTOM(ToolMaterials.DIAMOND,2,-1f),5.0F,-3.0F, BlockTags.AXE_MINEABLE, new Item.Settings()));
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer", new Custom_Pickaxe(CUSTOM(ToolMaterials.DIAMOND,2,-1f),1.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, new Item.Settings()));
    public static final Item DIAMOND_BIG_HOE = registerItem("diamond_big_hoe", new Custom_Hoe(CUSTOM(ToolMaterials.DIAMOND,2),-1.0F,-2.0F, BlockTags.HOE_MINEABLE, new Item.Settings()));

    public static final Item DIAMOND_OMNI_TOOL = registerItem("diamond_omni_tool", new Omni_tool(CUSTOM(ToolMaterials.GOLD,1.5f),1F,-1.0F, CustomTags.Blocks.MULTI_TOOL_MINEABLE, new Item.Settings()));

    public static final Item DIAMOND_BIG_SHOVEL_LVL_2 = registerItem("diamond_big_shovel_lvl_2", new Custom_Shovel(CUSTOM(ToolMaterials.DIAMOND,2,-1f),1.5f,-3.0F, BlockTags.SHOVEL_MINEABLE, new Item.Settings(),2));
    public static final Item DIAMOND_CLEAVER_LVL_2 = registerItem("diamond_cleaver_lvl_2", new Custom_Axe(CUSTOM(ToolMaterials.DIAMOND,2,-1f),5.0F,-3.0F, BlockTags.AXE_MINEABLE, new Item.Settings(),2));
    public static final Item DIAMOND_HAMMER_LVL_2 = registerItem("diamond_hammer_lvl_2", new Custom_Pickaxe(CUSTOM(ToolMaterials.DIAMOND,2,-1f),1.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, new Item.Settings(),2));
    public static final Item DIAMOND_BIG_HOE_LVL_2 = registerItem("diamond_big_hoe_lvl_2", new Custom_Hoe(CUSTOM(ToolMaterials.DIAMOND,2),-1.0F,-2.0F, BlockTags.HOE_MINEABLE, new Item.Settings(),2));

    public static final Item NETHERITE_BIG_SHOVEL = registerItem("netherite_big_shovel", new Custom_Shovel(CUSTOM(ToolMaterials.NETHERITE,2,-1f),1.5f,-3.0F, BlockTags.SHOVEL_MINEABLE, new Item.Settings()));
    public static final Item NETHERITE_CLEAVER = registerItem("netherite_cleaver", new Custom_Axe(CUSTOM(ToolMaterials.NETHERITE,2,-1f),5.0F,-3.0F, BlockTags.AXE_MINEABLE, new Item.Settings()));
    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer", new Custom_Pickaxe(CUSTOM(ToolMaterials.NETHERITE,2,-1f),1.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, new Item.Settings()));
    public static final Item NETHERITE_BIG_HOE = registerItem("netherite_big_hoe", new Custom_Hoe(CUSTOM(ToolMaterials.NETHERITE,2),-1.0F,-2.0F, BlockTags.HOE_MINEABLE, new Item.Settings()));

    public static final Item NETHERITE_OMNI_TOOL = registerItem("netherite_omni_tool", new Omni_tool(CUSTOM(ToolMaterials.GOLD,1.5f),1F,-1.0F, CustomTags.Blocks.MULTI_TOOL_MINEABLE, new Item.Settings()));

    public static final Item NETHERITE_BIG_SHOVEL_LVL_2 = registerItem("netherite_big_shovel_lvl_2", new Custom_Shovel(CUSTOM(ToolMaterials.NETHERITE,2,-1f),1.5f,-3.0F, BlockTags.SHOVEL_MINEABLE, new Item.Settings(),2));
    public static final Item NETHERITE_CLEAVER_LVL_2 = registerItem("netherite_cleaver_lvl_2", new Custom_Axe(CUSTOM(ToolMaterials.NETHERITE,2,-1f),5.0F,-3.0F, BlockTags.AXE_MINEABLE, new Item.Settings(),2));
    public static final Item NETHERITE_HAMMER_LVL_2 = registerItem("netherite_hammer_lvl_2", new Custom_Pickaxe(CUSTOM(ToolMaterials.NETHERITE,2,-1f),1.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, new Item.Settings(),2));
    public static final Item NETHERITE_BIG_HOE_LVL_2 = registerItem("netherite_big_hoe_lvl_2", new Custom_Hoe(CUSTOM(ToolMaterials.NETHERITE,2),-1.0F,-2.0F, BlockTags.HOE_MINEABLE, new Item.Settings(),2));

    public static final Item NETHERITE_BIG_SHOVEL_LVL_3 = registerItem("netherite_big_shovel_lvl_3", new Custom_Shovel(CUSTOM(ToolMaterials.NETHERITE,2,-1f),1.5f,-3.0F, BlockTags.SHOVEL_MINEABLE, new Item.Settings(),3,1));
    public static final Item NETHERITE_CLEAVER_LVL_3 = registerItem("netherite_cleaver_lvl_3", new Custom_Axe(CUSTOM(ToolMaterials.NETHERITE,2,-1f),5.0F,-3.0F, BlockTags.AXE_MINEABLE, new Item.Settings(),3,1));
    public static final Item NETHERITE_HAMMER_LVL_3 = registerItem("netherite_hammer_lvl_3", new Custom_Pickaxe(CUSTOM(ToolMaterials.NETHERITE,2,-1f),1.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, new Item.Settings(),3,1));
    public static final Item NETHERITE_BIG_HOE_LVL_3 = registerItem("netherite_big_hoe_lvl_3", new Custom_Hoe(CUSTOM(ToolMaterials.NETHERITE,2),-1.0F,-2.0F, BlockTags.HOE_MINEABLE, new Item.Settings(),3,1));

    static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreTools.MOD_ID, name), item);
    }
    static Item registerItem_2(String name, Item item, RegistryKey<ItemGroup> group, Item afterItem) {
        Item registeredItem = Registry.register(Registries.ITEM, Identifier.of(MoreTools.MOD_ID, name), item);
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.addBefore(afterItem, registeredItem));
        return registeredItem;
    }


    public static void registerModItems() {
        MoreTools.LOGGER.info("Регистарция модовых предметов: "+ MoreTools.MOD_ID);
    }
}
