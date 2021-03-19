package ru.medovi40k;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender.Spigot;
import org.bukkit.entity.Player;

//import java.util.HashMap;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

//import net.minecraft.server.v1_16_R3.ChatMessageType;
import net.minecraft.server.v1_16_R3.ItemStack;

//import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import net.DeeChael.ActionbarAPI.AAPI;



import org.bukkit.event.block.Action;
//import org.bukkit.event.player.PlayerInteractEvent;
//import org.bukkit.event.*;




public class h implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
//        ActionBar actionBar = new ActionBar(ChatColor.GOLD + "Hello world");
//        actionBar.sendToPlayer(event.getPlayer());
        if((event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) && event.getPlayer().getItemInHand().getType().equals(Material.COMPASS)){
        	String mess=event.getPlayer().getLocation().getBlockX() + " " + event.getPlayer().getLocation().getBlockY() + " " + event.getPlayer().getLocation().getBlockZ();
//        	Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "title " + event.getPlayer().getName() + " actionbar \"" + mess + "\"");
//        	String pl=event.getPlayer().getPlayerListName();
//        	Integer duration=20;
//        	Player player= event.getPlayer();
//        	AAPI.sendActionbar(player, mess);
            String message = mess;
            Player player = event.getPlayer();
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(message));
        }
    }
}

