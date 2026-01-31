package com.json_practice;

public class CensorshipUtils {

    public static String maskTeamName(String teamName) {
        if (teamName == null) return null;
        return teamName.replaceAll(".", "*"); // masks all characters with *
    }

    public static String redactPlayer(String playerName) {
        if (playerName == null) return null;
        return playerName.replaceAll(".", "#"); // redacts with #
    }
}
