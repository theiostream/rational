package enemy;

import java.util.ArrayList;

import org.newdawn.slick.Image;

import util.ImageLoader;
import ai.AIComponent;
import ai.components.AIAttack;
import ai.components.AIDefence;
import ai.components.AIMovement;
import entity.Enemy;

public class TestEnemy extends Enemy{
	
	static ImageLoader imgLoad = new ImageLoader();
	static Image test = imgLoad.loadScaledImage("test", "jpg", 0.1f);

	public TestEnemy(float x, float y) {
		super(x, y, 50, 50, 1, 1, 1, test, 1, 20, 2);
		editAIComponentList(getAIComponentList());
	}
	
	private void editAIComponentList(ArrayList<AIComponent> list){
		list.add(new AIMovement((short) 0));
		list.add(new AIAttack((short) 0));
		list.add(new AIDefence((short) 0));
		setAIComponentList(list);
	}

}
