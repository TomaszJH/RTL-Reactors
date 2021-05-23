package tomaszjh.expandedreactors.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tomaszjh.expandedreactors.creativetab.CreativeTab;
import tomaszjh.expandedreactors.init.ERBlocks;

public class ERBlock extends Block {

    private final String BASE_NAME;

    public ERBlock(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTab.ERTab);

        BASE_NAME = name;

        ERBlocks.register(this);
    }

    public ERBlock(String name) {
        this(name, Material.ROCK);
    }


}
