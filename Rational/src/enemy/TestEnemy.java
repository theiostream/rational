package enemy;

import java.util.ArrayList;

import org.newdawn.slick.Image;

import util.ImageLoader;
import ai.AIComponent;
import ai.Mode;
import ai.components.AIAttack;
import ai.components.AIDefence;
import ai.components.AIMovement;
import entity.Enemy;

public class TestEnemy extends Enemy{

    private ArrayList<Mode> MovementModes, AttackModes, DefenceModes;

    static ImageLoader imgLoad = new ImageLoader();
    static Image test = imgLoad.loadScaledImage("enemy/test", "jpg", 0.1f);

    public TestEnemy(float x, float y) {
        super(x, y, 50, 50, 1, 1, 1, test, 1, 20, 2);
        editAIComponentList(getAIComponentList());
    }

    private void editAIComponentList(ArrayList<AIComponent> list){
		MovementModes.add(new Mode((short) 0, "Main"));
		list.add(new AIMovement(MovementModes));
		AttackModes.add(new Mode((short) 0, "Main"));
		AttackModes.add(new Mode((short) 0, "AngryTrigger"));
		AttackModes.add(new Mode((short) 0, "CooldownIdleRegular"));
		list.add(new AIAttack(AttackModes));
		DefenceModes.add(new Mode((short) 0, "Main"));
		list.add(new AIDefence(DefenceModes));
		setAIComponentList(list);
	}

}
