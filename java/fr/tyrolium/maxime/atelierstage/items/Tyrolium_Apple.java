package fr.tyrolium.maxime.atelierstage.items;

import fr.tyrolium.maxime.atelierstage.Main;
import fr.tyrolium.maxime.atelierstage.init.ItemsMod;
import fr.tyrolium.maxime.atelierstage.util.handlers.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tyrolium_Apple extends Item implements IHasModel {

    private String name = "tyrolium_apple";

    public Tyrolium_Apple(){

        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(CreativeTabs.FOOD);

        ItemsMod.ITEMS.add(this);

    }

    @Override
    public void registerModels() {
        Main.proxy.registerModels(this, 0);
    }
}
