package tomaszjh.expandedreactors.gui.manual;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiManualCover extends GuiScreen {
    protected static final int X = 205;
    protected static final int Y = 230;
    private static final ResourceLocation COVER_TEXTURE = new ResourceLocation("expandedreactors:textures/gui/manual/manualcover.png");
    protected ItemStack book;
    protected boolean index;

    public GuiManualCover(ItemStack book) {
        this.book = book;
        int indexPageTotal = 0;
        index = true;
    }



    @Override
    public void initGui() {
        super.initGui();
        int centerX = (this.width - X);
        int centerY = (this.height - Y);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        int cornerX = (this.width - X) / 2;
        int cornerY = (this.height - Y) / 2;
        this.mc.renderEngine.bindTexture(COVER_TEXTURE);
        drawModalRectWithCustomSizedTexture(cornerX, cornerY, 0, 0, X, Y, 205F, 230F);

    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
        if (mouseButton == 0) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiManual());
        }
    }





}
