package fr.batminecraft.fantariamananger.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commandFMevent implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] event_type) {
		Player player = (Player)sender;
		if(event_type.length == 0) {
			player.sendMessage("&4Erreur, argument(s) manquant(s) '<event_type>'");
		}
		if(event_type.length >= 1) {
			
			StringBuilder bc = new StringBuilder();
			for(String part : event_type) {
				bc.append(part + " ");
			}
			
			Bukkit.broadcastMessage("§7§l[§4§lEvent§7§l] §8- Event par: §4" + player.getName());
			Bukkit.broadcastMessage("§7-------------------------------------");
			Bukkit.broadcastMessage("§8- §6L'event consiste a : §7" + bc.toString());
			Bukkit.broadcastMessage("§8- §6Pour aller a l'event, veuillez allez sur le serveur 2,");
			Bukkit.broadcastMessage("  §6faire /go-to-event, vous serez tp au monde des events !");
			Bukkit.broadcastMessage("§8- §6Merci de votre attention, bon jeux !");
			Bukkit.broadcastMessage("§7-------------------------------------");
			
		}
		return false;
	}

}
