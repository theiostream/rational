package component;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.TrueTypeFont;

public class TextBox implements ITextBox {

	private float x, y, width, height;
	private Color color;
	private String text;
	
	private static int Y_OFFSET = 15;
	
	public TextBox(float x, float y, float width, float height, String text, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.text = text;
		this.color = color;
	}
	
	public TextBox(float x, float y, float width, float height, String text, float red, float green, float blue) {
		this(x, y, width, height, text, new Color(red, green, blue));
	}
	
	@Override
	public void draw(Graphics g, TrueTypeFont f) {
		g.setColor(Color.white);
		g.drawRect(x, (float)y, (float)width, (float)height);
		float textX = x + ((width/2 - f.getWidth(text)/2));
		float textY = y + Y_OFFSET;
		f.drawString(textX, textY, text);
	}

	@Override
	public void update(int delta) {

	}

	@Override
	public void setLocation(float x, float y) {
		setX(x);
		setY(y);
	}

	@Override
	public void setX(float x) {
		this.x = x;
	}

	@Override
	public void setY(float y) {
		this.y = y;
	}

	@Override
	public void setWidth(float width) {
		this.width = width;
	}

	@Override
	public void setHeight(float height) {
		this.height = height;
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
	public double getX() {
		return x;
	}

	@Override
	public double getY() {
		return y;
	}

	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public double getHeight() {
		return height;
	}
	
	@Override
	public String getText(){
		return text;
	}

}
