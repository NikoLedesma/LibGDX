package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.handlers.MyGdxGameStateManager;

public class MyGdxGame extends ApplicationAdapter {
	
	public static final String TITLE="Block Bunny";
	public static final int V_WIDTH = 320;
	public static final int V_HEIGHT = 240;
	public static final int SCALE = 2;
	
	public static final float STEP = 1 / 60f;
	public float accum;
	
	private SpriteBatch sb;
	private OrthographicCamera cam;
	private OrthographicCamera hudCam;
	
	private MyGdxGameStateManager gsm;

	
	
	SpriteBatch batch;
	Texture img;
	@Override
	public void create () {
		//batch = new SpriteBatch();
		//img = new Texture("badlogic.jpg");
		sb = new SpriteBatch();
		cam = new OrthographicCamera();
		cam.setToOrtho(false, V_WIDTH, V_HEIGHT);
		hudCam = new OrthographicCamera();
		hudCam.setToOrtho(false, V_WIDTH, V_HEIGHT);
		gsm= new MyGdxGameStateManager(this);
	}

	@Override
	public void render () {
		//Gdx.gl.glClearColor(1,0,0,1);
		//Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//batch.begin();
		//batch.draw(img, 0, 0);
		//batch.end();
		
		
		//float delta=Gdx.graphics.getDeltaTime();
		//gsm.render();
		
		accum+= Gdx.graphics.getDeltaTime();
		while(accum >=STEP){
			accum-= STEP;
			gsm.update(accum);
			gsm.render();
		}
		
	}
	
	@Override
	public void dispose () {
		//batch.dispose();
		//img.dispose();
	}	
	
	public SpriteBatch getSpriteBatch(){return sb;}
	public OrthographicCamera getCamera(){return cam;}
	public OrthographicCamera getHUDCamera(){return hudCam;}
	
	@Override
	public void resize (int width, int height) {
	}
	@Override
	public void pause () {
	}

	@Override
	public void resume () {
	}
	
	
	
	
	
}
