package tomaszjh.expandedreactors.block.machines.reactors.rbmk;

import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import tomaszjh.expandedreactors.block.ERBlock;
import tomaszjh.expandedreactors.tileentity.reactors.rbmk.RBMKControlRod;
import tomaszjh.expandedreactors.tileentity.reactors.rbmk.RBMKSteamDrum;

public class SteamDrumRBMK extends ERBlock {

    public SteamDrumRBMK() {
        super("rbmk_steam_drum");
    }

    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    public TileEntity createTileEntity(World world, IBlockState state) {
        return new RBMKSteamDrum();
    }
}
