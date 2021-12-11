package com.github.reviversmc.modget.minecraft.mixin;

import com.github.reviversmc.modget.minecraft.client.gui.ModUpdateScreen116;
import com.terraformersmc.modmenu.gui.ModsScreen;
import com.terraformersmc.modmenu.gui.widget.ModMenuTexturedButtonWidget;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@Mixin(ModsScreen.class)
public abstract class UpdateButtonMixin extends Screen {
    private static final Identifier UPDATE_BUTTON_LOCATION = new Identifier("modget", "textures/gui/install_button.png");
    private int paneWidth;

    protected UpdateButtonMixin(Text title) {
        super(title);
    }

    @Inject(method = "init", at = @At("TAIL"))
    public void onInit(CallbackInfo ci) {
        int searchBoxWidth = this.paneWidth - 32 - 22;
        this.addButton(new ModMenuTexturedButtonWidget(this.paneWidth / 2 + searchBoxWidth / 2 + 14,
                22, 20, 20, 0, 0, UPDATE_BUTTON_LOCATION, 32, 64,
                button -> MinecraftClient.getInstance().openScreen(new ModUpdateScreen116(this)), LiteralText.EMPTY,
                (button, matrices, mouseX, mouseY) -> {
                    if (!button.isHovered()) {
                        return;
                    }
                    this.renderTooltip(matrices, new LiteralText("Updates"), mouseX, mouseY);
                }));
    }
}
