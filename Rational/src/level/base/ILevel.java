package level.base;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import entity.Player;

public interface ILevel {
	public void init() throws SlickException;
	public void update(int delta) throws SlickException;
	public void draw(Graphics g) throws SlickException;
	public void keyPressed(int key, char c);
	public void keyReleased(int key, char c);
	public void mouseMoved(int oldx, int oldy, int newx, int newy);
	public void mousePressed(int button, int x, int y);
	public void mouseReleased(int button, int x, int y);
	public ObjectList getObjectList();
	public Player getPlayer();
}
