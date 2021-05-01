package rodrigo.rencantar.eventos;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import rodrigo.rencantar.apis.EncantarAPI;
import rodrigo.rencantar.apis.ItemBuilder;

public class ComprarLivrosFerramentas implements Listener {

	@EventHandler
	public void anClick(InventoryClickEvent e) {
		if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR) return;
		if (!e.getView().getTitle().equals("Encantar - Ferramentas") || e.getClickedInventory().getHolder() != null) return;
		e.setCancelled(true);
		if (e.getCurrentItem().getItemMeta() == null || e.getCurrentItem().getItemMeta().getDisplayName() == null) return;
		if (e.getCurrentItem().getType() != Material.ENCHANTED_BOOK && e.getCurrentItem().getType() != Material.SKULL_ITEM && !e.getCurrentItem().getItemMeta().getDisplayName().equals("§aLivro Encantado") && !e.getCurrentItem().getItemMeta().getDisplayName().equals("§cVoltar")) return;
		if (e.getCurrentItem().getType() != Material.SKULL_ITEM && e.getCurrentItem().getItemMeta().getLore() == null) return;
		if (!(e.getWhoClicked() instanceof Player)) return;
		Player p = (Player) e.getWhoClicked();
		e.setCancelled(true);
		switch (e.getSlot()) {
		case 10:
			ItemStack eficiencia4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Eficiência IV").build();
			EncantarAPI.verificar(18, p, eficiencia4);
			break;
		case 19:
			if (!p.hasPermission("rencantar.vip")) {
				p.sendMessage("§cApenas §6VIPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack eficiencia5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Eficiência V").build();
			EncantarAPI.verificar(21, p, eficiencia5);
			break;
		case 28:
			if (!p.hasPermission("rencantar.vip+")) {
				p.sendMessage("§cApenas §6VIPs§b+ §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack eficiencia6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Eficiência VI").build();
			EncantarAPI.verificar(24, p, eficiencia6);
			break;
		case 37:
			if (!p.hasPermission("rencantar.mvp")) {
				p.sendMessage("§cApenas §bMVPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack eficiencia7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Eficiência VII").build();
			EncantarAPI.verificar(27, p, eficiencia7);
			break;
		case 12:
			ItemStack durabilidade4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Durabilidade IV").build();
			EncantarAPI.verificar(18, p, durabilidade4);
			break;
		case 21:
			if (!p.hasPermission("rencantar.vip")) {
				p.sendMessage("§cApenas §6VIPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack durabilidade5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Durabilidade V").build();
			EncantarAPI.verificar(21, p, durabilidade5);
			break;
		case 30:
			if (!p.hasPermission("rencantar.vip+")) {
				p.sendMessage("§cApenas §6VIPs§b+ §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack durabilidade6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Durabilidade VI").build();
			EncantarAPI.verificar(24, p, durabilidade6);
			break;
		case 39:
			if (!p.hasPermission("rencantar.mvp")) {
				p.sendMessage("§cApenas §bMVPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack durabilidade7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Durabilidade VII").build();
			EncantarAPI.verificar(27, p, durabilidade7);
			break;
		case 14:
			ItemStack fortuna4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Fortuna IV").build();
			EncantarAPI.verificar(24, p, fortuna4);
			break;
		case 23:
			if (!p.hasPermission("rencantar.vip")) {
				p.sendMessage("§cApenas §6VIPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack fortuna5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Fortuna V").build();
			EncantarAPI.verificar(25, p, fortuna5);
			break;
		case 32:
			if (!p.hasPermission("rencantar.vip+")) {
				p.sendMessage("§cApenas §6VIPs§b+ §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack fortuna6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Fortuna VI").build();
			EncantarAPI.verificar(28, p, fortuna6);
			break;
		case 41:
			if (!p.hasPermission("rencantar.mvp")) {
				p.sendMessage("§cApenas §bMVPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack fortuna7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Fortuna VII").build();
			EncantarAPI.verificar(31, p, fortuna7);
			break;
		case 16:
			ItemStack toquesuave = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Toque Suave I").build();
			EncantarAPI.verificar(22, p, toquesuave);
			break;
		case 45:
			p.closeInventory();
			Bukkit.dispatchCommand(p, "encantar");
			break;
		}
	}
}
