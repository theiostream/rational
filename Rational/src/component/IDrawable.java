package component;

import org.newdawn.slick.Graphics;

import component.Coords.Point;
import component.Coords.Rect;
import component.Coords.Size;

public interface IDrawable {
	public void draw(Graphics g);
	public void update(int delta);
	public void keyPressed(int key, char c);
	public void keyReleased(int key, char c);
	public void intersects(Drawable drawable);
	public float getX();
	public float getY();
	public Point getPoint();
	public float getWidth();
	public float getHeight();
	public Size getSize();
	public Rect getRect();
	public void setX(float x);
	public void setY(float y);
	public void setPoint(Point point);
	public void setWidth(float width);
	public void setHeight(float height);
	public void setSize(Size size);
	public void setRect(Rect rect);
	public void setSpeed(float speed);
	public void moveRight();
	public void moveLeft();
	public void stopX();
	public void moveUp();
	public void moveDown();
	public void stopY();
	public void stop();
}
