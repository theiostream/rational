package component;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.TrueTypeFont;

import component.coords.Rect;

public class TextBox implements ITextBox {
	private Rect rect;
	private Color color;
	private String text;
	
	private static int Y_OFFSET = 15;
	
	public TextBox(Rect rect, String text, Color color) {
		this.rect = rect;
		this.text = text;
		this.color = color;
	}
	
	public TextBox(Rect rect, String text, float red, float green, float blue) {
		this(rect, text, new Color(red, green, blue));
	}
	
	@Override
	public void draw(Graphics g, TrueTypeFont f) {
		g.setColor(Color.white);
		g.drawRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
		float textX = rect.getX() + ((rect.getWidth()/2 - f.getWidth(text)/2));
		float textY = rect.getY() + Y_OFFSET;
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
	public Color getColor() {
		return this.color;
	}
	
	@Override
	public void setColor(Color color){
		this.color = color;
	}
	
	@Override
	public void setColor(float red, float green, float blue){
		this.color = new Color(red, green, blue);
	}
	
	@Override
	public String getText(){
		return text;
	}

	@Override
	public void setRect(Rect rect) {
		this.rect = rect;
	}

	@Override
	public Rect getRect() {
		return this.rect;
	}

}
