package game;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.TrueTypeFont;

public class Box {
	public static void MakeBox(Graphics g, String text, TrueTypeFont font) {
		int width = 500;
		int height = 100;
		
		g.setColor(Color.white);
		g.drawRect(Rational.getWidth()/2 - width/2, 25, width, height);
		
		font.drawString(Rational.getWidth()/2 - width/2 + 5, 30, text);
	}
}
