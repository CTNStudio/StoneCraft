package top.ctnstudios.stonecraft.quilt;

import top.ctnstudios.stonecraft.fabriclike.StoneCraftFabricLike;
import top.ctnstudios.stonecraft.StoneCraft;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class StoneCraftQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        StoneCraftFabricLike.init();
        StoneCraft.init();
    }
}
