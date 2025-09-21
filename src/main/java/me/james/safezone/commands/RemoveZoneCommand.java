package me.james.safezone.commands;

import me.james.safezone.ZoneManager;
import org.bukkit.command.*;

public class RemoveZoneCommand implements CommandExecutor {
    private final ZoneManager manager;

    public RemoveZoneCommand(ZoneManager manager) {
        this.manager = manager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length != 2 || !args[0].equalsIgnoreCase("remove")) return false;

        String name = args[1];
        manager.removeZone(name);
        sender.sendMessage("SafeZone '" + name + "' removed.");
        return true;
    }
}