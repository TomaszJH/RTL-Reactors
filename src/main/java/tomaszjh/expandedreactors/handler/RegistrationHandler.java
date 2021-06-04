package tomaszjh.expandedreactors.handler;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import tomaszjh.expandedreactors.block.ERBlock;
import tomaszjh.expandedreactors.block.fluid.ERBlockFluid;
import tomaszjh.expandedreactors.item.ERItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//Used to clean up code in ERItems and ERBlocks
public class RegistrationHandler {

    private static final List<ERItem> ITEMS = new ArrayList<>();
    private static final List<ERBlock> BLOCKS = new ArrayList<>();

    public static void registerItems(Item item) {
        ForgeRegistries.ITEMS.register(item);
    }
    public static void register(ERItem item) {
        ITEMS.add(item);
    }

    public static void register(ERBlock block) {
        BLOCKS.add(block);
    }

    public static Collection<ERItem> getItems() {
        return ITEMS;
    }

    public static Collection<ERBlock> getBlocks() {
        return BLOCKS;
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    public static void registerRender(Block block) {

    }

    public static void registerBlock(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }


}
