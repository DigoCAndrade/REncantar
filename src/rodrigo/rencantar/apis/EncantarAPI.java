package rodrigo.rencantar.apis;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class EncantarAPI {

	public static void verificar(Integer quantia, Player p, ItemStack premio) {
		ItemStack pedra = new ItemBuilder(Material.INK_SACK, 1, (short) 4).name("§9Pedra da Sabedoria")
				.lore("§7Utilize este fragmento de Pedra para", "§7comprar Livros em nosso sistema",
						"§7de encantamentos.")
				.glow().build();

		int check = 0;
		for (ItemStack item : p.getInventory().getContents()) {
			if (item == null) {
				check++;
			}
		}

		if (check < 1) {
			p.sendMessage("§cSeu inventário está cheio, esvazie-o e compre novamente.");
			p.closeInventory();
			return;
		}

		int quantiaorganizar = 0;
		for (int i = 0; i < p.getInventory().getSize(); i++) {
			ItemStack item = p.getInventory().getItem(i);
			if (item != null && item.getItemMeta() != null && item.getItemMeta().getDisplayName() != null
					&& item.getItemMeta().getLore() != null && item.getAmount() != 64) {
				if (item.getItemMeta().getDisplayName().equals(pedra.getItemMeta().getDisplayName())
						&& item.getType() == Material.INK_SACK
						&& item.getItemMeta().getLore().equals(pedra.getItemMeta().getLore())) {
					quantiaorganizar = quantiaorganizar + item.getAmount();
					p.getInventory().setItem(i, new ItemStack(Material.AIR));
				}
			}
		}
		if (!(quantiaorganizar <= 0)) {
			ItemStack pedraorganizar = pedra.clone();
			pedraorganizar.setAmount(quantiaorganizar);
			p.getInventory().addItem(pedraorganizar);
		}

		ArrayList<Integer> slot = new ArrayList<Integer>();
		int quantidade = 0;
		for (int i = 0; i < p.getInventory().getSize(); i++) {
			ItemStack item = p.getInventory().getItem(i);
			if (item != null && item.getItemMeta() != null && item.getItemMeta().getDisplayName() != null
					&& item.getItemMeta().getLore() != null) {
				if (item.getItemMeta().getDisplayName().equals(pedra.getItemMeta().getDisplayName())
						&& item.getType() == Material.INK_SACK
						&& item.getItemMeta().getLore().equals(pedra.getItemMeta().getLore())) {
					quantidade += item.getAmount();
					slot.add(i);
				}
			}
		}

		if (quantidade >= quantia) {
			for (Integer item : slot) {
				if (p.getInventory().getItem(item) != null) {
					int quantiaitem = p.getInventory().getItem(item).getAmount();
					if (quantiaitem > quantia) {
						p.getInventory().getItem(item).setAmount(quantiaitem - quantia);
						p.updateInventory();
						p.getInventory().addItem(premio);
						return;
					} else {
						if (quantidade == quantia) {
							if (slot.size() == 1) {
								p.getInventory().setItem(item, new ItemStack(Material.AIR));
								p.updateInventory();
								p.getInventory().addItem(premio);
							} else {
								for (Integer itens : slot) {
									p.getInventory().setItem(itens, new ItemStack(Material.AIR));
									p.updateInventory();
								}
								p.getInventory().addItem(premio);
							}
							return;
						}
					}
				}
			}
		} else {
			p.sendMessage("§cVocê precisa de §9" + quantia + " §9Pedras da Sabedoria §cpara comprar isto.");
			p.closeInventory();
		}
	}
}