package tomaszjh.expandedreactors.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.*;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import tomaszjh.expandedreactors.refrence.Refrence;

import java.io.File;

public class ERConfig {


    //categories
    public static final String CATEGORY_EXPERIMENTAL = "experimental";

    //config options
    //Experimental
    public static boolean enableCherenkovRadiation;


    private static void syncConfig(boolean loadFromFile, boolean setFromConfig) {
        if (loadFromFile) {
            config.load();
        }
    }

    public static Configuration config;
    public static boolean testValue = false;

    public static Configuration getConfig() {
        return config;
    }
    public static void init(File configFile) {

        config = new Configuration(configFile);


    }

    private static class configHandler {

        @SubscribeEvent(priority = EventPriority.LOWEST)
        public void onEvent(OnConfigChangedEvent event) {
            if (event.getModID().equalsIgnoreCase(Refrence.MOD_ID)) {
                syncConfig(false, true);
            }

        }
    }

}
