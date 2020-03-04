package sh.chuu.port.mc.portchuuextras.contributors;

import com.google.common.collect.ImmutableList;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.List;

public class TheCodingGuy implements TabExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        TextComponent message1 = new TextComponent("Hi, I'm a contributor officially working with Simon on the Port Chuu plugins.");
        TextComponent message2 = new TextComponent("... imagine getting Helper or Staff xD");
        TextComponent message3 = new TextComponent("boom");

        message1.setColor(ChatColor.DARK_GREEN);
        message2.setColor(ChatColor.GREEN);
        message3.setColor(ChatColor.RED);

        sender.sendMessage(message1);
        sender.sendMessage(message2);
        sender.sendMessage(message3);

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String alias, String[] args) {
        return ImmutableList.of();
    }
}
