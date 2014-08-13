package game;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public interface ILevel {
	public void init() throws SlickException;
	public void update(int delta) throws SlickException;
	public void render(Graphics g) throws SlickException;
	
}
