package net.awaronoob.kimetsucraft.util;

import net.minecraft.nbt.NbtCompound;

public class BreathingStyleData {

    public static int setStyle(IEntityDataSaver player, int value) {
        NbtCompound nbt = player.getPersistentData();
        int style = nbt.getInt("breathing_style");

        if (value > -1 && value < 3) {
            style = value;
        }

        nbt.putInt("breathing_style", style);
        // sync the data
        return style;

    }

    public static int getStyle(IEntityDataSaver player) {
        return player.getPersistentData().getInt("breathing_style");
    }
}
