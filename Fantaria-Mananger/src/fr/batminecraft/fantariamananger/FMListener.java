package fr.batminecraft.fantariamananger;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class FMListener implements Listener {


	
	@EventHandler
	public void OnJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		String serverIP = Bukkit.getServer().getMotd();
		player.sendMessage(serverIP);
		if(serverIP.equals("server1")) {
			player.sendMessage("§2§lBienevenue sur §a§lFantaria §2§l!");
			player.performCommand("run54549874");
		}

		
	}
	
}
