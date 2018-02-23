package com.eazyftw.gleakor.objects.blocks;

import com.eazyftw.gleakor.Main;
import com.eazyftw.gleakor.init.BlockInit;
import com.eazyftw.gleakor.init.ItemInit;
import com.eazyftw.gleakor.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material) {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.TAB);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}