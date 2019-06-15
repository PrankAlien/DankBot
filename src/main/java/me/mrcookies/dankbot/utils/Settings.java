package me.mrcookies.dankbot.utils;

public class Settings {

    private String token;
    private String prefix;

    Settings(String token, String prefix, String version) {
        this.token = token;
        this.prefix = prefix;
    }

    public String getToken() {
        return this.token;
    }

    public String getPrefix() {
        return this.prefix;
    }

}
