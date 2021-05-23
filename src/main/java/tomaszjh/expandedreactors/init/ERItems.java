package tomaszjh.expandedreactors.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import tomaszjh.expandedreactors.item.ERItem;
import tomaszjh.expandedreactors.item.ItemManual;
import tomaszjh.expandedreactors.item.icons.ChernobylStack;
import tomaszjh.expandedreactors.item.tool.ItemAnalyzer;
import tomaszjh.expandedreactors.item.tool.ItemGeigerCounter;
import tomaszjh.expandedreactors.item.tool.ItemWrench;
import tomaszjh.expandedreactors.refrence.Refrence;
import tomaszjh.expandedreactors.handler.RegistrationHandler;

@GameRegistry.ObjectHolder(Refrence.MOD_ID)
public class ERItems extends RegistrationHandler {
    public static final ERItem WRENCH = new ItemWrench();
    public static final ERItem ANALYZER = new ItemAnalyzer();
    public static final ERItem CHRBYLSTK = new ChernobylStack();
    public static final ERItem MANUAL = new ItemManual();
    public static final ERItem GEIGER_COUNTER = new ItemGeigerCounter();


    public static void register() {
        registerItems(WRENCH);
        registerItems(ANALYZER);
        registerItems(CHRBYLSTK);
        registerItems(MANUAL);
        registerItems(GEIGER_COUNTER);

    }

    public static void registerRenders() {
        registerRender(CHRBYLSTK);
        registerRender(MANUAL);
        registerRender(GEIGER_COUNTER);
    }



}
