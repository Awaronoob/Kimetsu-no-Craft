package net.awaronoob.kimetsucraft.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.PlayerManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerManager.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "onPlayerConnect")
	private void init(CallbackInfo info) {
		// This code is injected into the start of PlayerManager.onPlayerConnect
        if (player.getPersistentData().getInt("breathing_style") == null) {
            player.getPersistenData().putInt("breathing_style", )
        }
	}
}