package component;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.TrueTypeFont;

import component.coords.Rect;

public interface ITextBox {
	public void draw(Graphics g);
	public void update(int delta);
	public void setRect(Rect rect);
	public void setText(String text);
	public void setColor(Color color);
	public void setColor(float red, float green, float blue);
	public Rect getRect();
	public String getText();
	public Color getColor();
}