package top.ctnstudios.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static top.ctnstudios.StoneCraft.MODID;

import top.ctnstudios.StoneCraftClient;
import top.ctnstudios.entities.StoneElderEntity;
import top.ctnstudios.models.StoneElderModel;

public class StoneElderRenderer extends MobEntityRenderer<StoneElderEntity, StoneElderModel> {
    public StoneElderRenderer(EntityRendererFactory.Context context) {
        super(context, new StoneElderModel(context.getPart(StoneCraftClient.STONE_ELDER_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(StoneElderEntity entity) {
        return new Identifier(MODID, "textures/entity/stone_elder.png");
    }
}
