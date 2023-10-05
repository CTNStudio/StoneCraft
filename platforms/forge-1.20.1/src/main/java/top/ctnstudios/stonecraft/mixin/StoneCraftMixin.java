package top.ctnstudios.stonecraft.mixin;

import top.ctnstudios.stonecraft.StoneCraft;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class StoneCraftMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        StoneCraft.LOGGER.info("This line is printed by an example mod mixin!");
    }
}
