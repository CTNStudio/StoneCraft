package top.ctnstudios.stonecraft.stonecraft;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import top.ctnstudios.stonecraft.stonecraft.registry.Items;

@Mod("stonecraft")
public class StoneCraft {
    public static String MODID = "stonecraft";
    public static final Logger LOGGER = LogManager.getLogger();

    public StoneCraft() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        Items.init();
        throw new RuntimeException();
    }
}
