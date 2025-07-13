package io.github.crafters_dev.crafterslifebalance;

import org.bukkit.Material;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.player.PlayerInteractEvent;


public class BalanceListener implements Listener {
    @EventHandler
    void onExperienceOrbSpawn(EntitySpawnEvent event) {
        if (event.getEntity() instanceof ExperienceOrb) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    void onPlayerUseRocket(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getItem() == null) {
            return;
        }
        if (event.getItem().getType() != Material.FIREWORK_ROCKET) {
            return;
        }
        if (player.isGliding()) {
            event.setCancelled(true);
        }
    }

}