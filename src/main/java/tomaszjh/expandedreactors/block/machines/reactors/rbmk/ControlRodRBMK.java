package tomaszjh.expandedreactors.block.machines.reactors.rbmk;

import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import tomaszjh.expandedreactors.block.ERBlock;
import tomaszjh.expandedreactors.tileentity.reactors.rbmk.RBMKControlRod;

public class ControlRodRBMK extends ERBlock {

    public ControlRodRBMK() {
        super("rbmk_control_rod");
    }

    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    public TileEntity createTileEntity(World world, IBlockState state) {
            return new RBMKControlRod();
    }


}
