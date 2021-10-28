package fr.batminecraft.fantariamananger.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commandFMinfo implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] arg3) {
		if(sender instanceof Player) {
			Player player = (Player)sender;
			player.sendMessage("§7_________________________");
			player.sendMessage("§7- §6Fantaria Mananger");
			player.sendMessage("§7- §4version: §61.0 bêta");
			player.sendMessage("§7- §4Auteur: §6BatMinecraft");
			player.sendMessage("§7_________________________");
		}
		return false;
	}

}
