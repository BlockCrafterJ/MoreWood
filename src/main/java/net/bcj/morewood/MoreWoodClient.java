package net.bcj.morewood;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

import static net.bcj.morewood.MoreWood.*;


public class MoreWoodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(BLUE_MAHOE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BLUE_MAHOE_SAPLING, RenderLayer.getCutout());
    }
}
