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

public class UsarLivroEspada implements Listener{
	
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
		if (!item.getType().toString().contains("_SWORD") && !item.getType().toString().contains("_AXE")) return;
		
		if (book.getItemMeta().getLore().contains("§7Afiação IV")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL) && item.getItemMeta().getEnchantLevel(Enchantment.DAMAGE_ALL) >= 4) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 4);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL) && book.getItemMeta().getLore().contains("§7Afiação V")) {
			e.setCancelled(true);
			if (item.getItemMeta().getEnchantLevel(Enchantment.DAMAGE_ALL) >= 5) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Afiação VI")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL) && item.getItemMeta().getEnchantLevel(Enchantment.DAMAGE_ALL) >= 6) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 6);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Afiação VII")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.DAMAGE_ALL) && item.getItemMeta().getEnchantLevel(Enchantment.DAMAGE_ALL) >= 7) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
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
		}else if (book.getItemMeta().getLore().contains("§7Pilhagem IV")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_MOBS) && item.getItemMeta().getEnchantLevel(Enchantment.LOOT_BONUS_MOBS) >= 4) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 4);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Pilhagem V")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_MOBS) && item.getItemMeta().getEnchantLevel(Enchantment.LOOT_BONUS_MOBS) >= 5) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 5);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Pilhagem VI")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_MOBS) && item.getItemMeta().getEnchantLevel(Enchantment.LOOT_BONUS_MOBS) >= 6) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 6);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Pilhagem VII")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_MOBS) && item.getItemMeta().getEnchantLevel(Enchantment.LOOT_BONUS_MOBS) >= 7) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 7);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Aspecto Flamejante IV")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.FIRE_ASPECT) && item.getItemMeta().getEnchantLevel(Enchantment.FIRE_ASPECT) >= 4) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 4);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Aspecto Flamejante V")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.FIRE_ASPECT) && item.getItemMeta().getEnchantLevel(Enchantment.FIRE_ASPECT) >= 5) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Aspecto Flamejante VI")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.FIRE_ASPECT) && item.getItemMeta().getEnchantLevel(Enchantment.FIRE_ASPECT) >= 6) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 6);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Aspecto Flamejante VII")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.FIRE_ASPECT) && item.getItemMeta().getEnchantLevel(Enchantment.FIRE_ASPECT) >= 7) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 7);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}
	}

}
