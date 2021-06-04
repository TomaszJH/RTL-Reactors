package tomaszjh.expandedreactors.util;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;

public class TankFactory extends FluidTank {

    protected final String name;

    public TankFactory(String name, int capacity) {
        super(capacity);
        this.name = name;
    }

    public TankFactory(String name, FluidStack stack, int capacity) {
        this(name, capacity);
        this.setFluid(stack);
    }

    public TankFactory(String name, Fluid fluid, int amount, int capacity) {
        this(name, new FluidStack(fluid, amount), capacity);
    }

    @Override
    public final FluidTank readFromNBT(NBTTagCompound nbt) {
        NBTTagCompound tankData = nbt.getCompoundTag(name);
        String fluidName = tankData.getString("FluidName");
        super.readFromNBT(tankData);
        return this;
    }
}
