package net.more_tools.util;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.more_tools.item.custom.Custom_Pickaxe;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;

public class CustomUsageEvent implements PlayerBlockBreakEvents.Before {



    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    @Override
    public boolean beforeBlockBreak(World world, PlayerEntity player, BlockPos pos,
                                    BlockState state, @Nullable BlockEntity blockEntity) {
        return handleBlockBreak(world, player, pos);
    }

    private static boolean handleBlockBreak(World world, PlayerEntity player, BlockPos pos) {
        ItemStack mainHandItem = player.getMainHandStack();
        if (player.isSneaking()) {return true;}

        if (mainHandItem.getItem() instanceof Custom_Pickaxe tools && player instanceof ServerPlayerEntity serverPlayer) {
            if (!HARVESTED_BLOCKS.contains(pos)) {
                for (BlockPos position : Custom_Pickaxe.getBlocksToBeDestroyed(pos, serverPlayer)) {
                    if (pos != position && tools.isCorrectForDrops(mainHandItem, world.getBlockState(position))) {
                        HARVESTED_BLOCKS.add(position);
                        serverPlayer.interactionManager.tryBreakBlock(position);
                        HARVESTED_BLOCKS.remove(position);
                    }
                }
            }
        }
        return true;
    }
}
