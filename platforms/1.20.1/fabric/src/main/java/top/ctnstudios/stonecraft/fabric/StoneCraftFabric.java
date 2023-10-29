package top.ctnstudios.stonecraft.fabric;

import net.fabricmc.api.ModInitializer;

import top.ctnstudios.stonecraft.StoneCraft;
import top.ctnstudios.stonecraft.fabriclike.StoneCraftFabricLike;

public class StoneCraftFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        StoneCraft.init();
        StoneCraftFabricLike.init();
    }
}
