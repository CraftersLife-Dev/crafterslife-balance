package io.github.crafters_dev.crafterslifebalance;

import io.papermc.paper.plugin.bootstrap.BootstrapContext;
import io.papermc.paper.plugin.bootstrap.PluginBootstrap;
import io.papermc.paper.plugin.bootstrap.PluginProviderContext;
import org.bukkit.plugin.java.JavaPlugin;
import org.jspecify.annotations.NullMarked;

@NullMarked
@SuppressWarnings({"UnstableApiUsage","unused"})
public class CraftersLifeBalanceBootstrap implements PluginBootstrap {
    @Override
    public void bootstrap(BootstrapContext bootstrapContext) {
    }

    @Override
    public JavaPlugin createPlugin(PluginProviderContext context) {
        return new CraftersLifeBalance();
    }
}