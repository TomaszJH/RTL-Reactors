package tomaszjh.expandedreactors.tileentity.reactors.rbmk;

public interface IRBMKControl extends IRBMKBase {
    void AZ5Pressed();
    void setRodSetPoint(double setPoint);
    double getRodPosition();
    double getRodSetPoint();
}
