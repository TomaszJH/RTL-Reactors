package tomaszjh.expandedreactors.gui.manual;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;

@SideOnly(Side.CLIENT)
public class GuiManual extends GuiScreen {
    protected static final int X = 410;
    protected static final int Y = 230;
    private static final ResourceLocation TEXTURE = new ResourceLocation("expandedreactors:textures/gui/manual/manual.png");
    public EnumManualChapters pageType;
    protected ItemStack book;
    protected boolean index;

    public GuiManual() {
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
            this.mc.renderEngine.bindTexture(TEXTURE);
            drawModalRectWithCustomSizedTexture(cornerX, cornerY, 0, 0, X, Y, 410F, 230F);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    public void drawPerPage(int bookPages) {

        switch (this.pageType) {
            case INTRODUCTION:
                if (bookPages == 0) {

                }
        }
    }
}
