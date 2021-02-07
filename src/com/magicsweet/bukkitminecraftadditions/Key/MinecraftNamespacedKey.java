package com.magicsweet.bukkitminecraftadditions.Key;

import net.minecraft.server.v1_16_R3.MinecraftKey;

public class MinecraftNamespacedKey {
	String namespace;
	String key;
	
	public MinecraftNamespacedKey(String id) {
		this.namespace = id.split(":")[0];
		this.key = id.split(":")[1];
	}
	
	
	public static MinecraftNamespacedKey of(String id) {
		return new MinecraftNamespacedKey(id);
	}
	
	public MinecraftKey getMinecraftKey() {
		if (namespace.equals("minecraft")) {
			return new MinecraftKey(key);
		} else {
			return null;
		}
	}
	
}
