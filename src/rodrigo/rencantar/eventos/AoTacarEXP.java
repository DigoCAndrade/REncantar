package rodrigo.rencantar.eventos;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import rodrigo.rencantar.apis.ItemBuilder;

public class AoTacarEXP implements Listener{
	
	@EventHandler
	public void aoReceberEXP(ExpBottleEvent e) {
		e.setExperience(0);
	}
	
	@EventHandler
	public void aoTacarEXP(PlayerInteractEvent e) {
		if (e.getItem() == null || e.getItem().getType() != Material.EXP_BOTTLE) return;
		if (e.getItem().hasItemMeta()) return;
		Player p = (Player) e.getPlayer();
		int chance = new Random().nextInt(100 + 1);
		if (chance < 2) {
			ItemStack pedradasabedoria = new ItemBuilder(Material.INK_SACK, 1, (short) 4).name("§9Pedra da Sabedoria").lore("§7Utilize este fragmento de Pedra para", "§7comprar Livros em nosso sistema","§7de encantamentos.").glow().build();
			int check = 0;
			for (ItemStack itens : p.getInventory().getContents()) {
				if (itens == null) {
					check++;
				}
			}

			if (check < 1) {
				p.getWorld().dropItem(p.getLocation(), pedradasabedoria);
			}else {
				p.getInventory().addItem(pedradasabedoria);
			}
		}
	}
	
	@EventHandler
	public void aoGanharEXPBloco(BlockBreakEvent e) {
		e.setExpToDrop(0);
	}
	
	@EventHandler
	public void aoGanharEXPEntity(EntityDeathEvent e) {
		e.setDroppedExp(0);
	}
}
