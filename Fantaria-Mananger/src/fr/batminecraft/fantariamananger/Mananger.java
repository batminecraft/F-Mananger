package fr.batminecraft.fantariamananger;

import org.bukkit.plugin.java.JavaPlugin;

import fr.batminecraft.fantariamananger.commands.commandFMevent;
import fr.batminecraft.fantariamananger.commands.commandFMinfo;


public class Mananger extends JavaPlugin {

	@Override
	public void onEnable() {
		getCommand("fm-info").setExecutor(new commandFMinfo());
		getCommand("fm-event").setExecutor(new commandFMevent());
		System.out.println("Fantaria-Mananger - Plugin mis en mode on");
		getServer().getPluginManager().registerEvents(new FMListener(), this);
		
	}
	
	@Override
	public void onDisable() {
		
		System.out.println("Fantaria-Mananger - Plugin mis en mode off");
		
	}
}
