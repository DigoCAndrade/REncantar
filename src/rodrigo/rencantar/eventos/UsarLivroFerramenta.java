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

public class UsarLivroFerramenta implements Listener{
	
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
		if (!item.getType().toString().contains("_AXE") && !item.getType().toString().contains("_PICKAXE") && !item.getType().toString().contains("_HOE") && !item.getType().toString().contains("_SPADE")) return;
		
		if (book.getItemMeta().getLore().contains("§7Eficiência IV")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.DIG_SPEED) && item.getItemMeta().getEnchantLevel(Enchantment.DIG_SPEED) >= 4) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			
			item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 4);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Eficiência V")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.DIG_SPEED) && item.getItemMeta().getEnchantLevel(Enchantment.DIG_SPEED) >= 5) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Eficiência VI")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.DIG_SPEED) && item.getItemMeta().getEnchantLevel(Enchantment.DIG_SPEED) >= 6) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 6);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Eficiência VII")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.DIG_SPEED) && item.getItemMeta().getEnchantLevel(Enchantment.DIG_SPEED) >= 7) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 7);
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
		}else if (book.getItemMeta().getLore().contains("§7Fortuna IV")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS) && item.getItemMeta().getEnchantLevel(Enchantment.LOOT_BONUS_BLOCKS) >= 4) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 4);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Fortuna V")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS) && item.getItemMeta().getEnchantLevel(Enchantment.LOOT_BONUS_BLOCKS) >= 5) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 5);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Fortuna VI")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS) && item.getItemMeta().getEnchantLevel(Enchantment.LOOT_BONUS_BLOCKS) >= 6) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 6);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Fortuna VII")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS) && item.getItemMeta().getEnchantLevel(Enchantment.LOOT_BONUS_BLOCKS) >= 7) {
				p.sendMessage("§cVocê já possui este encantamento ou superior a este.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 7);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}else if (book.getItemMeta().getLore().contains("§7Toque Suave I")) {
			e.setCancelled(true);
			if (item.getItemMeta().hasEnchant(Enchantment.SILK_TOUCH) && item.getItemMeta().getEnchantLevel(Enchantment.SILK_TOUCH) == 1) {
				p.sendMessage("§cVocê já possui este encantamento.");
				return;
			}
			item.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
			e.setCurrentItem(null);
			e.setCursor(item);
			p.playSound(p.getLocation(), Sound.ANVIL_USE, 0.7F, 1f);
		}
	}

}
