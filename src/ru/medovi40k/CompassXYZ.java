package ru.medovi40k;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;



public class CompassXYZ extends JavaPlugin {
	public void onEnable(){
		getLogger().info("enabled 1231 2133 12 3");
		Bukkit.getPluginManager().registerEvents(new h(), this);
	}
	public void onDisable() {
		getLogger().info("disabledasdafssd sdf sd");
	}
	
	
}
