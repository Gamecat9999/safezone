package me.james.safezone.commands;

import me.james.safezone.Zone;
import me.james.safezone.ZoneManager;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class SetZoneCommand implements CommandExecutor, TabCompleter {
    private final ZoneManager manager;

    public SetZoneCommand(ZoneManager manager) {
        this.manager = manager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        if (args.length != 4 || !args[0].equalsIgnoreCase("set")) return false;

        Player player = (Player) sender;
        String name = args[1];
        int width = Integer.parseInt(args[2]);
        int length = Integer.parseInt(args[3]);

        Zone zone = new Zone(name, player.getLocation(), width, length);
        manager.addZone(zone);
        player.sendMessage("SafeZone '" + name + "' created.");
        return true;
    }

    // Optional tab completion
    @Override
    public java.util.List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        return null;
    }
}