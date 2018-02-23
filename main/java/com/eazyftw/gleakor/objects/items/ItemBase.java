package com.eazyftw.gleakor.objects.items;

import com.eazyftw.gleakor.Main;
import com.eazyftw.gleakor.init.ItemInit;
import com.eazyftw.gleakor.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {


    @Override
    public void registerModels() {
       Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.TAB);

        ItemInit.ITEMS.add(this);

    }

}
