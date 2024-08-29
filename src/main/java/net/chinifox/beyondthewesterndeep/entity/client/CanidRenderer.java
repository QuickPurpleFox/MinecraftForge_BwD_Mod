package net.chinifox.beyondthewesterndeep.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.chinifox.beyondthewesterndeep.BeyondTheWesternDeepMod;
import net.chinifox.beyondthewesterndeep.entity.custom.CanidEntity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class CanidRenderer extends MobRenderer<CanidEntity, CanidModel<CanidEntity>>
{

    public CanidRenderer(EntityRendererProvider.Context pContext)
    {
        super(pContext, new CanidModel<CanidEntity>(pContext.bakeLayer(ModModelLayers.CANID_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(CanidEntity pEntity)
    {
        return new ResourceLocation(BeyondTheWesternDeepMod.MOD_ID, "textures/entity/canid_soldier_black_male_texture.png");
    }

    @Override
    public void render(CanidEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight)
    {
        if (pEntity.isBaby())
        {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
