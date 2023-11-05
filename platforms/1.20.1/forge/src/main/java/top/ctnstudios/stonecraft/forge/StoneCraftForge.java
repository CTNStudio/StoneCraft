package top.ctnstudios.stonecraft.forge;

import top.ctnstudios.stonecraft.StoneCraft;

import net.minecraftforge.fml.common.Mod;

@Mod(StoneCraft.MODID)
public class StoneCraftForge {
    public StoneCraftForge() {
        StoneCraft.init();
    }
}
