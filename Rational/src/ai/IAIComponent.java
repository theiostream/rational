package ai;

import component.Entity;

import entity.Player;

public interface IAIComponent {
	public void run(int delta, Player player, Entity entity, AI ai);
}
