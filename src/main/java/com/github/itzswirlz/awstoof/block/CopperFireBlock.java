package com.github.itzswirlz.awstoof.block;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

public class CopperFireBlock extends AbstractFireBlock {
    // TODO: Do we want copper fires to oxidize?
    public CopperFireBlock(Settings settings) {
        super(settings, 1.0F);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return isCopperBase(world.getBlockState(pos.down()));
    }

    // TODO: check we got every block
    public static boolean isCopperBase(BlockState state) {
        return state.getBlock().equals(Blocks.COPPER_BLOCK) ||
        state.getBlock().equals(Blocks.CUT_COPPER) ||
        state.getBlock().equals(Blocks.CUT_COPPER_SLAB) ||
        state.getBlock().equals(Blocks.CUT_COPPER_STAIRS) ||
        state.getBlock().equals(Blocks.DEEPSLATE_COPPER_ORE) ||
        state.getBlock().equals(Blocks.RAW_COPPER_BLOCK) ||
        state.getBlock().equals(Blocks.WAXED_COPPER_BLOCK) ||
        state.getBlock().equals(Blocks.EXPOSED_COPPER) ||
        state.getBlock().equals(Blocks.EXPOSED_CUT_COPPER) ||
        state.getBlock().equals(Blocks.EXPOSED_CUT_COPPER_SLAB) ||
        state.getBlock().equals(Blocks.EXPOSED_CUT_COPPER_STAIRS) ||
        state.getBlock().equals(Blocks.WAXED_EXPOSED_COPPER) ||
        state.getBlock().equals(Blocks.WAXED_EXPOSED_CUT_COPPER) ||
        state.getBlock().equals(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB) ||
        state.getBlock().equals(Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS) ||
        state.getBlock().equals(Blocks.WEATHERED_COPPER) ||
        state.getBlock().equals(Blocks.WEATHERED_CUT_COPPER) ||
        state.getBlock().equals(Blocks.WEATHERED_CUT_COPPER_SLAB) ||
        state.getBlock().equals(Blocks.WEATHERED_CUT_COPPER_STAIRS) ||
        state.getBlock().equals(Blocks.WAXED_WEATHERED_COPPER) ||
        state.getBlock().equals(Blocks.WAXED_WEATHERED_CUT_COPPER) ||
        state.getBlock().equals(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB) ||
        state.getBlock().equals(Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS) ||
        state.getBlock().equals(Blocks.OXIDIZED_COPPER) ||
        state.getBlock().equals(Blocks.OXIDIZED_CUT_COPPER) ||
        state.getBlock().equals(Blocks.OXIDIZED_CUT_COPPER_SLAB) ||
        state.getBlock().equals(Blocks.OXIDIZED_CUT_COPPER_STAIRS) ||
        state.getBlock().equals(Blocks.WAXED_OXIDIZED_COPPER) ||
        state.getBlock().equals(Blocks.WAXED_OXIDIZED_CUT_COPPER) ||
        state.getBlock().equals(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB) ||
        state.getBlock().equals(Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS);
    }

    @Override
    protected boolean isFlammable(BlockState state) {
        return true;
    }
}