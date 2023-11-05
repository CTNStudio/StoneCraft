package top.ctnstudios.stonecraft.mixins;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import top.ctnstudios.stonecraft.StoneCraft;

@Mixin(TitleScreen.class)
public class MixinTitleScreen {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        StoneCraft.LOGGER.info("Thank you for playing Stone Craft!");
    }
}