package net.examplemod.quilt;

import top.ctnstudios.stonecraft.MainCommon;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class ExampleModQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        MainCommon.init();
    }
}
