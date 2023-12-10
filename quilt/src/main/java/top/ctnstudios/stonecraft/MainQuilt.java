package top.ctnstudios.stonecraft;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class MainQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        MainCommon.init();
    }
}
