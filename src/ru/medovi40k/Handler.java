package ru.medovi40k;	


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender.Spigot;
import org.bukkit.entity.Player;



import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import net.minecraft.server.v1_16_R3.ItemStack;

import org.bukkit.event.player.PlayerMoveEvent;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;



import org.bukkit.event.block.Action;



public class Handler implements Listener {
	@SuppressWarnings("unused")
	private CompassXYZ plugin;
	public Handler(CompassXYZ plugin){
		this.plugin = plugin;
	}

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
    	
        String X = plugin.getConfig().getString("messages.X");
        String Y = plugin.getConfig().getString("messages.Y");
        String Z = plugin.getConfig().getString("messages.Z");
        if((event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) && event.getPlayer().getItemInHand().getType().equals(Material.COMPASS)){
        	
        	String mess= X + event.getPlayer().getLocation().getBlockX() + " " + Z +  event.getPlayer().getLocation().getBlockY() + " "  + Y + event.getPlayer().getLocation().getBlockZ();
            String message = ChatColor.translateAlternateColorCodes('&', mess);; 

            Player player = event.getPlayer();
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(message));
            
        }
    }
}

