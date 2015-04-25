package com.nightcap.lacraft;

import com.badlogic.gdx.Game;
import com.nightcap.helpers.AssetLoader;
import com.nightcap.screens.GameScreen;

public class LacraftGame extends Game {

	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new GameScreen());

	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
}
