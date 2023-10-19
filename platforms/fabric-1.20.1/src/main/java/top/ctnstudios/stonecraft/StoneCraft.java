package top.ctnstudios.stonecraft;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import top.ctnstudios.stonecraft.registry.Blocks;
import top.ctnstudios.stonecraft.registry.Entities;
import top.ctnstudios.stonecraft.registry.ItemGroups;
import top.ctnstudios.stonecraft.registry.Items;

public class StoneCraft implements ModInitializer {
    public static final String MODID = "stonecraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);


    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Stone Craft...");
        Items.init();
        Blocks.init();
        ItemGroups.init();
        Ores.init();
        Entities.init();
        EnvironmentHandler.init();
    }
}