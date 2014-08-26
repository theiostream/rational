package level.levels;

import level.base.DynamicLevel;

import org.newdawn.slick.Color;
import org.newdawn.slick.SlickException;

public class TestLevel extends DynamicLevel {
	@Override
	public void init() throws SlickException {
		super.init();
		System.out.println("Why?!" + this.getObjList());
		bgObjList.add(300f, 50f, 50f, 500f, Color.white, true);
	}
}
