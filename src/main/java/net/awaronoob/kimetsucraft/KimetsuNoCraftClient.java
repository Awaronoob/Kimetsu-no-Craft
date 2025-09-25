package net.awaronoob.kimetsucraft;

import net.awaronoob.kimetsucraft.event.KeyInputHandler;
import net.fabricmc.api.ClientModInitializer;

public class KimetsuNoCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        KeyInputHandler.register();
    }
}
