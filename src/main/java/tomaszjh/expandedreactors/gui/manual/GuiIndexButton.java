package tomaszjh.expandedreactors.gui.manual;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;

public class GuiIndexButton extends GuiButton {

    public GuiIndexButton(int id, int x, int y, int w, int h, String buttonText) {
        super(id, x, y, buttonText);
        this.width = 100;
        this.height = 20;
    }

    public void drawButton(Minecraft mc, int mouseX, int mouseY, float partial) {
        if (this.visible) {
            FontRenderer fontrenderer = Minecraft.getMinecraft().fontRenderer;
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            int i = this.getHoverState(this.hovered);
            this.hovered = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;
            this.drawTexturedModalRect(this.x, this.y, 0, 46 + i * 20, this.width / 2, this.height);

        }
    }

}
