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

public class ComprarLivrosArmaduras implements Listener{
	
	@EventHandler
	public void anClick(InventoryClickEvent e) {
		if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR) return;
		if (!e.getView().getTitle().equals("Encantar - Armaduras") || e.getClickedInventory().getHolder() != null) return;
		e.setCancelled(true);
		if (e.getCurrentItem().getItemMeta() == null || e.getCurrentItem().getItemMeta().getDisplayName() == null) return;
		if (e.getCurrentItem().getType() != Material.ENCHANTED_BOOK && e.getCurrentItem().getType() != Material.SKULL_ITEM && !e.getCurrentItem().getItemMeta().getDisplayName().equals("§aLivro Encantado") && !e.getCurrentItem().getItemMeta().getDisplayName().equals("§cVoltar")) return;
		if (e.getCurrentItem().getType() != Material.SKULL_ITEM && e.getCurrentItem().getItemMeta().getLore() == null) return;
		if (!(e.getWhoClicked() instanceof Player)) return;
		Player p = (Player) e.getWhoClicked();
		switch (e.getSlot()) {
		case 10:
			ItemStack protecaoexplosoes4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção contra Explosões IV").build();
			EncantarAPI.verificar(12, p, protecaoexplosoes4);
			break;
		case 19:
			if (!p.hasPermission("rencantar.vip")) {
				p.sendMessage("§cApenas §6VIPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack protecaoexplosoes5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção contra Explosões V").build();
			EncantarAPI.verificar(15, p, protecaoexplosoes5);
			break;
		case 28:
			if (!p.hasPermission("rencantar.vip+")) {
				p.sendMessage("§cApenas §6VIPs§b+ §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack protecaoexplosoes6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção contra Explosões VI").build();
			EncantarAPI.verificar(18, p, protecaoexplosoes6);
			break;
		case 37:
			if (!p.hasPermission("rencantar.mvp")) {
				p.sendMessage("§cApenas §bMVPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack protecaoexplosoes7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção contra Explosões VII").build();
			EncantarAPI.verificar(21, p, protecaoexplosoes7);
			break;
		case 12:
			ItemStack protecao4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção IV").build();
			EncantarAPI.verificar(18, p, protecao4);
			break;
		case 21:
			if (!p.hasPermission("rencantar.vip")) {
				p.sendMessage("§cApenas §6VIPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack protecao5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção V").build();
			EncantarAPI.verificar(21, p, protecao5);
			break;
		case 30:
			if (!p.hasPermission("rencantar.vip+")) {
				p.sendMessage("§cApenas §6VIPs§b+ §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack protecao6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção VI").build();
			EncantarAPI.verificar(24, p, protecao6);
			break;
		case 39:
			if (!p.hasPermission("rencantar.mvp")) {
				p.sendMessage("§cApenas §bMVPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack protecao7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção VII").build();
			EncantarAPI.verificar(27, p, protecao7);
			break;
		case 14:
			ItemStack durabilidade4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Durabilidade IV").build();
			EncantarAPI.verificar(18, p, durabilidade4);
			break;
		case 23:
			if (!p.hasPermission("rencantar.vip")) {
				p.sendMessage("§cApenas §6VIPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack durabilidade5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Durabilidade V").build();
			EncantarAPI.verificar(21, p, durabilidade5);
			break;
		case 32:
			if (!p.hasPermission("rencantar.vip+")) {
				p.sendMessage("§cApenas §6VIPs§b+ §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack durabilidade6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Durabilidade VI").build();
			EncantarAPI.verificar(24, p, durabilidade6);
			break;
		case 41:
			if (!p.hasPermission("rencantar.mvp")) {
				p.sendMessage("§cApenas §bMVPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack durabilidade7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Durabilidade VII").build();
			EncantarAPI.verificar(27, p, durabilidade7);
			break;
		case 16:
			ItemStack pesopena4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Peso Pena IV").build();
			EncantarAPI.verificar(12, p, pesopena4);
			break;
		case 25:
			if (!p.hasPermission("rencantar.vip")) {
				p.sendMessage("§cApenas §6VIPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack pesopena5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Peso Pena V").build();
			EncantarAPI.verificar(15, p, pesopena5);
			break;
		case 34:
			if (!p.hasPermission("rencantar.vip+")) {
				p.sendMessage("§cApenas §6VIPs§b+ §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack pesopena6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Peso Pena VI").build();
			EncantarAPI.verificar(18, p, pesopena6);
			break;
		case 43:
			if (!p.hasPermission("rencantar.mvp")) {
				p.sendMessage("§cApenas §bMVPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack pesopena7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Peso Pena VII").build();
			EncantarAPI.verificar(21, p, pesopena7);
			break;
		case 45:
			p.closeInventory();
			Bukkit.dispatchCommand(p, "encantar");
			break;
		}
	}
}
