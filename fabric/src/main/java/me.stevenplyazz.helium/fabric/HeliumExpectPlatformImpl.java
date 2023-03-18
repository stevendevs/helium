package me.stevenplyazz.helium.fabric;

import me.stevenplyazz.helium.ExampleExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class HeliumExpectPlatformImpl {
    /**
     * This is our actual method to {@link HeliumExpectPlatformImpl#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
