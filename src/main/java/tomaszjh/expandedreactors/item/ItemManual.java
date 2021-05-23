package tomaszjh.expandedreactors.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import tomaszjh.expandedreactors.ExpandedReactors;

import javax.annotation.Nonnull;

public class ItemManual extends ERItem {

    public ItemManual() {
        super("manual");
    }

    @Nonnull
    //@Override
    public ActionResult<ItemStack> onItemRightClick(@Nonnull ItemStack itemStack, World world, EntityPlayer player, EnumHand hand) {

        ItemStack stack = player.getHeldItem(hand);
        if (world.isRemote) {
            System.out.println("Item Was Clicked");
            //TODO: player.openGui(ExpandedReactors.instance, );
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, itemStack);
    }
}
