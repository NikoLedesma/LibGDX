package com.mygdx.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGdxGame;
import com.mygdx.handlers.MyGdxGameStateManager;

public abstract class MyGdxGameState {

	protected MyGdxGameStateManager gsm;
	protected MyGdxGame game;

	protected SpriteBatch sb;

	protected OrthographicCamera cam;
	protected OrthographicCamera hudCam;

	protected MyGdxGameState(MyGdxGameStateManager gsm) {
		this.gsm = gsm;
		game = gsm.game();
		sb = game.getSpriteBatch();
		cam = game.getCamera();
		hudCam = game.getHUDCamera();
	}
	
	public abstract void handleInput();
	public abstract void update(float dt);
	public abstract void render();
	public abstract void dispose();

}
