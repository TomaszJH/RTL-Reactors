package tomaszjh.expandedreactors.tileentity.reactors.rbmk;

import net.minecraft.nbt.NBTTagCompound;

public class RBMKControlRod extends RBMKBase implements IRBMKControl {

    public double rodPosition;
    public double rodSetPoint;
    public final double speed = 0.00277D;

    public final double ROD_MAX_POSITION = 100;

    public boolean isControlRod() {
        return true;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);

        this.rodPosition = nbt.getDouble("rod_position");
        this.rodSetPoint = nbt.getDouble("rod_setpoint");
        this.coreTemp = nbt.getDouble("core_temperature");
        this.steamLevel = nbt.getDouble("steam_level");
        this.waterLevel = nbt.getDouble("water_level");
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);

        nbt.setDouble("rod_position", this.rodPosition);
        nbt.setDouble("rod_setpoint", this.rodSetPoint);
        nbt.setDouble("core_temperature", this.coreTemp);
        nbt.setDouble("steam_level", this.steamLevel);
        nbt.setDouble("water_level", this.waterLevel);
        return nbt;
    }

    public double getRodPosition() {
        return rodPosition;
    }

    public double getRodSetPoint() {
        return rodSetPoint;
    }

    public void setRodSetPoint(double setPoint) {
        this.rodSetPoint = setPoint;
    }

    public void rodMotion() {
        if (rodPosition < rodSetPoint) {
            rodPosition += speed;
        } else if (rodPosition > rodSetPoint) {
            rodPosition -= speed;
        }
    }


    public void AZ5Pressed() {
        this.rodSetPoint = 0D;
    }

    public void update() {
        rodMotion();

    }
}

