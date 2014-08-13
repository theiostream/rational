package font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.util.ResourceLoader;

public class Fonts {
	public static TrueTypeFont gameFont() throws FontFormatException, IOException {
		
		InputStream inputStream = ResourceLoader.getResourceAsStream("font/res/8bit.ttf");
		Font awtFont = Font.createFont(Font.TRUETYPE_FONT, inputStream);
		awtFont = awtFont.deriveFont(20f);
		
		return new TrueTypeFont(awtFont, false);
	}
}
