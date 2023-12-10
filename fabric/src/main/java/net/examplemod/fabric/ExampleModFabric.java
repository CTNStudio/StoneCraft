package net.examplemod.fabric;

import top.ctnstudios.stonecraft.MainCommon;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MainCommon.init();
    }
}
