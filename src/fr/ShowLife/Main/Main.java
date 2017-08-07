package fr.ShowLife.Main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable(){
		registerCmds();
		
	}
	
	@Override
	public void onDisable(){
		
	}
	
	private void registerCmds(){
		getCommand("all-life").setExecutor(new Life());
		getCommand("life").setExecutor(new Life());
	}
	
	
}
