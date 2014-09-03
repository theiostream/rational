package enemy;

import org.newdawn.slick.Image;

import util.ImageLoader;
import entity.Enemy;

public class TestEnemy extends Enemy{
	
	static ImageLoader imgLoad = new ImageLoader();
	static Image test = imgLoad.loadScaledImage("test", "jpg", 0.1f);

	public TestEnemy(float x, float y) {
		super(x, y, 50, 50, 1, 1, 1, test, 1, 20, 2);
	}

}
