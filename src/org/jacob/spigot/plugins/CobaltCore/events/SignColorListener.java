package org.jacob.spigot.plugins.CobaltCore.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

public class SignColorListener implements Listener {

    @EventHandler
    public void signChange(SignChangeEvent event) {
        String[] lines = event.getLines();
        for (int n = 0; n <= 3; n++)
            event.setLine(n, ChatColor.translateAlternateColorCodes('&', lines[n]));
    }

}
