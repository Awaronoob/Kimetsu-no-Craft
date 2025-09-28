package net.awaronoob.kimetsucraft;

import net.awaronoob.kimetsucraft.event.KeyInputHandler;
import net.awaronoob.kimetsucraft.networking.payload.TestC2SPayload;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;

public class KimetsuNoCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        KeyInputHandler.register();


        ServerPlayNetworking.registerGlobalReceiver(TestC2SPayload.ID, (payload, context) -> {
            context.server().execute(() -> {
                EntityType.COW.spawn(context.player().getServerWorld(), payload.blockPos(), SpawnReason.TRIGGERED);
            });
        });
    }
}
