package com.nightcap.helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {

	public static Texture character;
	public static TextureRegion char1, char2, char3, char4, char5, char6,
			char7, char8, char9, char10, char11, char12, char13, char14,
			char15, char16;
	public static Animation charAnim;

	public static void load() {
		character = new Texture(Gdx.files.internal("data/character.png"));
		character.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
		char1 = new TextureRegion(character, 0, 0, 32, 48);
		char2 = new TextureRegion(character, 32, 0, 32, 48);
		char3 = new TextureRegion(character, 64, 0, 32, 48);
		char4 = new TextureRegion(character, 96, 0, 32, 48);
		char5 = new TextureRegion(character, 0, 48, 32, 48);
		char6 = new TextureRegion(character, 32, 48, 32, 48);
		char7 = new TextureRegion(character, 64, 48, 32, 48);
		char8 = new TextureRegion(character, 96, 48, 32, 48);
		char9 = new TextureRegion(character, 0, 96, 32, 48);
		char10 = new TextureRegion(character, 32, 96, 32, 48);
		char11 = new TextureRegion(character, 64, 96, 32, 48);
		char12 = new TextureRegion(character, 96, 96, 32, 48);
		char13 = new TextureRegion(character, 0, 144, 32, 48);
		char14 = new TextureRegion(character, 32, 144, 32, 48);
		char15 = new TextureRegion(character, 64, 144, 32, 48);
		char16 = new TextureRegion(character, 96, 144, 32, 48);
		// char1.flip(false, true);
		// char2.flip(false, true);
		// char3.flip(false, true);
		// char4.flip(false, true);
		// char5.flip(false, true);
		// char6.flip(false, true);
		// char7.flip(false, true);
		// char8.flip(false, true);
		// char9.flip(false, true);
		// char11.flip(false, true);
		// char12.flip(false, true);
		// char13.flip(false, true);
		// char14.flip(false, true);
		// char15.flip(false, true);
		// char16.flip(false, true);
		TextureRegion charList[] = { char1, char2, char3, char4, char5, char6,
				char7, char8, char9, char10, char11, char12, char13, char14,
				char15, char16 };
		charAnim = new Animation(0.3f, charList);
		charAnim.setPlayMode(Animation.PlayMode.LOOP);
	}

	public static void dispose() {
		// We must dispose of the texture when we are finished.
		character.dispose();
	}
}
