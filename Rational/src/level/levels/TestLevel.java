package level.levels;

import component.ObjectType;
import component.TextBox;
import component.coords.Rect;
import level.base.DynamicLevel;

import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import util.ImageLoader;

public class TestLevel extends DynamicLevel {

    ImageLoader imgLoad = new ImageLoader();
    Image test = imgLoad.loadImage("enemy/test", "jpg");

	@Override
	public void init() throws SlickException {
		super.init();
		objectList.addBgObj(300f, 50f, 50f, 500f, Color.white, true);
        objectList.addBgObj(600f, 50f, 50f, 500f, Color.white, true);
        objectList.addBgObj(900f, 50f, 50f, 500f, Color.white, true);
        objectList.addBgObj(0f, 50f, 50f, 500f, Color.white, true);
        objectList.addBgObj(-300f, 50f, 50f, 500f, Color.red, true);
        objectList.addBgObj(50f, 450f, 45f, 45f, Color.cyan, test);
        objectList.add(new TextBox(new Rect(100f, 100f, 100f, 100f), "TEST", Color.green, ObjectType.FOREGROUND));
	}
}