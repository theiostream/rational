package component;

import game.Rational;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.TrueTypeFont;

import component.coords.Rect;

public class TextBox extends Drawable implements ITextBox {
	
	private String text;
	
	private static int Y_OFFSET = 15;
	
	public TextBox(Rect rect, String text, Color color, ObjectType type) {
		super(rect, 0, 0, 0, color, false, null, type);
		this.text = text;
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
