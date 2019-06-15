package me.mrcookies.dankbot.listeners;

import me.mrcookies.dankbot.main.DankBot;
import me.mrcookies.dankbot.utils.Methods;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.util.HashMap;
import java.util.Hashtable;

public class AboutCommand extends ListenerAdapter {

    private Methods m = new Methods();

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

        if (e.getAuthor().isBot()) return;

        User usr = e.getAuthor();

        if (e.getMessage().getContentDisplay().equalsIgnoreCase(DankBot.settings.getPrefix() + "about")) {

            TextChannel channel = e.getChannel();

            channel.sendMessage(m.createEmbed("Information", null, "Creator: Mr_Cookies", "Command executed by " + usr.getName(), null)).queue();
        }

    }

}
