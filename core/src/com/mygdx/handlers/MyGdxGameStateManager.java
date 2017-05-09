package com.mygdx.handlers;

import java.util.Stack;

import com.mygdx.game.MyGdxGame;
import com.mygdx.states.MyGdxGameState;
import com.mygdx.states.Play;

public class MyGdxGameStateManager {

	private MyGdxGame game;

	private Stack<MyGdxGameState> gameStates;

	public static final int PLAY = 912837;

	public MyGdxGameStateManager(MyGdxGame game) {
		this.game = game;
		gameStates = new Stack<MyGdxGameState>();
		pushState(PLAY);
	}

	public MyGdxGame game() { return game; }

	public void update(float dt) {
		gameStates.peek().update(dt);
	}

	public void render() {
		gameStates.peek().render();
	}
	
	
	private MyGdxGameState getState(int state){
		if(state==PLAY) return new Play(this);
		return null;
	}

	
	public void pushState(int state){
		gameStates.push(getState(state));
	}
	
	
	public void popState(){
		MyGdxGameState g = gameStates.pop();
		g.dispose();
	}
	
	
	
	
	
	
}
