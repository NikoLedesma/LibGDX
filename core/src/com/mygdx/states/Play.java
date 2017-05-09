package com.mygdx.states;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.mygdx.handlers.MyGdxGameStateManager;

public class Play extends MyGdxGameState{

	private BitmapFont font = new BitmapFont();
	
	public Play(MyGdxGameStateManager gsm){
		super(gsm);
	}
	
	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float dt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		sb.setProjectionMatrix(cam.combined);
		sb.begin();
		font.draw(sb, "Play state", 100, 100);
		sb.end();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	
}
