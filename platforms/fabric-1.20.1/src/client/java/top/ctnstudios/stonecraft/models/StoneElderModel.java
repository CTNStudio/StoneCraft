package top.ctnstudios.stonecraft.models;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

import top.ctnstudios.stonecraft.entities.StoneElderEntity;

public class StoneElderModel extends EntityModel<StoneElderEntity> {
    private final ModelPart base;

    public StoneElderModel(ModelPart modelPart) {
        this.base = modelPart.getChild(EntityModelPartNames.CUBE);
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelpartdata = modelData.getRoot();
        ModelPartData stone_elder = modelpartdata.addChild("stone_elder", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData sbs = stone_elder.addChild("sbs", ModelPartBuilder.create().uv(45, 0).cuboid(-7.0F, -55.0F, -5.0F, 14.0F, 26.0F, 10.0F, new Dilation(0.0F))
            .uv(45, 37).cuboid(-7.1F, -55.1F, -5.1F, 14.2F, 26.2F, 10.2F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData t = sbs.addChild("t", ModelPartBuilder.create().uv(0, 17).cuboid(-5.5F, -11.0F, -5.5F, 11.0F, 11.0F, 11.0F, new Dilation(0.0F))
            .uv(0, 40).cuboid(-5.7F, -5.9F, -5.7F, 11.4F, 6.0F, 11.4F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -55.0F, 0.0F));

        ModelPartData mz = t.addChild("mz", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -8.9014F, -0.0523F));

        ModelPartData mz_r1 = mz.addChild("mz_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-5.7F, -2.5F, -5.7F, 11.4F, 5.0F, 11.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

        ModelPartData mz1 = mz.addChild("mz1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.3926F, 0.2826F));

        ModelPartData cube_r1 = mz1.addChild("cube_r1", ModelPartBuilder.create().uv(0, 58).cuboid(-4.7F, -7.4F, -4.7F, 9.4F, 6.0F, 9.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.394F, -0.2303F, -0.0524F, 0.0F, 0.0F));

        ModelPartData stzx = mz1.addChild("stzx", ModelPartBuilder.create(), ModelTransform.of(0.0615F, -3.7927F, -4.8918F, -0.0044F, 0.0F, 0.0F));

        ModelPartData cube_r2 = stzx.addChild("cube_r2", ModelPartBuilder.create().uv(242, 5).cuboid(-6.0F, -3.2F, -0.1F, 0.5F, 1.5F, 0.5F, new Dilation(0.0F)), ModelTransform.of(3.2885F, 2.4388F, -0.278F, -0.0524F, 0.0F, 0.0F));

        ModelPartData cube_r3 = stzx.addChild("cube_r3", ModelPartBuilder.create().uv(243, 5).cuboid(-4.5F, -4.0F, -0.1F, 1.0F, 2.5F, 0.5F, new Dilation(0.0F)), ModelTransform.of(2.2885F, 2.7384F, -0.2937F, -0.0524F, 0.0F, 0.0F));

        ModelPartData cube_r4 = stzx.addChild("cube_r4", ModelPartBuilder.create().uv(170, 6).cuboid(6.0F, -3.5F, -0.1F, 0.5F, 1.5F, 0.5F, new Dilation(0.0F)), ModelTransform.of(-3.9115F, 2.7384F, -0.2937F, -0.0524F, 0.0F, 0.0F));

        ModelPartData cube_r5 = stzx.addChild("cube_r5", ModelPartBuilder.create().uv(254, 7).cuboid(2.3F, -4.5F, -0.1F, 0.5F, 0.5F, 0.5F, new Dilation(0.0F))
            .uv(247, 13).cuboid(-0.5F, -1.5F, -0.1F, 0.5F, 0.5F, 0.5F, new Dilation(0.0F))
            .uv(246, 12).cuboid(-1.0F, -2.0F, -0.1F, 1.5F, 0.5F, 0.5F, new Dilation(0.0F))
            .uv(247, 1).mirrored().cuboid(-0.5F, -7.5F, -0.1F, 0.5F, 0.5F, 0.5F, new Dilation(0.0F)).mirrored(false)
            .uv(241, 7).cuboid(-3.5F, -4.5F, -0.1F, 0.5F, 0.5F, 0.5F, new Dilation(0.0F))
            .uv(163, 11).cuboid(-1.5F, -5.5F, -0.1F, 2.5F, 2.5F, 0.5F, new Dilation(0.0F)), ModelTransform.of(0.2885F, 4.2363F, -0.3722F, -0.0524F, 0.0F, 0.0F));

        ModelPartData cube_r6 = stzx.addChild("cube_r6", ModelPartBuilder.create().uv(252, 5).mirrored().cuboid(2.5F, -5.0F, -0.1F, 0.8F, 2.5F, 0.5F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-1.2115F, 3.737F, -0.3461F, -0.0524F, 0.0F, 0.0F));

        ModelPartData cube_r7 = stzx.addChild("cube_r7", ModelPartBuilder.create().uv(246, 11).mirrored().cuboid(0.0F, -0.5F, -0.1F, 2.5F, 1.0F, 0.5F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-1.2115F, 1.7398F, -0.2414F, -0.0524F, 0.0F, 0.0F));

        ModelPartData cube_r8 = stzx.addChild("cube_r8", ModelPartBuilder.create().uv(246, 2).cuboid(-1.9F, -11.0F, -0.1F, 1.5F, 0.5F, 0.5F, new Dilation(0.0F)), ModelTransform.of(1.1885F, 8.2308F, -0.5816F, -0.0524F, 0.0F, 0.0F));

        ModelPartData cube_r9 = stzx.addChild("cube_r9", ModelPartBuilder.create().uv(246, 3).cuboid(0.0F, -8.5F, -0.1F, 2.5F, 1.0F, 0.5F, new Dilation(0.0F)), ModelTransform.of(-1.2115F, 6.2336F, -0.4769F, -0.0524F, 0.0F, 0.0F));

        ModelPartData mz2 = mz1.addChild("mz2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -6.0933F, 0.3019F));

        ModelPartData cube_r10 = mz2.addChild("cube_r10", ModelPartBuilder.create().uv(0, 74).cuboid(-3.7F, -3.3F, -3.7F, 7.4F, 7.0F, 7.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.1981F, 0.4278F, -0.1396F, 0.0F, 0.0F));

        ModelPartData zss = sbs.addChild("zss", ModelPartBuilder.create().uv(124, 0).cuboid(0.0F, -2.5F, -2.0F, 3.0F, 22.0F, 4.0F, new Dilation(0.0F))
            .uv(139, 0).cuboid(-0.1F, -2.6F, -2.1F, 3.2F, 22.2F, 4.2F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -51.5F, 0.0F));

        ModelPartData zsx = zss.addChild("zsx", ModelPartBuilder.create().uv(124, 27).cuboid(-1.5F, 0.0F, -4.0F, 3.0F, 22.0F, 4.0F, new Dilation(0.0F))
            .uv(139, 27).cuboid(-1.6F, -0.1F, -4.1F, 3.2F, 22.2F, 4.2F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, 19.5F, 2.0F));

        ModelPartData yss = sbs.addChild("yss", ModelPartBuilder.create().uv(94, 0).cuboid(-3.0F, -2.5F, -2.0F, 3.0F, 22.0F, 4.0F, new Dilation(0.0F))
            .uv(109, 0).cuboid(-3.1F, -2.6F, -2.1F, 3.2F, 22.2F, 4.2F, new Dilation(0.0F)), ModelTransform.of(-7.0F, -51.5F, 0.0F, -0.3491F, 0.0F, 0.0F));

        ModelPartData ysx = yss.addChild("ysx", ModelPartBuilder.create().uv(94, 27).cuboid(-1.5F, 0.0F, -4.0F, 3.0F, 22.0F, 4.0F, new Dilation(0.0F))
            .uv(109, 27).cuboid(-1.6F, -0.1F, -4.1F, 3.2F, 22.2F, 4.2F, new Dilation(0.0F)), ModelTransform.of(-1.5F, 19.5F, 2.0F, -0.9599F, 0.0F, 0.0F));

        ModelPartData fz = ysx.addChild("fz", ModelPartBuilder.create().uv(0, 58).cuboid(-1.1F, -0.8169F, -15.0743F, 2.2F, 2.2F, 37.6F, new Dilation(0.0F))
            .uv(0, 98).cuboid(-1.2F, -0.9169F, 21.8257F, 2.4F, 2.4F, 4.2F, new Dilation(0.0F))
            .uv(0, 105).cuboid(-1.1F, -0.8169F, 24.9257F, 2.2F, 2.2F, 4.2F, new Dilation(0.0F))
            .uv(79, 88).cuboid(-1.6F, -1.2169F, -20.5743F, 3.2F, 3.0F, 5.7F, new Dilation(0.0F))
            .uv(13, 91).cuboid(0.0F, -4.1169F, -19.5743F, 0.0F, 3.0F, 7.6F, new Dilation(0.0F))
            .uv(80, 97).cuboid(-1.4F, -1.1169F, -17.0743F, 2.8F, 2.8F, 5.2F, new Dilation(0.0F)), ModelTransform.of(0.1F, 19.7594F, -1.7514F, -0.2618F, 0.0F, 0.0F));

        ModelPartData cube_r11 = fz.addChild("cube_r11", ModelPartBuilder.create().uv(118, 81).cuboid(-1.2F, -1.1668F, 0.5232F, 3.0F, 2.5F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-0.3F, -6.2717F, -28.1838F, -0.1134F, 0.0F, 0.0F));

        ModelPartData cube_r12 = fz.addChild("cube_r12", ModelPartBuilder.create().uv(146, 81).cuboid(-1.425F, -1.25F, -2.0F, 2.9F, 2.5F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-0.025F, -3.5581F, -31.6904F, 0.8203F, 0.0F, 0.0F));

        ModelPartData cube_r13 = fz.addChild("cube_r13", ModelPartBuilder.create().uv(133, 74).cuboid(-0.875F, -0.85F, -2.8F, 1.75F, 1.7F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -5.4636F, -28.9179F, 1.9548F, 0.0F, 0.0F));

        ModelPartData cube_r14 = fz.addChild("cube_r14", ModelPartBuilder.create().uv(133, 81).cuboid(-1.375F, -0.4835F, -2.4804F, 2.95F, 2.5F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-0.1F, -6.3542F, -28.7596F, 0.384F, 0.0F, 0.0F));

        ModelPartData cube_r15 = fz.addChild("cube_r15", ModelPartBuilder.create().uv(101, 72).cuboid(-1.225F, -1.05F, -2.5F, 2.45F, 2.1F, 5.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.4847F, -22.1839F, 1.021F, 0.0F, 0.0F));

        ModelPartData cube_r16 = fz.addChild("cube_r16", ModelPartBuilder.create().uv(101, 80).cuboid(-1.425F, -1.0999F, -2.9434F, 3.05F, 2.5F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-0.1F, -4.3612F, -21.7324F, -0.5934F, 0.0F, 0.0F));

        ModelPartData cube_r17 = fz.addChild("cube_r17", ModelPartBuilder.create().uv(67, 80).cuboid(-1.5F, -1.0F, -2.5F, 3.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.1925F, -19.4711F, -1.7366F, 0.0F, 0.0F));

        ModelPartData cube_r18 = fz.addChild("cube_r18", ModelPartBuilder.create().uv(84, 80).cuboid(-1.5F, -2.6975F, -2.0186F, 3.0F, 2.5F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.3036F, -21.2567F, -1.2217F, 0.0F, 0.0F));

        ModelPartData fzs = fz.addChild("fzs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.7255F, -28.6368F));

        ModelPartData cube_r19 = fzs.addChild("cube_r19", ModelPartBuilder.create().uv(53, 81).cuboid(-1.225F, -2.05F, -2.5F, 2.45F, 2.5F, 3.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.3949F, -1.3648F, -0.7505F, 0.0F, 0.0F));

        ModelPartData cube_r20 = fzs.addChild("cube_r20", ModelPartBuilder.create().uv(42, 81).cuboid(-1.25F, -2.05F, 1.4F, 2.5F, 2.5F, 3.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.4361F, -2.1752F, -0.3491F, 0.0F, 0.0F));

        ModelPartData cube_r21 = fzs.addChild("cube_r21", ModelPartBuilder.create().uv(42, 74).cuboid(-0.925F, -0.95F, -3.45F, 1.85F, 1.9F, 5.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.3513F, -0.0691F, 1.0996F, 0.0F, 0.0F));

        ModelPartData fzp = fz.addChild("fzp", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.3831F, -25.6743F));

        ModelPartData cube_r22 = fzp.addChild("cube_r22", ModelPartBuilder.create().uv(42, 87).cuboid(-1.6F, -1.1929F, -2.6071F, 3.2F, 3.8F, 3.8F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -1.0F, 2.3562F, 0.0F, 0.0F));

        ModelPartData xbs = stone_elder.addChild("xbs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData zst = xbs.addChild("zst", ModelPartBuilder.create().uv(188, 0).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 15.0F, 4.0F, new Dilation(0.0F))
            .uv(205, 0).cuboid(-2.1F, -0.1F, -2.1F, 4.2F, 15.2F, 4.2F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -29.0F, 0.0F));

        ModelPartData zx = zst.addChild("zx", ModelPartBuilder.create().uv(188, 20).cuboid(-2.0F, 0.0F, 0.0F, 4.0F, 15.0F, 4.0F, new Dilation(0.0F))
            .uv(205, 20).cuboid(-2.1F, -0.1F, -0.1F, 4.2F, 15.2F, 4.2F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 14.0F, -2.0F));

        ModelPartData yst = xbs.addChild("yst", ModelPartBuilder.create().uv(154, 0).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 15.0F, 4.0F, new Dilation(0.0F))
            .uv(171, 0).cuboid(-2.1F, -1.1F, -2.1F, 4.2F, 15.2F, 4.2F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -29.0F, 0.0F));

        ModelPartData yx = yst.addChild("yx", ModelPartBuilder.create().uv(154, 20).cuboid(-2.0F, 0.0F, 0.0F, 4.0F, 15.0F, 4.0F, new Dilation(0.0F))
            .uv(171, 20).cuboid(-2.1F, -0.1F, -0.1F, 4.2F, 15.2F, 4.2F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 14.0F, -2.0F));

        return TexturedModelData.of(modelData, 256, 256);
    }
    @Override
    public void setAngles(StoneElderEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.base).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
    }
}
