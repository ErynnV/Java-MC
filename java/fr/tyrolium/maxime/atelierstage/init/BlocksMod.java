package fr.tyrolium.maxime.atelierstage.init;

import fr.tyrolium.maxime.atelierstage.blocks.LuckyBlock;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BlocksMod {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block LUCKY_BLOCK = new LuckyBlock();

    public static final Block TYROLIUM_TNT = new TyroliumTnt();
}
