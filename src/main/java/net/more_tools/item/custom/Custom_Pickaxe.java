package net.more_tools.item.custom;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.ArrayList;
import java.util.List;

public class Custom_Pickaxe extends MiningToolItem {
    private final int range;
    private final int deep;

    public Custom_Pickaxe(ToolMaterial material, float damage, float attackSpeed, TagKey<Block> blocksTag, Settings settings, int range, int deep) {
        super(material, blocksTag , settings.attributeModifiers(MiningToolItem.createAttributeModifiers(material, damage, attackSpeed)));
        this.range = range;
        this.deep = deep;
    }

    public Custom_Pickaxe(ToolMaterial material, float damage, float attackSpeed, TagKey<Block> blocksTag, Settings settings, int range) {
        this(material, damage, attackSpeed,blocksTag, settings, range, 0);
    }

    public Custom_Pickaxe(ToolMaterial material, float damage, float attackSpeed, TagKey<Block> blocksTag, Settings settings) {
        this(material, damage, attackSpeed,blocksTag, settings, 1, 0);
    }

    public int getRange() {return this.range;}
    public int getDeep() {return this.deep;}

    public static List<BlockPos> getBlocksToBeDestroyed(BlockPos initialBlockPos, PlayerEntity player) {
        List<BlockPos> positions = new ArrayList<>();
        HitResult hit = player.raycast(20, 0, false);
        if (hit.getType() == HitResult.Type.BLOCK) {

            BlockHitResult blockHit = (BlockHitResult) hit;
            ItemStack heldItem = player.getMainHandStack();
            if (!(heldItem.getItem() instanceof Custom_Pickaxe tool)) return positions;

            int Size = tool.getRange();
            int Deep = tool.getDeep();

            Direction side = blockHit.getSide();

                if (side == Direction.UP || side == Direction.DOWN) {
                    for (int x = -Size; x <= Size; x++)
                        for (int z = -Size; z <= Size; z++)
                            for (int y = 0; y <= Deep; y++) {
                                positions.add(initialBlockPos.add(x, side == Direction.UP ? -y : y, z));
                            }
                } else if (side == Direction.NORTH || side == Direction.SOUTH) {
                    for (int x = -Size; x <= Size; x++)
                        for (int z = 0; z <= Deep; z++)
                            for (int y = -1; y <= Size * 2 - 1; y++) {
                                positions.add(initialBlockPos.add(x, y, side == Direction.NORTH ? z : -z));
                            }
                } else if (side == Direction.EAST || side == Direction.WEST) {
                    for (int x = 0; x <= Deep; x++)
                        for (int z = -Size; z <= Size; z++)
                            for (int y = -1; y <= Size * 2 - 1; y++) {
                                positions.add(initialBlockPos.add(side == Direction.EAST ? -x : x, y, z));
                            }
                }
            }

        return positions;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.literal(Text.translatable("more_tools.Scope").getString() + ((range * 2) + 1) + "x" + ((range * 2) + 1) + "x" + (deep + 1)).formatted(Formatting.GRAY));
        super.appendTooltip(stack, context, tooltip, type);
    }
}