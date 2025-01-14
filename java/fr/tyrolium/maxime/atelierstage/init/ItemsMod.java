package fr.tyrolium.maxime.atelierstage.init;

import fr.tyrolium.maxime.atelierstage.Global;
import fr.tyrolium.maxime.atelierstage.items.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;


@Mod.EventBusSubscriber(modid = Global.MODID)
public class ItemsMod {

        public static final List<Item> ITEMS = new ArrayList<Item>();

        /* NOS ITEMS */
        public static final Item TYROLIUM = new Tyrolium();
        public static final Item TYROLIUM_APPLE = new Tyrolium_Apple();
        public static final Item TYROLIUM_CARROT = new Tyrolium_Carrot();
        public static final ItemSword KARAMBIT_FADE = new Karambit_Fade();
        public static final ItemPickaxe SCAR = new Scar();
        public static final ItemTool MSR = new Msr();
        public static final ItemSpade M40A5 = new M40A5();
        public static final ItemHoe AK_47 = new AK_47();
        public static final ItemArmor TYROLIUM_HELMET = new TyroliumArmor(EntityEquipmentSlot.HEAD);
        public static final ItemArmor TYROLIUM_CHESTPLATE = new TyroliumArmor(EntityEquipmentSlot.CHEST);
        public static final ItemArmor TYROLIUM_LEGGINGS = new TyroliumArmor(EntityEquipmentSlot.LEGS);
        public static final ItemArmor TYROLIUM_BOOTS = new TyroliumArmor(EntityEquipmentSlot.FEET);
}
