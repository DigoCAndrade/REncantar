package rodrigo.rencantar.eventos;


import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import rodrigo.rencantar.Main;
import rodrigo.rencantar.apis.ItemBuilder;

public class GanharPedraSabedoria implements Listener {

	@EventHandler
	public void aoQuebrar(BlockBreakEvent e) {
		if (!e.getBlock().getWorld().getName().equalsIgnoreCase("mina"))
			return;
		if (e.getBlock().getType() != Material.LAPIS_ORE)
			return;
		Player p = e.getPlayer();
		ItemStack pedradasabedoria = new ItemBuilder(Material.INK_SACK, 1, (short) 4).name("§9Pedra da Sabedoria").lore("§7Utilize este fragmento de Pedra para", "§7comprar Livros em nosso sistema", "§7de encantamentos.").glow().build();
		Main.actionBar(p, "§aVocê encontrou uma §9Pedra da Sabedoria§a!");
		p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1f, 1f);
		int check = 0;
		for (ItemStack itens : p.getInventory().getContents()) {
			if (itens == null) {
				check++;
			}
		}
		p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1f, 7.5f);
		if (check < 1) {
			p.getWorld().dropItem(p.getLocation(), pedradasabedoria);
			Main.actionBar(p, "§cSeu inventário está cheio, portanto o minério foi dropado no chão.");
		} else {
			p.getInventory().addItem(pedradasabedoria);
		}
	}
}
