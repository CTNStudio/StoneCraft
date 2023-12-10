package top.ctnstudios.stonecraft;

import com.google.common.base.Suppliers;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import top.ctnstudios.stonecraft.init.BlockInit;
import top.ctnstudios.stonecraft.init.ItemInit;

import java.util.function.Supplier;

public class MainCommon {
    public static final String MOD_ID = "stonecraft";
    public static final Supplier<RegistrarManager> REGISTRIES = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static final RegistrySupplier<CreativeModeTab> STONE_CRAFT_TABS = TABS.register("stonecraft_tab", () ->
            CreativeTabRegistry.create(Component.translatable("itemGroup." + MOD_ID + ".stonecraft_tab"),
                    () -> new ItemStack(Items.COBBLESTONE)));
    
    public static void init() {
        TABS.register();
        ItemInit.ITEMS.register();
        BlockInit.BLOCKS.register();
    }
}
