package com.nightcap.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.nightcap.helpers.AssetLoader;

public class GameRenderer {
	private GameWorld world;
	private OrthographicCamera cam;
	private ShapeRenderer shapeRenderer;
	private SpriteBatch batcher;

	public GameRenderer(GameWorld world) {
		// TODO Auto-generated constructor stub
		this.world = world;
		cam = new OrthographicCamera();
		cam.setToOrtho(true, 960, 540);
		shapeRenderer = new ShapeRenderer();
		shapeRenderer.setProjectionMatrix(cam.combined);
		batcher = new SpriteBatch();
	}

	public void render(float runTime) {
        // Fill the entire screen with black, to prevent potential flickering.
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        // Begin SpriteBatch
        batcher.begin();
        // The bird needs transparency, so we enable that again.
        batcher.enableBlending();

        // Draw bird at its coordinates. Retrieve the Animation object from
        // AssetLoader
        // Pass in the runTime variable to get the current frame.
        batcher.draw(AssetLoader.charAnim.getKeyFrame(runTime),
                200, 200, 32, 48);

        // End SpriteBatch
        batcher.end();

	}

}
