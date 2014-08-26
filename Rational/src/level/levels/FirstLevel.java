package level.levels;

import level.base.StaticLevel;

import org.newdawn.slick.Color;
import org.newdawn.slick.SlickException;

import component.TextBox;
import component.coords.Rect;

public class FirstLevel extends StaticLevel {
	@Override
	public void init() throws SlickException {
		super.init();
		
		objectList.add(300f, 50f, 50f, 500f, Color.white, true);
		objectList.add(new TextBox(new Rect(50, 50, 300, 50), "Bozo", Color.blue));
	}
}
