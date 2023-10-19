package top.ctnstudios.stonecraft.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import top.ctnstudios.stonecraft.StoneCraft;

@Mixin(MinecraftServer.class)
public class StoneCraftMixin {
    @Inject(at = @At("HEAD"), method = "loadWorld")
    private void init(CallbackInfo info) {
        StoneCraft.LOGGER.info("Thank you for playing Stone Craft!");
    }
}