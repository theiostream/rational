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
	
	@Override
	public void keyPressed(int key, char c) {
		player.keyPressed(key, c);
	}
	
	@Override
	public void keyReleased(int key, char c) {
		player.keyReleased(key, c);
	}
	
	@Override
	public void mouseMoved(int oldx, int oldy, int newx, int newy){
		objectList.mouseMoved(oldx, oldy, newx, newy);
	}
	
	@Override
	public void mousePressed(int button, int x, int y){
		objectList.mousePressed(button, x, y);
	}
	
	@Override
	public void mouseReleased(int button, int x, int y){
		objectList.mouseReleased(button, x, y);
	}
	
	public void switchLevel(LevelDirection direction) {
		
	}
}
