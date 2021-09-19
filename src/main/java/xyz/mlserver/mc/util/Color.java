package xyz.mlserver.mc.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import xyz.mlserver.mls.sponsor.SponsorSQL;

import java.util.HashMap;

public class Color {

    public static HashMap<String, String> playerDisplayColor;

    public static String replaceColorCode(String source) {
        if (source == null)
            return null;
        return ChatColor.translateAlternateColorCodes('&', source);
    }

    public static String deleteColorCode(String source) {
        if (source == null)
            return null;
        return ChatColor.stripColor(source);
    }

    public static ChatColor getNameToColor(String color) {
        switch (color.toLowerCase()) {
            case "black":
                return ChatColor.BLACK;
            case "dark_blue":
                return ChatColor.DARK_BLUE;
            case "dark_green":
                return ChatColor.DARK_GREEN;
            case "aqua":
                return ChatColor.AQUA;
            case "dark_red":
                return ChatColor.DARK_RED;
            case "purple":
                return ChatColor.DARK_PURPLE;
            case "gold":
                return ChatColor.GOLD;
            case "gray":
                return ChatColor.GRAY;
            case "dark_gray":
                return ChatColor.DARK_GRAY;
            case "blue":
                return ChatColor.BLUE;
            case "green":
                return ChatColor.GREEN;
            case "dark_aqua":
                return ChatColor.DARK_AQUA;
            case "red":
                return ChatColor.RED;
            case "pink":
                return ChatColor.LIGHT_PURPLE;
            case "yellow":
                return ChatColor.YELLOW;
            case "white":
                return ChatColor.WHITE;
            default:
                return null;
        }
    }

    public static String getColor(Player player) {
        if (playerDisplayColor == null) playerDisplayColor = new HashMap<>();
        playerDisplayColor.putIfAbsent(player.getUniqueId().toString(), ChatColor.LIGHT_PURPLE.toString());
        if (!SponsorSQL.isSponsor(player.getUniqueId()) && !player.isOp()) playerDisplayColor.put(player.getUniqueId().toString(), ChatColor.LIGHT_PURPLE.toString());
        return playerDisplayColor.get(player.getUniqueId().toString());
    }

}