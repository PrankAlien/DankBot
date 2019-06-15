package me.mrcookies.dankbot.listeners;

import me.mrcookies.dankbot.main.DankBot;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ListenerManager {

    public ListenerManager() {
        addEventListeners(new AboutCommand());
        System.out.println("DankBot > Events ready.");
    }

    private void addEventListeners(ListenerAdapter... listeners) {
        for (ListenerAdapter listener : listeners) {
            DankBot.api.addEventListener(listener);
        }
    }

}
