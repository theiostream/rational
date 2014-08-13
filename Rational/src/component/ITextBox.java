package component;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.TrueTypeFont;

public interface ITextBox {
	public void draw(Graphics g, TrueTypeFont f);
	public void update(int delta);
	public void setLocation(float x, float y);
	public void setX(float x);
	public void setY(float y);
	public void setWidth(float width);
	public void setHeight(float height);
	public void setText(String text);
	public void setColor(Color color);
	public void setColor(float red, float green, float blue);
	public double getX();
	public double getY();
	public double getWidth();
	public double getHeight();
	public String getText();
	public Color getColor();
}