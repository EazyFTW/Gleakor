package com.eazyftw.gleakor.objects.items;

import com.eazyftw.gleakor.Main;
import com.eazyftw.gleakor.init.ItemInit;
import com.eazyftw.gleakor.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGlowBase extends Item implements IHasModel {


    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }

    public ItemGlowBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.TAB);

        ItemInit.ITEMS.add(this);

    }

}
