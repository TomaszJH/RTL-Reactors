package tomaszjh.expandedreactors.item;

import net.minecraft.item.Item;
import tomaszjh.expandedreactors.creativetab.CreativeTab;
import tomaszjh.expandedreactors.init.ERItems;

public class ERItem extends Item{

    private final String BASE_NAME;
    private final String[] VARIANTS;

    public ERItem(String name, String ... variants) {
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
        setMaxStackSize(1);
        setCreativeTab(CreativeTab.ERTab);


        BASE_NAME = name;
        if (variants.length > 0) {
            VARIANTS = variants;
        }
        else {
            VARIANTS = new String[0];
        }

        ERItems.register(this);
    }

}
