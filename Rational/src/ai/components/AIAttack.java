package ai.components;

import component.Entity;

import entity.Player;
import ai.AI;
import ai.AIComponent;

public class AIAttack extends AIComponent {

	public AIAttack(short mode) {
		super(mode);
	}

	@Override
	public void run(int delta, Player player, Entity entity, AI ai) {
	}

}
