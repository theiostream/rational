package level.levels;

import enemy.TestEnemy;
import level.base.DynamicLevel;

import org.newdawn.slick.Color;
import org.newdawn.slick.SlickException;

public class TestLevel extends DynamicLevel {
	@Override
	public void init() throws SlickException {
		super.init();
		objectList.addBgObj(300f, 50f, 50f, 500f, Color.white, true);
        objectList.add(new TestEnemy(10f, 10f));
	}
}
