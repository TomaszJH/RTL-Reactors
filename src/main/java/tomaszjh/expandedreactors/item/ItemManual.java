package tomaszjh.expandedreactors.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import tomaszjh.expandedreactors.ExpandedReactors;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class ItemManual extends ERItem {

    public ItemManual() {
        super("er_manual");
    }

    @Nonnull
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {

        ItemStack itemStackIn = player.getHeldItem(hand);
        if (world.isRemote) {
            ExpandedReactors.proxy.openManualGui(itemStackIn);
        }
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("\u00a74READ THIS BEFORE WRECKING YOUR BASE!");
        tooltip.add("NOT UNDERSTANDING BASIC CONCEPTS WILL CAUSE USER ERROR AND IRREVERSIBLE DAMAGE TO YOUR PROPERTY");
    }
}
