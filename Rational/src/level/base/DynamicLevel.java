package level.base;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import entity.Player;

public abstract class DynamicLevel implements ILevel {
	protected Player player;
	protected ObjectList objectList;
	
	public Player getPlayer() {
		return player;
	}
	
	public ObjectList getObjectList() {
		return objectList;
	}
	
	public DynamicLevel() {}
	
	@Override
	public void init() throws SlickException {
		player = new Player(5, 455, false);
		objectList = new ObjectList(true);
	}

	@Override
	public void update(int delta) throws SlickException {
		player.update(delta);
		objectList.update(delta, player, false);
	}

	@Override
	public void draw(Graphics g) throws SlickException {
		player.draw(g);
		objectList.draw(g);
	}
	
	@Override
	public void keyPressed(int key, char c) {
		player.keyPressed(key, c);
	}
	
	@Override
	public void keyReleased(int key, char c) {
		player.keyReleased(key, c);
		switch(key){
		case Keyboard.KEY_LEFT:
			objectList.stopX();
			break;
		case Keyboard.KEY_RIGHT:
			objectList.stopX();
			break;
		case Keyboard.KEY_UP:
			objectList.stopY();
			break;
		case Keyboard.KEY_DOWN:
			objectList.stopY();
			break;
		}
		
	}
	
	@Override
	public void mouseMoved(int oldx, int oldy, int newx, int newy){}
	
	@Override
	public void mousePressed(int button, int x, int y){}
	
	@Override
	public void mouseReleased(int button, int x, int y){}
}
