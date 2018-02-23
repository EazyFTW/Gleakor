package com.eazyftw.gleakor.init;

import com.eazyftw.gleakor.objects.armor.ArmorBase;
import com.eazyftw.gleakor.objects.items.ItemGlowBase;
import com.eazyftw.gleakor.objects.tools.*;
import com.eazyftw.gleakor.objects.items.ItemBase;
import com.eazyftw.gleakor.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<>();

    //Material
    public static final Item.ToolMaterial TOOl_GLEAKOR = EnumHelper.addToolMaterial("tool_gleakor", 2, 280, 5.0f, 2.00f, 5);
    public static final ItemArmor.ArmorMaterial ARMOR_GLEAKOR = EnumHelper.addArmorMaterial("armor_gleakor", Reference.MODID + ":gleakor", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    //Items
    public static final Item INGOT_GLEAKOR = new ItemBase("ingot_gleakor");
    public static final Item INGOT_CHARGEDGLEAKOR = new ItemGlowBase("ingot_chargedgleakor");
    public static final Item NUGGET_GLEAKOR = new ItemBase("nugget_gleakor");

    //Tools
    public static final Item AXE_GLEAKOR = new ToolAxe("axe_gleakor", TOOl_GLEAKOR);
    public static final Item HOE_GLEAKOR = new ToolHoe("hoe_gleakor", TOOl_GLEAKOR);
    public static final Item PICKAXE_GLEAKOR = new ToolPickaxe("pickaxe_gleakor", TOOl_GLEAKOR);
    public static final Item SHOVEL_GLEAKOR = new ToolShovel("shovel_gleakor", TOOl_GLEAKOR);
    public static final Item SWORD_GLEAKOR = new ToolSword("sword_gleakor", TOOl_GLEAKOR);

    //Armor
    public static final Item HELMET_GLEAKOR = new ArmorBase("helmet_gleakor", ARMOR_GLEAKOR, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_GLEAKOR = new ArmorBase("chestplate_gleakor", ARMOR_GLEAKOR, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_GLEAKOR = new ArmorBase("leggings_gleakor", ARMOR_GLEAKOR, 1, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_GLEAKOR = new ArmorBase("boots_gleakor", ARMOR_GLEAKOR, 1, EntityEquipmentSlot.FEET);
}
