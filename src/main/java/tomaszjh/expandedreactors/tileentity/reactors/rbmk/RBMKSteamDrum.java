package tomaszjh.expandedreactors.tileentity.reactors.rbmk;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import tomaszjh.expandedreactors.util.TankFactory;

public class RBMKSteamDrum extends RBMKBase {

    public TankFactory steamTank = new TankFactory("Steam",16000);
    public TankFactory waterTank = new TankFactory("Water",16000);

    protected int steamOut;
    protected int waterIn;

    public boolean isSteamDrum() {
        return true;
    }



}
