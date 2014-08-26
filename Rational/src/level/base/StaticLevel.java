package level.base;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import entity.Player;
import game.Rational;

public abstract class StaticLevel implements ILevel {
	protected Player player;
	protected ObjectList objectList;
	
	public Player getPlayer() {
		return player;
	}
	
	public ObjectList getObjectList() {
		return objectList;
	}
	
	@Override
	public void init() throws SlickException {
		player = new Player(5, 455, false);
		objectList = new ObjectList(false);
	}

	@Override
	public void update(int delta) throws SlickException {
		player.update(delta);
		
		if (player.getRect().origin.x < 0) {
			switchLevel(LevelDirection.LEFT);
		}
		else if (player.getRect().origin.x > Rational.getWidth() - player.getRect().size.width) {
			switchLevel(LevelDirection.RIGHT);
		}
		else if (player.getRect().origin.y < 0) {
			switchLevel(LevelDirection.UP);
		}
		else if (player.getRect().origin.y > Rational.getHeight() - player.getRect().size.height) {
			switchLevel(LevelDirection.DOWN);
		}
	}

	@Override
	public void draw(Graphics g) throws SlickException {
		player.draw(g);
		objectList.draw(g);
	}
	
	public void keyPressed(int key, char c) {
		player.keyPressed(key, c);
	}
	
	public void keyReleased(int key, char c) {
		player.keyReleased(key, c);
	}
	
	public void switchLevel(LevelDirection direction) {
		
	}
}
