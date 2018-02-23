package com.eazyftw.gleakor.init;

import com.eazyftw.gleakor.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.client.FMLClientHandler;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block BLOCK_GLEAKOR = new BlockBase("block_gleakor", Material.IRON);

}