package net.examplemod.forge;

import dev.architectury.platform.forge.EventBuses;
import top.ctnstudios.stonecraft.MainCommon;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MainCommon.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(MainCommon.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        MainCommon.init();
    }
}
