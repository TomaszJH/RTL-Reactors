package tomaszjh.expandedreactors.tileentity.reactors.rbmk;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fluids.FluidTank;

import java.util.Random;

public abstract class RBMKBase extends TileEntity implements IRBMKBase {

    /*
    *       Base algorithm for RBMK Reactor
    *
    *       Planned Features:
    *           -Xeon Poisoning
    *           -Positive Void Coefficient (4.7 Beta / 0.7 Beta)
    *           -Meltdown on loss of coolant
    *           -Violent explosion if coolant overheated
     */
    public int channelXPos, channelYPos;
    public double xeonLevel;
    public double coreTemp;
    public /*FluidTank*/ byte waterLevel;
    public /*FluidTank*/ byte steamLevel;
    public double neutronFlux;
    public double neutronRate;
    public double thermalPower;
    public double waterPressure;


    public static final double MELTDOWN_TEMP = 1800D;
    public static final double HYDROGEN_TEMP = 1500D;
    public static final double WATER_BOILING_TEMP = 100D;
    public static final double WATER_BOILING_TEMP_PRESS = 290D;

    protected EnumFacing[] dirs = EnumFacing.values();

    public double getCoreTemp() {
        return coreTemp;
    }

    public double getNeutronRate() {
        return neutronRate;
    }

    public double getNeutronFlux() {
        return neutronFlux;
    }

    public double getXeonLevel() {
        return xeonLevel;
    }

    public boolean allowHeatExtraction() {
        return true;
    }

    public boolean allowExternalHeating() {
        return true;
    }

    public double getMaxTemperature() {
        return MELTDOWN_TEMP;
    }

    protected void onMeltdown() {
            if (waterLevel > 0) /*RBMK Reactors don't explode on their own*/ {
                //world.createExplosion();
            }

    }

    public Random rand = new Random();
    public EnumFacing getRandomDirection() {
        int r = 2+rand.nextInt(4);
        return dirs[r];
    }


}
