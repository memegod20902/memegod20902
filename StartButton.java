package com.example.mymod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.StringTextComponent;

public class StartButton extends Button {

    public StartButton(int x, int y, int width, int height, String buttonText, Button.IPressable onPress) {
        super(x, y, width, height, new StringTextComponent(buttonText), onPress);
    }

    @Override
    public void onPress() {
        // Code to start the game
        Minecraft.getInstance().displayGuiScreen(null); // Closes the GUI
        Minecraft.getInstance().player.sendChatMessage("/startgame"); // Example command to start the game
    }
}