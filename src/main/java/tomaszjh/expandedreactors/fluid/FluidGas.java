package tomaszjh.expandedreactors.fluid;

import net.minecraft.init.SoundEvents;

public class FluidGas extends ERFluid{

    public FluidGas(String fluidName) {
        super(fluidName, false);
        setDensity(-10);
        setGaseous(true);
        setViscosity(40);
        setEmptySound(SoundEvents.BLOCK_FIRE_EXTINGUISH);
        setFillSound(SoundEvents.BLOCK_FIRE_EXTINGUISH);
    }

    public FluidGas(String fluidName, Boolean opaque, Integer color, Integer density, Integer temperature, Integer viscosity, Integer luminosity) {
        super(fluidName, false, "gas", color);
        setDensity(-10);
        setGaseous(true);
        setViscosity(40);
        setEmptySound(SoundEvents.BLOCK_FIRE_EXTINGUISH);
        setFillSound(SoundEvents.BLOCK_FIRE_EXTINGUISH);
    }
}
