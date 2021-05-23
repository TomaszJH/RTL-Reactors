package tomaszjh.expandedreactors.handler;

import tomaszjh.expandedreactors.init.ERBlocks;
import tomaszjh.expandedreactors.init.ERItems;

public class RenderHandler {
    public static void init() {
        ERItems.registerRenders();
        ERBlocks.registerRenderers();
    }
}
