package tomaszjh.expandedreactors.init;


import net.minecraftforge.fml.common.registry.GameRegistry;
import tomaszjh.expandedreactors.block.ERBlock;
import tomaszjh.expandedreactors.block.machines.Assembler;
import tomaszjh.expandedreactors.block.machines.reactors.rbmk.ControlRodRBMK;
import tomaszjh.expandedreactors.block.machines.reactors.rbmk.SteamDrumRBMK;
import tomaszjh.expandedreactors.refrence.Refrence;
import tomaszjh.expandedreactors.handler.RegistrationHandler;

@GameRegistry.ObjectHolder(Refrence.MOD_ID)
public class ERBlocks extends RegistrationHandler {


    private static final ERBlock ASSEMBLER = new Assembler();
    private static final ERBlock RBMK_CONTROL_ROD = new ControlRodRBMK();
    private static final ERBlock RBMK_STEAM_DRUM = new SteamDrumRBMK();

    public static void register() {
        registerBlock(ASSEMBLER);
        registerBlock(RBMK_CONTROL_ROD);
        registerBlock(RBMK_STEAM_DRUM);

    }

    public static void registerRenderers() {

    }




}