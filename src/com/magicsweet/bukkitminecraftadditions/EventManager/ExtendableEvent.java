package com.magicsweet.bukkitminecraftadditions.EventManager;

import org.bukkit.event.Listener;

import com.magicsweet.bukkitminecraftadditions.Main.Main;

public abstract class ExtendableEvent implements Listener {

	public ExtendableEvent() {
		Main.getPlugin(Main.class).getServer().getPluginManager().registerEvents(this, Main.getPlugin(Main.class));
	}
}
