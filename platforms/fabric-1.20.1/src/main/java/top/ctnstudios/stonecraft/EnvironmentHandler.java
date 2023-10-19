package top.ctnstudios.stonecraft;

import static top.ctnstudios.stonecraft.StoneCraft.LOGGER;

public class EnvironmentHandler {
    private static String getEnvironment(){
        String environment;
        try {
            Class.forName("org.quiltmc.loader.api.ModContainer");
            environment = "quilt";
        } catch (ClassNotFoundException e) {
            try {
                Class.forName("net.minecraftforge.common.MinecraftForge");
                environment = "forge";
            } catch (ClassNotFoundException e2) {
                try {
                    Class.forName("net.fabricmc.api.ModInitializer");
                    environment = "fabric";
                } catch (ClassNotFoundException e3) {
                    throw new RuntimeException("could not get environment");
                }
            }
        }
        return environment;
    }
    public static void init(){
        if (getEnvironment().equals("forge")) {
            LOGGER.warn("Stone Craft doesn't support running on forge.\nIssues may not be fixed.\n");
        }
    }
}
