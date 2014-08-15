package game;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public interface ILevel {
	public void init() throws SlickException;
	public void update(int delta) throws SlickException;
	public void draw(Graphics g) throws SlickException;
	public void keyPressed(int key, char c);
	public void keyReleased(int key, char c);
}
