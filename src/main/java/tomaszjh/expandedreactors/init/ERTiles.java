package tomaszjh.expandedreactors.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import tomaszjh.expandedreactors.refrence.Refrence;
import tomaszjh.expandedreactors.tileentity.reactors.rbmk.RBMKControlRod;
import tomaszjh.expandedreactors.tileentity.reactors.rbmk.RBMKSteamDrum;

public class ERTiles {

    public static void register() {
        GameRegistry.registerTileEntity(RBMKControlRod.class, Refrence.MOD_ID + ":rbmk_control_rod");
        GameRegistry.registerTileEntity(RBMKSteamDrum.class, Refrence.MOD_ID + ":rbmk_steam_drum");
    }
}
