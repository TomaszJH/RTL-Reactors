package tomaszjh.expandedreactors.tileentity.reactors.rbmk;

public interface IRBMKBase {

    double getCoreTemp();
    double getNeutronRate();
    double getNeutronFlux();
    double getXeonLevel();
    boolean allowHeatExtraction();
    boolean allowExternalHeating();
    double getMaxTemperature();

}
