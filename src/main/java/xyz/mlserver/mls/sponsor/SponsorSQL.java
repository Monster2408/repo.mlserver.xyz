package xyz.mlserver.mls.sponsor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import xyz.mlserver.java.Log;
import xyz.mlserver.java.sql.DataBase;
import xyz.mlserver.java.sql.mysql.MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public class SponsorSQL {

    private static DataBase dataBase;

    /**
     *
     * @param plugin JavaPlugin
     * @param uuid (String) UUID of Player
     * @param i    Add sponsor month
     *
     */
    public static void savePlayer(Plugin plugin, String uuid, int i) {
        Plugin highFLib = Bukkit.getPluginManager().getPlugin("HighFunctionalityLib");
        if (highFLib == null) {
            Log.error("はいふぁんくしょなりてぃりぶぅがないよ～");
            return;
        }
        if (dataBase == null) {
            dataBase = new DataBase(plugin, new MySQL(
                    MySQL.getDataBaseFromHFL(highFLib),
                    MySQL.getPortFromHFL(highFLib),
                    MySQL.getDataBaseFromHFL(highFLib),
                    MySQL.getUsernameFromHFL(highFLib),
                    MySQL.getPasswordFromHFL(highFLib)
            ));
        }
        Date sponsorTime = getSponsorTime(dataBase, uuid);

        String key;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        if (i <= 0) {
            key = "null";
        } else if (sponsorTime == null) {
            Date date = new Date();
            calendar.setTime(date);

            calendar.add(Calendar.MONTH, i);

            key = df.format(calendar.getTime());
        } else {

            df.setLenient(false);
            String s1 = df.format(sponsorTime);
            try {
                calendar.setTime(df.parse(s1));
                calendar.add(Calendar.MONTH, i);
                key = df.format(calendar.getTime());
            } catch (ParseException e) {
                key = "null";
            }
        }

        if (!key.equalsIgnoreCase("null")) {
            if (Bukkit.getPlayer(UUID.fromString(uuid)) != null) Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage(ChatColor.AQUA + "あなたは本日から" + df.format(calendar.getTime()) + "までスポンサーです。");
        }

        String sql = "insert into new_sponsor (uuid, date) "
                + "VALUES (?, ?) "
                +"ON DUPLICATE KEY UPDATE "
                +"uuid=?, "
                +"date=?;";
        try(Connection con = dataBase.getDataSource().getConnection();
            PreparedStatement prestat = con.prepareStatement(sql)) {
            prestat.setString(1, uuid);
            prestat.setString(2, key);
            prestat.setString(3, uuid);
            prestat.setString(4, key);
            prestat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void savePlayer(Plugin plugin, UUID uuid, int i) {
        savePlayer(plugin, uuid.toString(), i);
    }

    /**
     * @deprecated
     * @param uuid
     * @param i
     */
    public static void savePlayer(String uuid, int i) {
        savePlayer(dataBase, uuid, i);
    }

    /**
     * @deprecated
     * @param uuid
     * @param i
     */
    public static void savePlayer(UUID uuid, int i) {
        savePlayer(dataBase, uuid.toString(), i);
    }

    public static void savePlayer(DataBase dataBase, String uuid, int i) {
        Date sponsorTime = getSponsorTime(dataBase, uuid);

        String key;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        if (i <= 0) {
            key = "null";
        } else if (sponsorTime == null) {
            Date date = new Date();
            calendar.setTime(date);

            calendar.add(Calendar.MONTH, i);

            key = df.format(calendar.getTime());
        } else {

            df.setLenient(false);
            String s1 = df.format(sponsorTime);
            try {
                calendar.setTime(df.parse(s1));
                calendar.add(Calendar.MONTH, i);
                key = df.format(calendar.getTime());
            } catch (ParseException e) {
                key = "null";
            }
        }

        if (!key.equalsIgnoreCase("null")) {
            if (Bukkit.getPlayer(UUID.fromString(uuid)) != null) Bukkit.getPlayer(UUID.fromString(uuid)).sendMessage(ChatColor.AQUA + "あなたは本日から" + df.format(calendar.getTime()) + "までスポンサーです。");
        }

        String sql = "insert into new_sponsor (uuid, date) "
                + "VALUES (?, ?) "
                +"ON DUPLICATE KEY UPDATE "
                +"uuid=?, "
                +"date=?;";
        try(Connection con = dataBase.getDataSource().getConnection();
            PreparedStatement prestat = con.prepareStatement(sql)) {
            prestat.setString(1, uuid);
            prestat.setString(2, key);
            prestat.setString(3, uuid);
            prestat.setString(4, key);
            prestat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param uuid UUID of Player
     * @param i    Add sponsor month
     *
     */
    public static void savePlayer(DataBase dataBase, UUID uuid, int i) {
        savePlayer(dataBase, uuid.toString(), i);
    }

    /**
     * 毎回データベースをなめるのはなんかいやだからの変数
     */
    private static HashMap<String, Date> sponsorTime;
    /**
     * sponsorTimeを最後にアップデートした日時
     */
    private static HashMap<String, Date> sponsorTimeLastUpdate;

    /**
     *
     * @param  uuid - (String)UUID of Player
     * @return Date - Number of days remaining in the sponsorship period
     */
    public static Date getSponsorTime(DataBase dataBase, String uuid) {
        if (sponsorTime == null) sponsorTime = new HashMap<>();
        if (sponsorTimeLastUpdate == null) sponsorTimeLastUpdate = new HashMap<>();

        if (sponsorTimeLastUpdate.get(uuid) != null && sponsorTime.get(uuid) != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date()); // 現在時刻取得

            calendar.add(Calendar.MINUTE, -5); // 現在から5分前

            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(sponsorTimeLastUpdate.get(uuid));

            if(calendar1.after(calendar)){ // 前回のロードが現在から5分前よりも未来なら
                return sponsorTime.get(uuid);
            }
        }

        String sql = "SELECT * FROM new_sponsor where uuid=?;";
        try(Connection con = dataBase.getDataSource().getConnection();
            PreparedStatement prestat = con.prepareStatement(sql)) {
            prestat.setString(1, uuid);
            ResultSet result = prestat.executeQuery();
            if (result.next()) {
                result.beforeFirst();
                result.next();
                String strDate = result.getString(2);
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date sponsorDate = dateFormat.parse(strDate);
                sponsorTime.put(uuid, sponsorDate);
                sponsorTimeLastUpdate.put(uuid, new Date());
                return sponsorDate;
            }
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @param  uuid - UUID of Player
     * @return Date - Number of days remaining in the sponsorship period
     */
    public static Date getSponsorTime(DataBase dataBase, UUID uuid) {
        return getSponsorTime(dataBase, uuid.toString());
    }

    /**
     * Player is sponsor
     * @param uuid - UUID of Player
     * @return
     */
    public static boolean isSponsor(DataBase dataBase, UUID uuid) {
        Date date = getSponsorTime(dataBase, uuid);
        Date today = new Date();
        if (date == null) return false;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return !calendar.after(today);
    }

    public static boolean isSponsor(Date date) {
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return !calendar.after(today);
    }

}