package top.ctnstudios;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import static top.ctnstudios.StoneCraft.MODID;

import top.ctnstudios.models.StoneElderModel;
import top.ctnstudios.registry.Entities;
import top.ctnstudios.renderer.StoneElderRenderer;

public class StoneCraftClient implements ClientModInitializer {
    public static final EntityModelLayer STONE_ELDER_LAYER = new EntityModelLayer(new Identifier(MODID, "stone_elder"), "main");
	@Override
	public void onInitializeClient() {
        EntityRendererRegistry.register(
            Entities.STONE_ELDER, (context) -> {
            return new StoneElderRenderer(context);
        });
        EntityModelLayerRegistry.registerModelLayer(STONE_ELDER_LAYER, StoneElderModel::getTexturedModelData);
	}
}