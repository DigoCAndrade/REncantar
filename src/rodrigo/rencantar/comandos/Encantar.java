package rodrigo.rencantar.comandos;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import rodrigo.rencantar.apis.ItemBuilder;
public class Encantar implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String lbl, String[] args) {
		if (!(s instanceof Player)) {
			s.sendMessage("Apenas jogadores");
			return false;
		}
		
		Player p = (Player) s;
		Inventory encantar = Bukkit.createInventory(null, 3* 9, "Encantar - Início");
		
		ItemStack ferramentas = new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).name("§dFerramentas").lore("  §f▪ §7Eficiência", "  §f▪ §7Durabilidade", "  §f▪ §7Fortuna", "  §f▪ §7Toque Suave", "", "§aClique para abrir esta categoria."   ).head("http://textures.minecraft.net/texture/32ea85c85fe0484af6c815efb655d2b21e109863c96333b9280b59b80d6ac98f").glow().build();
		ItemStack armaduras = new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).name("§cArmaduras").lore("  §f▪ §7Proteção contra Explosões", "  §f▪ §7Proteção", "  §f▪ §7Durabilidade", "  §f▪ §7Peso Pena", "", "§aClique para abrir esta categoria.   ").head("http://textures.minecraft.net/texture/93a69c3caa31304e9952328c72cee0b57b2a2bd46ce9c5cb88c07d1266277d6a").glow().build();
		ItemStack espadas = new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).name("§bEspadas").lore("  §f▪ §7Afiação", "  §f▪ §7Durabilidade", "  §f▪ §7Aspecto Flamejante", "  §f▪ §7Pilhagem", "", "§aClique para abrir esta categoria.   ").head("http://textures.minecraft.net/texture/8be2baf40fd85eb573fe5b2e5b6c8817cf50f883d95769415807ab07288a47cd").glow().build();
		
		encantar.setItem(11, ferramentas);
		encantar.setItem(13, espadas);
		encantar.setItem(15, armaduras);

		p.openInventory(encantar);
		p.playSound(p.getLocation(), Sound.LEVEL_UP, 1f, 10f);
		return false;
	}
}
