package level.levels;

import level.base.StaticLevel;

import org.newdawn.slick.Color;
import org.newdawn.slick.SlickException;

public class FirstLevel extends StaticLevel {
	@Override
	public void init() throws SlickException {
		super.init();
		
		objectList.addBgObj(300f, 50f, 50f, 500f, Color.white, true);
		objectList.addTextBox(50, 50, 300, 50, Color.blue, "Bozo");
		objectList.addButton(150, 450, 300, 50, Color.cyan, "test", "test");
	}
}
