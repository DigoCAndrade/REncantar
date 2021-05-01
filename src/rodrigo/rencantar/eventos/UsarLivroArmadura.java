package rodrigo.rencantar.eventos;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class UsarLivroArmadura implements Listener{
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		ItemStack item = e.getCurrentItem();
		ItemStack book = e.getCursor();
		if (e.getClick() != ClickType.LEFT) return;
		if (book == null || item == null || book.getType() == Material.AIR || item.getType() == Material.AIR) return;
		if (book.getItemMeta() == null || book.getItemMeta().getDisplayName() == null || book.getItemMeta().getLore() == null) return;
		if (!book.getItemMeta().getDisplayName().equals("§aLivro Encantado") || book.getType() != Material.ENCHANTED_BOOK || book.getAmount() != 1 || item.getType() == Material.AIR) return;
		if (!item.getType().toString().contains("_BOOTS") && !item.getType().toString().contains("_HELMET") && !item.getType().toString().contains("_CHESTPLATE") && !item.getType().toString().contains("_LEGGINS")) return;
		
		if (book.getItemMeta().getLore().contains("§7Proteção contra Explosões IV")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.PROTECTION_EXPLOSIONS) && item.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_EXPLOSIONS) >= 4) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 4);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Proteção contra Explosões V")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.PROTECTION_EXPLOSIONS) && item.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_EXPLOSIONS) >= 5) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Proteção contra Explosões VI")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.PROTECTION_EXPLOSIONS) && item.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_EXPLOSIONS) >= 6) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 6);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Proteção contra Explosões VII")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.PROTECTION_EXPLOSIONS) && item.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_EXPLOSIONS) >= 7) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 7);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Durabilidade IV")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.DURABILITY) && item.getItemMeta().getEnchantLevel(Enchantment.DURABILITY) >= 4) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Durabilidade V")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.DURABILITY) && item.getItemMeta().getEnchantLevel(Enchantment.DURABILITY) >= 5) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Durabilidade VI")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.DURABILITY) && item.getItemMeta().getEnchantLevel(Enchantment.DURABILITY) >= 6) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 6);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Durabilidade VII")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.DURABILITY) && item.getItemMeta().getEnchantLevel(Enchantment.DURABILITY) >= 7) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 7);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Proteção IV")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL) && item.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_ENVIRONMENTAL) >= 4) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Proteção V")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL) && item.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_ENVIRONMENTAL) >= 5) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Proteção VI")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL) && item.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_ENVIRONMENTAL) >= 6) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Proteção VII")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL) && item.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_ENVIRONMENTAL) >= 7) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Peso-Pena IV")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.PROTECTION_FALL) && item.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_FALL) >= 4) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 4);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Peso-Pena V")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.PROTECTION_FALL) && item.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_FALL) >= 5) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 5);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Peso-Pena VI")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.PROTECTION_FALL) && item.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_FALL) >= 6) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 6);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Peso-Pena VII")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.PROTECTION_FALL) && item.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_FALL) >= 7) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 7);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}
	}

}
