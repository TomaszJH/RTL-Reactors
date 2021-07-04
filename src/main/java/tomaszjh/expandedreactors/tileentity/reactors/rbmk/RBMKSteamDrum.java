package tomaszjh.expandedreactors.tileentity.reactors.rbmk;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fluids.FluidRegistry;
import tomaszjh.expandedreactors.util.TankFactory;

import javax.annotation.Nonnull;

/*
     *      RBMK Steam Separator
     *      Algorithm Converts Water (Liquid) to Double value which then gets passed around the reactor
     *      Doubles cannot be used as Liquids
     */

public class RBMKSteamDrum extends RBMKBase {

    public EnumFacing facing = EnumFacing.NORTH;

    public final int TANK_CAPACITY = 16000;
    public TankFactory steamTank = new TankFactory("Steam", TANK_CAPACITY);
    public TankFactory waterTank = new TankFactory("Water", TANK_CAPACITY);

    public boolean isSteamDrum() {
        return true;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        this.steamLevel = nbt.getDouble("steam_level");
        this.waterLevel = nbt.getDouble("water_level");

    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setDouble("steam_level", this.steamLevel);
        nbt.setDouble("water_level", this.waterLevel);

        return nbt;
    }


    public void setFluidTanks() {

    }

    public void fluidExchange() {
        if (waterTank.getFluidAmount() > 10) {
            waterTank.drain(FluidRegistry.getFluidStack("water", 10), true);
            waterLevel += 10;
        }
        if ((steamLevel > 10) && (steamTank.getFluidAmount() < steamTank.getCapacity())) {
            steamTank.fill(FluidRegistry.getFluidStack("steam", 10), true);
            steamLevel -= 10;
            if (steamLevel < 0) {
                steamLevel = 0;
            }
        }
    }

    @Nonnull
    @Override
    public EnumFacing getFacing() {
        return facing;
    }

    @Override
    public void setFacing(@Nonnull EnumFacing facing) {
        this.facing = facing;
    }

    public void update() {

    }
}
