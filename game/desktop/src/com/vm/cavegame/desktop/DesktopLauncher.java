package com.vm.cavegame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.vm.cavegame.MainGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "CaveGame";
                config.resizable = true;
                
                
                // packs images, remove before final push           
                TexturePacker.Settings sets = new TexturePacker.Settings();
                sets.pot = true;
                sets.fast = true;
                sets.combineSubdirectories = true;
                sets.paddingX = 1;
                sets.paddingY = 1;
                TexturePacker.process("rawTextures", "./", "textures");
                new LwjglApplication(new MainGame(), config);
	}
}
