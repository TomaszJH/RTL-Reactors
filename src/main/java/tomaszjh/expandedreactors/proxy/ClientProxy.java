package tomaszjh.expandedreactors.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tomaszjh.expandedreactors.gui.manual.GuiManualCover;
import tomaszjh.expandedreactors.handler.RenderHandler;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        RenderHandler.init();
    }

    @SideOnly(Side.CLIENT)
    public void openManualGui(ItemStack book) {
        Minecraft.getMinecraft().displayGuiScreen(new GuiManualCover(book));
    }
}

