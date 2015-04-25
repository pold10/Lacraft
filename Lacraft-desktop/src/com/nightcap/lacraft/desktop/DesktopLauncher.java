package com.nightcap.lacraft.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.nightcap.lacraft.LacraftGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = "Lacraft";
		config.width = 960;
		config.height = 540;
		
		
		
		
		new LwjglApplication(new LacraftGame(), config);
		
		
	}
}
