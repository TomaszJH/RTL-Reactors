package tomaszjh.expandedreactors.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import tomaszjh.expandedreactors.init.ERItems;
import tomaszjh.expandedreactors.item.ERItem;
import tomaszjh.expandedreactors.refrence.Refrence;

public class CreativeTab {

    public static final CreativeTabs ERTab = new CreativeTabs(Refrence.MOD_ID) {

        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ERItems.CHRBYLSTK);
        }
    };

}
