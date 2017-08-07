package fr.ShowLife.Main;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Life implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("life")){
			if(args.length == 1){
				String s = args[0];
				
					Player p = Bukkit.getPlayer(s);
					sender.sendMessage("§9§lLife >§r " + p.getName() + " : " + p.getHealth() + "");
			}else{
				sender.sendMessage("§9§lLife >§c Utilise : /life <Player>");
			}
		}else if(label.equalsIgnoreCase("all-life")){
			if(args.length == 0){
				for(Player p : Bukkit.getOnlinePlayers()){
					if(p.getGameMode() == GameMode.SURVIVAL){
						String s = "" + p.getHealth();
						switch (Integer.parseInt(s)) {
						case 1:
							sender.sendMessage("§9§lLife >§r " + p.getName() + " : ");
							break;
						}
					}
				}
			}else{
				sender.sendMessage("§9§lLife >§c Utilise : /all-life");
			}
		}
		
		return false;
	}
	
	
	
}
