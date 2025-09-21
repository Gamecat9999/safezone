package me.james.safezone;

import org.bukkit.Location;

public class Zone {
    private final String name;
    private final Location center;
    private final int width;
    private final int length;

    public Zone(String name, Location center, int width, int length) {
        this.name = name;
        this.center = center;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public Location getCenter() {
        return center;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public boolean contains(Location loc) {
        if (!loc.getWorld().equals(center.getWorld())) return false;

        int dx = Math.abs(loc.getBlockX() - center.getBlockX());
        int dz = Math.abs(loc.getBlockZ() - center.getBlockZ());

        return dx <= width / 2 && dz <= length / 2;
    }
}