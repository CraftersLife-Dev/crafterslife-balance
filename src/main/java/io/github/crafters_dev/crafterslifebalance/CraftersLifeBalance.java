package io.github.crafters_dev.crafterslifebalance;

import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class CraftersLifeBalance extends JavaPlugin {
    @Override
    public void onEnable() {
        var listener = new BalanceListener();
        this.getServer().getPluginManager().registerEvents(listener, this);
    }
}