package net.awaronoob.kimetsucraft.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import org.lwjgl.glfw.GLFW;

import javax.swing.text.JTextComponent;
import java.util.List;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_KIMETSUCRAFT = "key.category.kimetsucraft";
    public static final String KEY_OPEN_COMBAT_MODE = "key.kimetsucraft.open_combat_mode";

    public static KeyBinding combatModeKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(minecraftClient -> {
            if(combatModeKey.wasPressed()) {
                // This code runs when the combat mode key is pressed.
                minecraftClient.player.sendMessage(Text.of("Sigma Sigma Combat Mode, bochka banka sigma sigma sigma sigma boy"));
            }
        });
    }

    public static void register() {
        combatModeKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_OPEN_COMBAT_MODE,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_R,
                KEY_CATEGORY_KIMETSUCRAFT
        ));

        registerKeyInputs();
    }

}
