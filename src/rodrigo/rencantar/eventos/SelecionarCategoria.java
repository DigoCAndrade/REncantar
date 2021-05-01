package rodrigo.rencantar.eventos;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import rodrigo.rencantar.apis.ItemBuilder;

public class SelecionarCategoria implements Listener{
	
	@EventHandler
	public void aoClicar(InventoryClickEvent e) {
		if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR) return;
		if (!e.getView().getTitle().equals("Encantar - Início")) return;
		if (e.getCurrentItem().getItemMeta() == null || e.getCurrentItem().getItemMeta().getDisplayName() == null || e.getCurrentItem().getItemMeta().getLore() == null) return;
		if (!(e.getWhoClicked() instanceof Player)) return;
		Player p = (Player) e.getWhoClicked();
		e.setCancelled(true);
		
		ItemStack voltar = new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).name("§cVoltar").head("http://textures.minecraft.net/texture/bd69e06e5dadfd84e5f3d1c21063f2553b2fa945ee1d4d7152fdc5425bc12a9").build();
		ItemStack info = new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).name("§eInformações").lore("§7Minere e consiga §fPedras da Sabedoria", "§7use-as para comprar livros. Os livros", "§7são utilizados para aprimorar espadas,", "§7ferramentas e armaduras.").head("http://textures.minecraft.net/texture/badc048a7ce78f7dad72a07da27d85c0916881e5522eeed1e3daf217a38c1a").build();
		ItemStack durabilidade4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Durabilidade IV", "", "  §f▪ §7Custo: §918 Pedras da Sabedoria   ", "").build();
		ItemStack durabilidade5 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Durabilidade V", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§c.   ", "").build();
		ItemStack durabilidade6 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Durabilidade VI", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§b+§c.   ", "").build();
		ItemStack durabilidade7 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Durabilidade VII", "", "  §f▪ §cEncantamento exclusivo para §bMVPs§c.   ", "").build();
		if (p.hasPermission("rencantar.vip")) durabilidade5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Durabilidade V", "", "  §f▪ §7Custo: §921 Pedras da Sabedoria   ", "").build();
		if (p.hasPermission("rencantar.vip+"))  durabilidade6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Durabilidade VI", "", "  §f▪ §7Custo: §924 Pedras da Sabedoria   ", "").build();
		if (p.hasPermission("rencantar.mvp")) durabilidade7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Durabilidade VII", "", "  §f▪ §7Custo: §927 Pedras da Sabedoria   ", "").build();
		
		switch (e.getSlot()) {
		case 11:
			Inventory ferramentas = Bukkit.createInventory(null, 6 * 9, "Encantar - Ferramentas");
			
			ItemStack eficiencia4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Eficiência IV", "", "  §f▪ §7Custo: §918 Pedras da Sabedoria   ", "").build();
			ItemStack eficiencia5 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Eficiência V", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§c.   ", "").build();
			ItemStack eficiencia6 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Eficiência VI", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§b+§c.   ", "").build();
			ItemStack eficiencia7 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Eficiência VII", "", "  §f▪ §cEncantamento exclusivo para §bMVPs§c.   ", "").build();
			if (p.hasPermission("rencantar.vip")) eficiencia5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Eficiência V", "", "  §f▪ §7Custo: §921 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.vip+"))  eficiencia6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Eficiência VI", "", "  §f▪ §7Custo: §924 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.mvp")) eficiencia7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Eficiência VII", "", "  §f▪ §7Custo: §927 Pedras da Sabedoria   ", "").build();
			
			ItemStack fortuna4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Fortuna IV", "", "  §f▪ §7Custo: §922 Pedras da Sabedoria   ", "").build();
			ItemStack fortuna5 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Fortuna V", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§c.   ", "").build();
			ItemStack fortuna6 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Fortuna VI", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§b+§c.   ", "").build();
			ItemStack fortuna7 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Fortuna VII", "", "  §f▪ §cEncantamento exclusivo para §bMVPs§c.   ", "").build();
			if (p.hasPermission("rencantar.vip")) fortuna5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Fortuna V", "", "  §f▪ §7Custo: §925 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.vip+"))  fortuna6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Fortuna VI", "", "  §f▪ §7Custo: §928 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.mvp")) fortuna7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Fortuna VII", "", "  §f▪ §7Custo: §931 Pedras da Sabedoria   ", "").build();
			
			ItemStack toquesuave = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Toque Suave I", "", "  §f▪ §7Custo: §916 Pedras da Sabedoria   ", "").build();
			
			ferramentas.setItem(10, eficiencia4);
			ferramentas.setItem(19, eficiencia5);
			ferramentas.setItem(28, eficiencia6);
			ferramentas.setItem(37, eficiencia7);
			
			ferramentas.setItem(12, durabilidade4);
			ferramentas.setItem(21, durabilidade5);
			ferramentas.setItem(30, durabilidade6);
			ferramentas.setItem(39, durabilidade7);
			
			ferramentas.setItem(14, fortuna4);
			ferramentas.setItem(23, fortuna5);
			ferramentas.setItem(32, fortuna6);
			ferramentas.setItem(41, fortuna7);
			
			ferramentas.setItem(16, toquesuave);
			
			ferramentas.setItem(45, voltar);
			ferramentas.setItem(53, info);
			
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1f, 10f);
			p.openInventory(ferramentas);
			break;
		case 13:
			Inventory espadas = Bukkit.createInventory(null, 6 * 9, "Encantar - Espadas");
			
			ItemStack afiacao4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Afiação IV", "", "  §f▪ §7Custo: §918 Pedras da Sabedoria   ", "").build();
			ItemStack afiacao5 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Afiação V", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§c.   ", "").build();
			ItemStack afiacao6 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Afiação VI", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§b+§c.   ", "").build();
			ItemStack afiacao7 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Afiação VII", "", "  §f▪ §cEncantamento exclusivo para §bMVPs§c.   ", "").build();
			if (p.hasPermission("rencantar.vip")) afiacao5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Afiação V", "", "  §f▪ §7Custo: §921 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.vip+"))  afiacao6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Afiação VI", "", "  §f▪ §7Custo: §924 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.mvp")) afiacao7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Afiação VII", "", "  §f▪ §7Custo: §927 Pedras da Sabedoria   ", "").build();
			
			ItemStack pilhagem4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Pilhagem IV", "", "  §f▪ §7Custo: §930 Pedras da Sabedoria   ", "").build();
			ItemStack pilhagem5 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Pilhagem V", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§c.   ", "").build();
			ItemStack pilhagem6 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Pilhagem VI", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§b+§c.   ", "").build();
			ItemStack pilhagem7 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Pilhagem VII", "", "  §f▪ §cEncantamento exclusivo para §bMVPs§c.   ", "").build();
			if (p.hasPermission("rencantar.vip")) pilhagem5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Pilhagem V", "", "  §f▪ §7Custo: §938 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.vip+"))  pilhagem6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Pilhagem VI", "", "  §f▪ §7Custo: §946 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.mvp")) pilhagem7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Pilhagem VII", "", "  §f▪ §7Custo: §954 Pedras da Sabedoria   ", "").build();
			
			ItemStack aspectoflamejante4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Aspecto Flamejante IV", "", "  §f▪ §7Custo: §912 Pedras da Sabedoria   ", "").build();
			ItemStack aspectoflamejante5 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Aspecto Flamejante V", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§c.   ", "").build();
			ItemStack aspectoflamejante6 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Aspecto Flamejante VI", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§b+§c.   ", "").build();
			ItemStack aspectoflamejante7 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Aspecto Flamejante VII", "", "  §f▪ §cEncantamento exclusivo para §bMVPs§c.   ", "").build();
			if (p.hasPermission("rencantar.vip")) aspectoflamejante5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Aspecto Flamejante V", "", "  §f▪ §7Custo: §915 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.vip+"))  aspectoflamejante6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Aspecto Flamejante VI", "", "  §f▪ §7Custo: §918 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.mvp")) aspectoflamejante7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Aspecto Flamejante VII", "", "  §f▪ §7Custo: §921 Pedras da Sabedoria   ", "").build();
			
			
			espadas.setItem(10, afiacao4);
			espadas.setItem(19, afiacao5);
			espadas.setItem(28, afiacao6);
			espadas.setItem(37, afiacao7);
			
			espadas.setItem(12, durabilidade4);
			espadas.setItem(21, durabilidade5);
			espadas.setItem(30, durabilidade6);
			espadas.setItem(39, durabilidade7);
			
			espadas.setItem(14, pilhagem4);
			espadas.setItem(23, pilhagem5);
			espadas.setItem(32, pilhagem6);
			espadas.setItem(41, pilhagem7);
			
			espadas.setItem(16, aspectoflamejante4);
			espadas.setItem(25, aspectoflamejante5);
			espadas.setItem(34, aspectoflamejante6);
			espadas.setItem(43, aspectoflamejante7);
			
			espadas.setItem(45, voltar);
			espadas.setItem(53, info);
			
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1f, 10f);
			p.openInventory(espadas);
			break;
		case 15:
			Inventory armaduras = Bukkit.createInventory(null, 6 * 9, "Encantar - Armaduras");
			
			ItemStack protecaoexplosoes4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção contra Explosões IV", "", "  §f▪ §7Custo: §912 Pedras da Sabedoria   ", "").build();
			ItemStack protecaoexplosoes5 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Proteção contra Explosões V", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§c.   ", "").build();
			ItemStack protecaoexplosoes6 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Proteção contra Explosões VI", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§b+§c.   ", "").build();
			ItemStack protecaoexplosoes7 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Proteção contra Explosões VII", "", "  §f▪ §cEncantamento exclusivo para §bMVPs§c.   ", "").build();
			if (p.hasPermission("rencantar.vip")) protecaoexplosoes5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção contra Explosões V", "", "  §f▪ §7Custo: §915 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.vip+"))  protecaoexplosoes6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção contra Explosões VI", "", "  §f▪ §7Custo: §918 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.mvp")) protecaoexplosoes7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção contra Explosões VII", "", "  §f▪ §7Custo: §921 Pedras da Sabedoria   ", "").build();
			
			ItemStack protecao4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção IV", "", "  §f▪ §7Custo: §918 Pedras da Sabedoria   ", "").build();
			ItemStack protecao5 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Proteção V", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§c.   ", "").build();
			ItemStack protecao6 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Proteção VI", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§b+§c.   ", "").build();
			ItemStack protecao7 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Proteção VII", "", "  §f▪ §cEncantamento exclusivo para §bMVPs§c.   ", "").build();
			if (p.hasPermission("rencantar.vip")) protecao5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção V", "", "  §f▪ §7Custo: §921 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.vip+"))  protecao6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção VI", "", "  §f▪ §7Custo: §924 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.mvp")) protecao7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Proteção VII", "", "  §f▪ §7Custo: §927 Pedras da Sabedoria   ", "").build();
			
			ItemStack pesopena4 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Peso-Pena IV", "", "  §f▪ §7Custo: §912 Pedras da Sabedoria   ", "").build();
			ItemStack pesopena5 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Peso-Pena V", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§c.   ", "").build();
			ItemStack pesopena6 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Peso-Pena VI", "", "  §f▪ §cEncantamento exclusivo para §6VIPs§b+§c.   ", "").build();
			ItemStack pesopena7 = new ItemBuilder(Material.BOOK).name("§aLivro Encantado").lore("§7Peso-Pena VII", "", "  §f▪ §cEncantamento exclusivo para §bMVPs§c.   ", "").build();
			if (p.hasPermission("rencantar.vip")) pesopena5 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Peso-Pena V", "", "  §f▪ §7Custo: §915 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.vip+"))  pesopena6 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Peso-Pena VI", "", "  §f▪ §7Custo: §918 Pedras da Sabedoria   ", "").build();
			if (p.hasPermission("rencantar.mvp")) pesopena7 = new ItemBuilder(Material.ENCHANTED_BOOK).name("§aLivro Encantado").lore("§7Peso-Pena VII", "", "  §f▪ §7Custo: §921 Pedras da Sabedoria   ", "").build();
			
			armaduras.setItem(10, protecaoexplosoes4);
			armaduras.setItem(19, protecaoexplosoes5);
			armaduras.setItem(28, protecaoexplosoes6);
			armaduras.setItem(37, protecaoexplosoes7);
			
			armaduras.setItem(12, protecao4);
			armaduras.setItem(21, protecao5);
			armaduras.setItem(30, protecao6);
			armaduras.setItem(39, protecao7);
			
			armaduras.setItem(14, durabilidade4);
			armaduras.setItem(23, durabilidade5);
			armaduras.setItem(32, durabilidade6);
			armaduras.setItem(41, durabilidade7);
			
			armaduras.setItem(16, pesopena4);
			armaduras.setItem(25, pesopena5);
			armaduras.setItem(34, pesopena6);
			armaduras.setItem(43, pesopena7);
			
			armaduras.setItem(45, voltar);
			armaduras.setItem(53, info);
			
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1f, 10f);
			p.openInventory(armaduras);
			break;
		}
	}
}
