package top.ctnstudios.stonecraft.fabric;

import top.ctnstudios.stonecraft.StoneCraft;
import net.fabricmc.api.ModInitializer;

public class StoneCraftFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        StoneCraft.init();
        StoneCraftFabricLike.init();
    }
}
