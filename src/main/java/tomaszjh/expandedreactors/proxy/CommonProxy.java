package tomaszjh.expandedreactors.proxy;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tomaszjh.expandedreactors.init.ERBlocks;
import tomaszjh.expandedreactors.init.ERItems;

public abstract class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {


        ERItems.register();
        ERBlocks.register();
    }

    public void openManualGui(ItemStack book) {

    }

}
