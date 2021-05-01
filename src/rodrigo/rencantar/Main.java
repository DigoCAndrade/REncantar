package rodrigo.rencantar;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import rodrigo.rencantar.comandos.Encantar;
import rodrigo.rencantar.eventos.AoTacarEXP;
import rodrigo.rencantar.eventos.ComprarLivrosArmaduras;
import rodrigo.rencantar.eventos.ComprarLivrosEspadas;
import rodrigo.rencantar.eventos.ComprarLivrosFerramentas;
import rodrigo.rencantar.eventos.GanharPedraSabedoria;
import rodrigo.rencantar.eventos.SelecionarCategoria;
import rodrigo.rencantar.eventos.UsarLivroArmadura;
import rodrigo.rencantar.eventos.UsarLivroEspada;
import rodrigo.rencantar.eventos.UsarLivroFerramenta;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		getCommand("encantar").setExecutor(new Encantar());
		Bukkit.getPluginManager().registerEvents(new SelecionarCategoria(), this);
		Bukkit.getPluginManager().registerEvents(new GanharPedraSabedoria(), this);
		Bukkit.getPluginManager().registerEvents(new ComprarLivrosFerramentas(), this);
		Bukkit.getPluginManager().registerEvents(new ComprarLivrosEspadas(), this);
		Bukkit.getPluginManager().registerEvents(new ComprarLivrosArmaduras(), this);
		Bukkit.getPluginManager().registerEvents(new UsarLivroFerramenta(), this);
		Bukkit.getPluginManager().registerEvents(new UsarLivroEspada(), this);
		Bukkit.getPluginManager().registerEvents(new UsarLivroArmadura(), this);
		Bukkit.getPluginManager().registerEvents(new AoTacarEXP(), this);
	}
	
    public static void actionBar(Player player, String text) {
        IChatBaseComponent comp = IChatBaseComponent.ChatSerializer.a("{\"text\":\""+text+"\"}");
        PacketPlayOutChat packet = new PacketPlayOutChat(comp, (byte) 2);
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket(packet);
    }
}
