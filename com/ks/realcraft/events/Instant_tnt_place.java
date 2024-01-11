package com.ks.realcraft.events;

import com.ks.realcraft.craft.ItemControl;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class Instant_tnt_place implements Listener {

    @EventHandler
    public static void onBlockPlaceEvent(BlockPlaceEvent e) {
        Block block = e.getBlockPlaced();
        if (block.getType() == Material.TNT && e.getItemInHand().getItemMeta().getDisplayName().equals(ItemControl.unstable_tnt.getItemMeta().getDisplayName())) {
            Location location = e.getBlockPlaced().getLocation();
            World world = location.getWorld();
            block.setType(Material.AIR);
            assert world != null;
            for (int i=0;i<2;i++) {
                TNTPrimed tnt = (TNTPrimed) world.spawnEntity(location, EntityType.PRIMED_TNT);
                tnt.setFuseTicks(0);
            }
        }
    }

}
