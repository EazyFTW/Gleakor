package com.eazyftw.gleakor.tabs;

import com.eazyftw.gleakor.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GleakorTab extends CreativeTabs {

    public GleakorTab(String label) { super("gleakortab"); }
    public ItemStack getTabIconItem() { return new ItemStack(ItemInit.INGOT_GLEAKOR);}

}
