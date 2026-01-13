package com.example.basicplugin;

import com.hypixel.hytale.logger.HytaleLogger;
import java.util.logging.Level;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import javax.annotation.Nonnull;

/**
 * Main entry point for the Basic Hytale Plugin.
 * <p>
 * This class extends {@link JavaPlugin} and handles the plugin's lifecycle
 * events.
 */
public class BasicPlugin extends JavaPlugin {

    // Logger instance for this class, automatically named after the class.
    private static final HytaleLogger logger = HytaleLogger.forEnclosingClass();

    public BasicPlugin(@Nonnull JavaPluginInit init) {
        super(init);
    }

    /**
     * Called when the plugin is enabled.
     * Use this for initialization logic like registering commands or event
     * listeners.
     */
    @Override
    protected void setup() {
        super.setup();
        logger.at(Level.INFO).log("=============================");
        logger.at(Level.INFO).log("BasicPlugin has been enabled!");
        logger.at(Level.INFO).log("=============================");
    }
}
