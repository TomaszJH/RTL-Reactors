package tomaszjh.expandedreactors.block.fluid;

import java.util.Random;
import javax.annotation.Nonnull;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.*;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.*;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fluids.*;
import tomaszjh.expandedreactors.fluid.ERFluid;


public abstract class ERBlockFluid extends BlockFluidClassic {

    protected String name;
    public final Fluid fluid;

    public ERBlockFluid(Fluid fluid, Material material) {
        super(fluid, material);
        this.name = "fluid_" + fluid.getName();
        //NuclearCraft.proxy.registerFluidBlockRendering(this, name);
        this.fluid = fluid;
    }

    public ERBlockFluid(ERFluid fluid, Material material) {
        super(fluid, material);
        this.name = "fluid_" + fluid.getName();
        //NuclearCraft.proxy.registerFluidBlockRendering(this, name);
        this.fluid = fluid;
    }

    @Override
    public boolean canDisplace(IBlockAccess world, BlockPos pos) {
        if (world.getBlockState(pos).getMaterial().isLiquid()) return false;
        return super.canDisplace(world, pos);
    }

    @Override
    public boolean displaceIfPossible(World world, BlockPos pos) {
        if (world.getBlockState(pos).getMaterial().isLiquid()) return false;
        return super.displaceIfPossible(world, pos);
    }

    public String getBlockName() {
        return name;
    }
}
