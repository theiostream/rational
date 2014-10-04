package ai.components;

import java.util.ArrayList;

import component.Entity;
import entity.Player;
import ai.AI;
import ai.AIComponent;
import ai.Mode;

public class AIDefence extends AIComponent {

	public AIDefence(ArrayList<Mode> mode) {
		super(mode);
	}

	@Override
	public void run(int delta, Player player, Entity entity, AI ai) {
	}

}
