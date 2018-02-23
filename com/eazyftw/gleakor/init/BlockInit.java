package com.eazyftw.gleakor.init;

import com.eazyftw.gleakor.objects.blocks.BlockBase;
import com.eazyftw.gleakor.objects.blocks.BlockBaseCustom;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block BLOCK_GLEAKOR = new BlockBase("block_gleakor", Material.IRON);

    public static final Block BLOCK_PILE_OF_DIRT = new BlockBaseCustom("block_pile_of_dirt", Material.GOURD);

}