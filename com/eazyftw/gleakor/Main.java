package com.eazyftw.gleakor;

import com.eazyftw.gleakor.init.ItemInit;
import com.eazyftw.gleakor.proxy.CommonProxy;
import com.eazyftw.gleakor.tabs.GleakorTab;
import com.eazyftw.gleakor.util.Reference;
import com.sun.media.jfxmedia.logging.Logger;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import slimeknights.tconstruct.TinkerIntegration;
import slimeknights.tconstruct.library.MaterialIntegration;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.*;
import slimeknights.tconstruct.library.utils.HarvestLevels;
import slimeknights.tconstruct.tools.TinkerMaterials;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    public static final CreativeTabs TAB = new GleakorTab("gleakortab");

    @EventHandler
    public static void preInt(FMLPreInitializationEvent event) {
        if(Loader.isModLoaded("tconstruct")) {
            Logger.logMsg(0, "Tinkers' Construct found, loading materials.");
            addTCT();
        } else {
            Logger.logMsg(0, "Tinkers' Construct not found, ignoring.");
        }
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {}

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {}

    public static void addTCT() {
        Material gleakor = new Material("gleakor", 0x0FF00);
        TinkerMaterials.materials.add(gleakor);
        gleakor.setCraftable(true);
        gleakor.setRepresentativeItem(ItemInit.INGOT_GLEAKOR);
        TinkerRegistry.addMaterialStats(gleakor, new HeadMaterialStats(700, 5.00f, 2.00f, HarvestLevels.IRON), new HandleMaterialStats(0.50f, 280), new ExtraMaterialStats(150), new BowMaterialStats(0.5f, 1.5f, 7f));
    }
}
