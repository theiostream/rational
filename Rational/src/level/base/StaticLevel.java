package level.base;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import entity.Player;

public abstract class StaticLevel implements ILevel {
	private Player player;
	
	public Player getPlayer() {
		return player;
	}
	
	@Override
	public void init() throws SlickException {
		player = new Player(5, 455, false);
	}

	@Override
	public void update(int delta) throws SlickException {
		player.update(delta);
	}

	@Override
	public void draw(Graphics g) throws SlickException {
		player.draw(g);
	}
	
	public void keyPressed(int key, char c) {
		player.keyPressed(key, c);
	}
	
	public void keyReleased(int key, char c) {
		player.keyReleased(key, c);
	}
}
