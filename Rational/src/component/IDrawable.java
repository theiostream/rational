package component;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import component.coords.Point;
import component.coords.Rect;
import component.coords.Size;
import entity.Player;

public interface IDrawable {
	public void draw(Graphics g);
	public void keyPressed(int key, char c);
	public void keyReleased(int key, char c);
	public void mouseMoved(int oldx, int oldy, int newx, int newy);
	public void mousePressed(int button, int x, int y);
	public void mouseReleased(int button, int x, int y);
	public boolean intersectsUp(Drawable drawable);
	public boolean intersectsDown(Drawable drawable);
	public boolean intersectsLeft(Drawable drawable);
	public boolean intersectsRight(Drawable drawable);
	public float getX();
	public float getY();
	public Point getPoint();
	public float getWidth();
	public float getHeight();
	public float getMotionX();
	public float getMotionY();
	public Size getSize();
	public Rect getRect();
	public Color getColor();
	public Image getImage();
	public void setX(float x);
	public void setY(float y);
	public void setMotionX(float motionX);
	public void setMotionY(float motionY);
	public void setPoint(Point point);
	public void setWidth(float width);
	public void setHeight(float height);
	public void setSize(Size size);
	public void setRect(Rect rect);
	public void setSpeed(float speed);
	public void setColor(Color color);
	public void setColor(float r, float g, float b);
	public void setImage(Image image);
	public void moveRight();
	public void moveLeft();
	public void stopX();
	public void moveUp();
	public void moveDown();
	public void stopY();
	public void stop();
	void update(int delta, Player player, boolean check1, boolean check2,
			boolean check3, boolean check4, boolean check5, boolean check6);
	
}
