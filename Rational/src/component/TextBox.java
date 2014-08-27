package component;

import game.Rational;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.TrueTypeFont;

import component.coords.Point;
import component.coords.Rect;
import component.coords.Size;

public class TextBox extends Drawable implements ITextBox {
	
	private String text;
	
	private static int Y_OFFSET = 15;
	
	public TextBox(Rect rect, String text, Color color) {
		super(new Point(rect.getX(), rect.getY()), new Size(rect.getWidth(), rect.getHeight()), 0, 0, 0, color, false);
		this.text = text;
	}
	
	public TextBox(Rect rect, String text, Image image) {
		super(new Point(rect.getX(), rect.getY()), new Size(rect.getWidth(), rect.getHeight()), 0, 0, 0, Color.white, image);
		this.text = text;
	}
	
	public TextBox(float x, float y, float width, float height, String text, Color color) {
		this(new Rect(new Point(x, y), new Size(width, height)), text, color);
	}
	
	public TextBox(float x, float y, float width, float height, Image image, String text) {
		this(new Rect(new Point(x, y), new Size(width, height)), text, image);
	}
	
	public TextBox(Point point, Size size, Image image, String text) {
		this(new Rect(point, size), text, image);
	}
	
	public TextBox(Point point, Size size, String text) {
		this(new Rect(point, size), text, Color.white);
	}
	
	public TextBox(float x, float y, float width, float height, String text) {
		this(new Rect(new Point(x, y), new Size(width, height)), text, Color.white);
	}
	
	public TextBox(Point point, Size size, Color color, String text) {
		this(new Rect(point, size), text, color);
	}
	
	public TextBox(float x, float y, float width, float height, Color color, String text) {
		this(new Rect(new Point(x, y), new Size(width, height)), text, color);
	}

	@Override
	public void draw(Graphics g) {
		super.draw(g);
		TrueTypeFont f = Rational.getGame().getGameFont();

		float textX = getX() + ((getWidth()/2 - f.getWidth(text)/2));
		float textY = getY() + Y_OFFSET;
		f.drawString(textX, textY, text);
	}

	@Override
	public void update(int delta) {

	}
	
	@Override
	public void setText(String text){
		this.text = text;
	}
	
	@Override
	public String getText(){
		return text;
	}

}
