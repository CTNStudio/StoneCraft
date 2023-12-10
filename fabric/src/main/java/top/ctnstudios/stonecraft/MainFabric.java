package top.ctnstudios.stonecraft;

import net.fabricmc.api.ModInitializer;

public class MainFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MainCommon.init();
    }
}
