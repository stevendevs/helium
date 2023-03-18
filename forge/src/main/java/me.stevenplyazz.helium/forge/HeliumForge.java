package me.stevenplyazz.helium.forge;

import dev.architectury.platform.forge.EventBuses;
import me.stevenplyazz.helium.ExampleMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Helium.MOD_ID)
public class HeliumForge {
    public HeliumForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Helium.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Helium.init();
    }
}
