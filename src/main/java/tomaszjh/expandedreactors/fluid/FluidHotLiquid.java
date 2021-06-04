package tomaszjh.expandedreactors.fluid;

import net.minecraft.init.SoundEvents;

public class FluidHotLiquid extends ERFluid {

    public FluidHotLiquid(String fluidName) {
        super(fluidName, true);
        setTemperature(580);
    }

    public FluidHotLiquid(String fluidName, Boolean opaque, Integer color, Integer density, Integer temperature, Integer viscosity, Integer luminosity) {
        super(fluidName, true, opaque == null ? fluidName : opaque ? "liquid_opaque" : "liquid", color);
        setDensity(density);
        setTemperature(temperature);
        setViscosity(viscosity);
        setLuminosity(luminosity);
    }
}
