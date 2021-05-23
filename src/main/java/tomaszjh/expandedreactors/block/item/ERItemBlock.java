package tomaszjh.expandedreactors.block.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.text.TextFormatting;

public class ERItemBlock extends ItemBlock {

    private final TextFormatting[] fixedColors;
    private final TextFormatting infoColor;

    public ERItemBlock(Block block, TextFormatting[] fixedColors, String[] fixedTooltip, TextFormatting infoColor, String... tooltip) {
        super(block);
        this.fixedColors = fixedColors;
        this.infoColor = infoColor;
    }


}
