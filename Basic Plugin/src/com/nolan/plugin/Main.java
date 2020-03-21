package com.nolan.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable(){
		System.out.println("MyHealthRestore is Enabled");
		
	}
	
	public void onDisable() {
		System.out.println("MyHealthRestore DISABLED");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
if (cmd.getName().equals("Restore")) {
			
			if(sender instanceof Player) {
				Player player = (Player) sender;
				
				//player.sendMessage(ChatColor.DARK_RED + "Hello" + ChatColor.GREEN + "!");
				player.sendMessage(ChatColor.GRAY + "Hello, " + ChatColor.GREEN + player.getName()+ " Your Health has been restored to full");
				player.setHealth(20.0);
			}else {
				System.out.println("You cannot use this command through console!");
			}
			
		}
		
		
if (cmd.getName().equals("Deplete")) {
			
			if(sender instanceof Player) {
				Player player = (Player) sender;
				
				//player.sendMessage(ChatColor.DARK_RED + "Hello" + ChatColor.GREEN + "!");
				player.sendMessage(ChatColor.GRAY + "Hello, " + ChatColor.GREEN + player.getName()+ " Your Health has been Depleated to .5 Hearts");
				player.setHealth(1);
			}else {
				System.out.println("You cannot use this command through console!");
			}
			
		}
			
	return false;
	}

}
