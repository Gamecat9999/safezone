# 🔐 SafeZone Plugin

Protect your realm with precision. SafeZone lets server admins create rectangular zones where PvP, mob damage, and block breaking are disabled. Perfect for spawn areas, shops, or sacred spaces.

---

## 📦 Features

- Create safe zones with `/safezone set <name> <width> <length>`
- Remove zones with `/safezone remove <name>`
- Zones centered on player location
- Protection from:
  - PvP
  - Mob damage
  - Block breaking
- Lightweight and fast—no external dependencies

---

## ⚙️ Commands

### `/safezone set <name> <width> <length>`
Creates a rectangular zone centered on the player.

### `/safezone remove <name>`
Removes the specified zone.

---

## 🧠 How It Works

- Zones are stored in memory (config persistence coming soon)
- Protection is enforced via event listeners
- Zones are world-specific and rectangular (X/Z axis)
- Easy to extend with visual markers, permissions, or height limits

---

## 🛠️ Setup

1. Clone or download the repo
2. Build with Maven:
   ```bash
   mvn clean package
