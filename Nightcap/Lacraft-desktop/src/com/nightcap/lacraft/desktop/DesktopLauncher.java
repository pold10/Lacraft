package com.nightcap.lacraft.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.nightcap.lacraft.LacraftGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Lacraft";
        config.width = 720;
        config.height = 480;
		new LwjglApplication(new LacraftGame(), config);
	}
}
