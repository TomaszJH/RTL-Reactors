package tomaszjh.expandedreactors;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import tomaszjh.expandedreactors.config.ERConfig;
import tomaszjh.expandedreactors.handler.RenderGuiHandler;
import tomaszjh.expandedreactors.init.ERItems;
import tomaszjh.expandedreactors.proxy.CommonProxy;
import tomaszjh.expandedreactors.refrence.Refrence;

@Mod(modid = Refrence.MOD_ID, name = Refrence.MOD_NAME, version = Refrence.VERSION, guiFactory = Refrence.GUI_FACTORY)
public class ExpandedReactors {

    @Instance(Refrence.MOD_ID)
    public static ExpandedReactors instance;

    @SidedProxy(clientSide = "tomaszjh.expandedreactors.proxy.ClientProxy", serverSide = "tomaszjh.expandedreactors.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        //ERConfig.init(event.getSuggestedConfigurationFile());
        //FMLCommonHandler.instance().bus().register(new ERConfig());
        proxy.preInit(event);


    }

    @EventHandler
    public void init(FMLInitializationEvent event) {


    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new RenderGuiHandler());

    }

}
