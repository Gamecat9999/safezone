package me.james.safezone;

import org.bukkit.Location;
import org.bukkit.event.*;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.*;

public class ZoneManager implements Listener {
    private final Map<String, Zone> zones = new HashMap<>();

    public void addZone(Zone zone) {
        zones.put(zone.getName().toLowerCase(), zone);
    }

    public void removeZone(String name) {
        zones.remove(name.toLowerCase());
    }

    public boolean isInZone(Location loc) {
        return zones.values().stream().anyMatch(z -> z.contains(loc));
    }

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        if (isInZone(event.getEntity().getLocation())) event.setCancelled(true);
    }

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        if (isInZone(event.getBlock().getLocation())) event.setCancelled(true);
    }
}