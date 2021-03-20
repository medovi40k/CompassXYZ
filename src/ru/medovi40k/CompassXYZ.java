package ru.medovi40k;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;



public class CompassXYZ extends JavaPlugin {
	public void onEnable(){
		File config = new File(getDataFolder() + File.separator + "config.yml");
		if(!config.exists()) {
			getLogger().info("Loading config");
			getConfig().options().copyDefaults(true);
			saveDefaultConfig();
		}
		Bukkit.getPluginManager().registerEvents(new Handler(this), this);
		getLogger().info("Enabled CompassXYZ");
	}
	public void onDisable() {
		getLogger().info("Disabled CompassXYZ");
	}
	
	
}
