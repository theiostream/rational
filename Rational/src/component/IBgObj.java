package component;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public interface IBgObj {
	public void setX(float x);
	public void setY(float y);
	public void setWidth(float width);
	public void setHeight(float height);
	public void setColor(Color color);
	public void setColor(float r, float g, float b);
	public void setImage(Image image);
	public void setSpeed(float speed);
	public void moveRight();
	public void moveLeft();
	public void stopX();
	public void moveUp();
	public void moveDown();
	public void stopY();
	public void stop();
	public float getX();
	public float getY();
	public float getWidth();
	public float getHeight();
	public Color getColor();
	public Image getImage();
	public void update(int delta);
	public void draw(Graphics g);
	public void keyPressed(int key, char c);
	public void keyReleased(int key, char c);
}
