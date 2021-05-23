package tomaszjh.expandedreactors.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tomaszjh.expandedreactors.handler.RenderHandler;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        RenderHandler.init();
    }
}

