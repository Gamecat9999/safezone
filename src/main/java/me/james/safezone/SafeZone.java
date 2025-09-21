package me.james.safezone;

import me.james.safezone.commands.RemoveZoneCommand;
import me.james.safezone.commands.SetZoneCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class SafeZone extends JavaPlugin {
    private static SafeZone instance;
    private ZoneManager zoneManager;

    @Override
    public void onEnable() {
        instance = this;
        zoneManager = new ZoneManager();

        getCommand("safezone").setExecutor(new SetZoneCommand(zoneManager));
        getCommand("safezone").setTabCompleter(new SetZoneCommand(zoneManager)); // Optional tab completion
        getServer().getPluginManager().registerEvents(zoneManager, this);
    }

    public static SafeZone getInstance() {
        return instance;
    }

    public ZoneManager getZoneManager() {
        return zoneManager;
    }
}