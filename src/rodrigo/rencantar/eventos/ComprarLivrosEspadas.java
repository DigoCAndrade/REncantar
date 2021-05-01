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

public class ComprarLivrosEspadas implements Listener{
	
	@EventHandler
	public void anClick(InventoryClickEvent e) {
		if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR) return;
		if (!e.getView().getTitle().equals("Encantar - Espadas") || e.getClickedInventory().getHolder() != null) return;
		e.setCancelled(true);
		if (e.getCurrentItem().getItemMeta() == null || e.getCurrentItem().getItemMeta().getDisplayName() == null) return;
		if (e.getCurrentItem().getType() != Material.ENCHANTED_BOOK && e.getCurrentItem().getType() != Material.SKULL_ITEM && !e.getCurrentItem().getItemMeta().getDisplayName().equals("§aLivro Encantado") && !e.getCurrentItem().getItemMeta().getDisplayName().equals("§cVoltar")) return;
		if (e.getCurrentItem().getType() != Material.SKULL_ITEM && e.getCurrentItem().getItemMeta().getLore() == null) return;
		if (!(e.getWhoClicked() instanceof Player)) return;
		Player p = (Player) e.getWhoClicked();
		e.setCancelled(true);
		switch (e.getSlot()) {
		case 10:
			ItemStack afiacao4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Afiação IV").build();
			EncantarAPI.verificar(18, p, afiacao4);
			break;
		case 19:
			if (!p.hasPermission("rencantar.vip")) {
				p.sendMessage("§cApenas §6VIPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack afiacao5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Afiação V").build();
			EncantarAPI.verificar(21, p, afiacao5);
			break;
		case 28:
			if (!p.hasPermission("rencantar.vip+")) {
				p.sendMessage("§cApenas §6VIPs§b+ §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack afiacao6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Afiação VI").build();
			EncantarAPI.verificar(24, p, afiacao6);
			break;
		case 37:
			if (!p.hasPermission("rencantar.mvp")) {
				p.sendMessage("§cApenas §bMVPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack afiacao7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Afiação VII").build();
			EncantarAPI.verificar(27, p, afiacao7);
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
			ItemStack pilhagem4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Pilhagem IV").build();
			EncantarAPI.verificar(30, p, pilhagem4);
			break;
		case 23:
			if (!p.hasPermission("rencantar.vip")) {
				p.sendMessage("§cApenas §6VIPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack pilhagem5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Pilhagem V").build();
			EncantarAPI.verificar(38, p, pilhagem5);
			break;
		case 32:
			if (!p.hasPermission("rencantar.vip+")) {
				p.sendMessage("§cApenas §6VIPs§b+ §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack pilhagem6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Pilhagem VI").build();
			EncantarAPI.verificar(46, p, pilhagem6);
			break;
		case 41:
			if (!p.hasPermission("rencantar.mvp")) {
				p.sendMessage("§cApenas §bMVPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack pilhagem7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Pilhagem VII").build();
			EncantarAPI.verificar(54, p, pilhagem7);
			break;
		case 16:
			ItemStack aspectoflamejante4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Aspecto Flamejante IV").build();
			EncantarAPI.verificar(12, p, aspectoflamejante4);
			break;
		case 25:
			if (!p.hasPermission("rencantar.vip")) {
				p.sendMessage("§cApenas §6VIPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack aspectoflamejante5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Aspecto Flamejante V").build();
			EncantarAPI.verificar(15, p, aspectoflamejante5);
			break;
		case 34:
			if (!p.hasPermission("rencantar.vip+")) {
				p.sendMessage("§cApenas §6VIPs§b+ §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack aspectoflamejante6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Aspecto Flamejante VI").build();
			EncantarAPI.verificar(18, p, aspectoflamejante6);
			break;
		case 43:
			if (!p.hasPermission("rencantar.mvp")) {
				p.sendMessage("§cApenas §bMVPs §cpodem comprar este livro encantado.");
				return;
			}
			ItemStack aspectoflamejante7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Aspecto Flamejante VII").build();
			EncantarAPI.verificar(21, p, aspectoflamejante7);
			break;
		case 45:
			p.closeInventory();
			Bukkit.dispatchCommand(p, "encantar");
			break;
		}
	}
}
