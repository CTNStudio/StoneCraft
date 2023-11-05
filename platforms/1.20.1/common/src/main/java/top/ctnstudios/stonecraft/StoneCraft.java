package top.ctnstudios.stonecraft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import top.ctnstudios.stonecraft.common.registry.ModItems;

public class StoneCraft {
    public static final String MODID = "stonecraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    public static void init() {
        ModItems.ITEMS.init();
    }
}