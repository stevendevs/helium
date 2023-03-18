package me.stevenplyazz.helium.fabric;

import me.stevenplyazz.helium.ExampleMod;
import net.fabricmc.api.ModInitializer;

public class HeliumFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Helium.init();
    }
}
