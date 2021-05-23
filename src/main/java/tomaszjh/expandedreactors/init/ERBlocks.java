package tomaszjh.expandedreactors.init;


import net.minecraftforge.fml.common.registry.GameRegistry;
import tomaszjh.expandedreactors.block.ERBlock;
import tomaszjh.expandedreactors.block.machines.Assembler;
import tomaszjh.expandedreactors.refrence.Refrence;
import tomaszjh.expandedreactors.handler.RegistrationHandler;

@GameRegistry.ObjectHolder(Refrence.MOD_ID)
public class ERBlocks extends RegistrationHandler {


    private static final ERBlock ASSEMBLER = new Assembler();

    public static void register() {
        registerBlock(ASSEMBLER);

    }

    public static void registerRenderers() {

    }




}