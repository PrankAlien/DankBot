package me.mrcookies.dankbot.utils;

import me.mrcookies.dankbot.configuration.ConfigManager;
import me.mrcookies.dankbot.main.DankBot;

import java.io.File;

public class Configuration {

    public static void loadSettings() {

        if (DankBot.config.getYml().getString("Settings.token").isEmpty()) {
            System.out.println("DankBot > NO BOT TOKEN FOUND!");
            return;
        }

        DankBot.settings = new Settings(
                DankBot.config.getYml().getString("Settings.token"),
                DankBot.config.getYml().getString("Prefix"),
                Configuration.class.getPackage().getImplementationVersion()
        );

    }

    public static void loadConfig() {
        DankBot.config = new ConfigManager("config", "DankBot");
        DankBot.config.addDefault("Prefix", "");
        DankBot.config.addDefault("Settings.token", "");
        DankBot.config.saveDefaults();
    }

    public static void loadFolders() {

        if (!new File("DankBot/Images").exists()) {
            new File("DankBot/Images").mkdir();
        }

    }

}
