package org.lightning.cofh_core_fix.mixin;

import cofh.core.common.event.ArcheryEvents;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = ArcheryEvents.class, remap = false)
public class ArcheryEventsMixin {

    @Inject(method = "handleArrowLooseEvent", at = @At("HEAD"), cancellable = true)
    private static void onHandleArrowLooseEvent(ArrowLooseEvent event, CallbackInfo ci) {
        ci.cancel();
    }
}