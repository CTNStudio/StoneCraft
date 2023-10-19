package top.ctnstudios.stonecraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import top.ctnstudios.stonecraft.models.StoneElderModel;
import top.ctnstudios.stonecraft.registry.Entities;
import top.ctnstudios.stonecraft.renderer.StoneElderRenderer;

public class StoneCraftClient implements ClientModInitializer {
    public static final EntityModelLayer STONE_ELDER_LAYER = new EntityModelLayer(new Identifier(StoneCraft.MODID, "stone_elder"), "main");
	@Override
	public void onInitializeClient() {
        EntityRendererRegistry.register(
            Entities.STONE_ELDER, (context) -> {
            return new StoneElderRenderer(context);
        });
        EntityModelLayerRegistry.registerModelLayer(STONE_ELDER_LAYER, StoneElderModel::getTexturedModelData);
	}
}