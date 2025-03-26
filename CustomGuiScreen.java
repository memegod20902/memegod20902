package com.example.mymod;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.StringTextComponent;

public class CustomGuiScreen extends Screen {

    protected CustomGuiScreen() {
        super(new StringTextComponent("Custom GUI"));
    }

    @Override
    protected void init() {
        int x = this.width / 2 - 100;
        int y = this.height / 2 - 20;
        this.addButton(new StartButton(x, y, 200, 20, "Start Game", button -> {
            // This will call the onPress method in StartButton class
        }));
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        this.renderBackground();
        super.render(mouseX, mouseY, partialTicks);
        drawCenteredString(this.font, this.title.getString(), this.width / 2, 20, 0xFFFFFF);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}