package top.ctnstudios.stonecraft.stonecraft.mixin;

import net.minecraft.server.MinecraftServer;

import top.ctnstudios.stonecraft.stonecraft.StoneCraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class StoneCraftMixin {
    @Inject(at = @At("HEAD"), method = "loadWorld")
    private void init(CallbackInfo info) {
        StoneCraft.LOGGER.info("This line is printed by an example mod mixin!");
    }
}
