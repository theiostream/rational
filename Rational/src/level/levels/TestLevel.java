package level.levels;

import level.base.DynamicLevel;

import org.newdawn.slick.SlickException;

public class TestLevel extends DynamicLevel {
	@Override
	public void init() throws SlickException {
		super.init();
		System.out.println("Why?!" + this.getObjList());
	}
}
