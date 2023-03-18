package me.stevenplyazz.helium.forge;

import me.stevenplyazz.helium.ExampleExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class HeliumExpectPlatformImpl {
    /**
     * This is our actual method to {@link HeliumExpectPlatformImpl#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
