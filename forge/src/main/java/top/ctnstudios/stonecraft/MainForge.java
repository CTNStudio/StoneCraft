package top.ctnstudios.stonecraft;

import dev.architectury.platform.forge.EventBuses;
import top.ctnstudios.stonecraft.MainCommon;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MainCommon.MOD_ID)
public class MainForge {
    public MainForge() {
        EventBuses.registerModEventBus(MainCommon.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        MainCommon.init();
    }
}
