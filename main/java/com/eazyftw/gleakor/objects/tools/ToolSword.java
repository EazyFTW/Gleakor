package com.eazyftw.gleakor.objects.tools;

import com.eazyftw.gleakor.Main;
import com.eazyftw.gleakor.init.ItemInit;
import com.eazyftw.gleakor.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

    public ToolSword(String name, ToolMaterial material) {

        super(material);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.TAB);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
