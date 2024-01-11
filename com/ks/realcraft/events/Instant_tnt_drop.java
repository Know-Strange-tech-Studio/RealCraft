package com.ks.realcraft.events;

import com.ks.realcraft.craft.ItemControl;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class Instant_tnt_drop implements Listener {

    @EventHandler
    public static void onItemDrop(PlayerDropItemEvent e) {
        if (e.getItemDrop().getItemStack().getItemMeta().getDisplayName().equals(ItemControl.unstable_tnt.getItemMeta().getDisplayName())) {
            Location location = e.getItemDrop().getLocation();
            World world = location.getWorld();
            for (int i=0;i<2;i++) {
                TNTPrimed tnt = (TNTPrimed) world.spawnEntity(location, EntityType.PRIMED_TNT);
                tnt.setFuseTicks(0);
            }
        }
    }
}
