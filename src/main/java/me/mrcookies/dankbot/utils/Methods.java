package me.mrcookies.dankbot.utils;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.MessageEmbed;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Methods {

    public Methods() {

    }

    public MessageEmbed createEmbed(String author, String aUrl, String desc, String footer, String fUrl) {
        EmbedBuilder builder = new EmbedBuilder();

        builder.setAuthor(author, aUrl);
        builder.setDescription(desc);
        builder.setFooter(footer, fUrl);

        return builder.build();
    }

    public MessageEmbed createEmbed(String author, String aUrl, String desc, String footer, String fUrl, HashMap<Hashtable<String, String>, Boolean>... fields) {
        EmbedBuilder builder = new EmbedBuilder();

        builder.setAuthor(author, aUrl);
        builder.setDescription(desc);

        for (HashMap<Hashtable<String, String>, Boolean> field : fields) {

            Map.Entry<Hashtable<String, String>, Boolean> f = field.entrySet().iterator().next();

            Map.Entry<String, String> fi = f.getKey().entrySet().iterator().next();

            builder.addField(fi.getKey(), fi.getValue(), f.getValue());

        }

        builder.setFooter(footer, fUrl);

        return builder.build();
    }

}
