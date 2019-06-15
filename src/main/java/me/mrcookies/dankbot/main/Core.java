package me.mrcookies.dankbot.main;

import me.mrcookies.dankbot.listeners.ListenerManager;
import me.mrcookies.dankbot.utils.Configuration;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;

public class Core {

    public static void main(String[] args) throws Exception {

        Configuration.loadConfig();
        Configuration.loadFolders();
        Configuration.loadSettings();

        DankBot.api = new JDABuilder(AccountType.BOT)
                .setToken(DankBot.settings.getToken())
                .setStatus(OnlineStatus.ONLINE)
                .setGame(Game.playing("with you..."))
                .build()
                .awaitReady();

        new ListenerManager();
        System.out.println("DankBot > Bot ready to use.");
    }

}
