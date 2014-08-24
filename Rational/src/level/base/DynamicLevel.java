package level.base;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import entity.Player;

public abstract class DynamicLevel implements ILevel {
	private Player player;
	private BgObjList bgObjList;
	
	public Player getPlayer() {
		return player;
	}
	
	public BgObjList getObjList() {
		return bgObjList;
	}
	
	public DynamicLevel() {
		
	}
	
	@Override
	public void init() throws SlickException {
		System.out.println("Player?!");
		player = new Player(5, 455, false);
		System.out.println("hi");
		bgObjList = new BgObjList();
		System.out.println("Bye");
	}

	@Override
	public void update(int delta) throws SlickException {
		player.update(delta);
		bgObjList.update(delta, player, false);
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
