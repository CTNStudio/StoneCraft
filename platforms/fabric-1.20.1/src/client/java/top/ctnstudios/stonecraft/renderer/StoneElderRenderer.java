package top.ctnstudios.stonecraft.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import top.ctnstudios.stonecraft.StoneCraftClient;
import top.ctnstudios.stonecraft.entities.StoneElderEntity;
import top.ctnstudios.stonecraft.models.StoneElderModel;
import top.ctnstudios.stonecraft.StoneCraft;

public class StoneElderRenderer extends MobEntityRenderer<StoneElderEntity, StoneElderModel> {
    public StoneElderRenderer(EntityRendererFactory.Context context) {
        super(context, new StoneElderModel(context.getPart(StoneCraftClient.STONE_ELDER_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(StoneElderEntity entity) {
        return new Identifier(StoneCraft.MODID, "textures/entity/stone_elder.png");
    }
}
