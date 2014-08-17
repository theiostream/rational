package level.levels;

import level.base.DynamicLevel;

import org.newdawn.slick.Color;
import org.newdawn.slick.SlickException;

public class TestLevel extends DynamicLevel {
	@Override
	public void init() throws SlickException {
		System.out.println("Why?!" + this.getObjList());
		
		this.getObjList().add(5, 255, 150, 50, false);
		this.getObjList().add(405, 155, 100, 75, true);
		this.getObjList().add(600, 90, 50, 125, Color.cyan, true);
	}
}
