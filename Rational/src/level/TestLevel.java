package level;

import entity.Player;
import game.ILevel;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class TestLevel implements ILevel {
	
	Player player;
	BgObjList bgObjList = new BgObjList();
	
	public TestLevel() {
		player = new Player(5, 455);
		bgObjList.add(5, 255, 150, 50, false);
		bgObjList.add(405, 155, 100, 75, true);
		bgObjList.add(600, 90, 50, 125, Color.cyan, true);
	}

	@Override
	public void init() throws SlickException {
		
	}

	@Override
	public void update(int delta) throws SlickException {
		player.update(delta);
		bgObjList.update(delta, player);
	}

	@Override
	public void draw(Graphics g) throws SlickException {
		player.draw(g);
		bgObjList.draw(g);
	}
	
	public void keyPressed(int key, char c) {
		player.keyPressed(key, c);
	}
	
	public void keyReleased(int key, char c) {
		player.keyReleased(key, c);
		switch(key){
		case Keyboard.KEY_LEFT:
			bgObjList.stopX();
			break;
		case Keyboard.KEY_RIGHT:
			bgObjList.stopX();
			break;
		case Keyboard.KEY_UP:
			bgObjList.stopY();
			break;
		case Keyboard.KEY_DOWN:
			bgObjList.stopY();
			break;
		}
		
	}

}
