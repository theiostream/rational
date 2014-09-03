package ai.components;

import ai.AI;
import ai.AIComponent;

import component.Entity;

import entity.Player;

public class AIMovement extends AIComponent {
	
	private float healthPercentageLimit = 0.25f;

	public AIMovement(short mode) {
		super(mode);
	}

	@Override
	public void run(int delta, Player player, Entity entity, AI ai) {
		switch(getMode()){
		case 0:
			if(entity.getHealth() != entity.getMaxHealth() * healthPercentageLimit){
				if(player.getX() > entity.getX()){
					entity.moveRight();
					if(getFitness() != 0)
						incrFitness(1);
				}else if(player.getX() < entity.getX()){
					entity.moveLeft();
					if(getFitness() != 0)
						incrFitness(1);
				}else if(player.getY() > entity.getY()){
					entity.moveDown();
					if(getFitness() != 0)
						incrFitness(1);
				}else if(player.getY() > entity.getY()){
					entity.moveUp();
					if(getFitness() != 0)
						incrFitness(1);
				}else{
					if(!player.intersectsUp(entity) || !player.intersectsDown(entity) || !player.intersectsLeft(entity) || !player.intersectsRight(entity)){
						decrFitness(1);
					}
				}
			}else{
				if(player.getX() > entity.getX()){
					entity.moveLeft();
					if(getFitness() != 0)
						incrFitness(1);
				}else if(player.getX() < entity.getX()){
					entity.moveRight();
					if(getFitness() != 0)
						incrFitness(1);
				}else if(player.getY() > entity.getY()){
					entity.moveUp();
					if(getFitness() != 0)
						incrFitness(1);
				}else if(player.getY() > entity.getY()){
					entity.moveDown();
					if(getFitness() != 0)
						incrFitness(1);
				}else{
					if(player.intersectsUp(entity) || player.intersectsDown(entity) || player.intersectsLeft(entity) || player.intersectsRight(entity)){
						decrFitness(1);
					}
				}
			}
			break;
		case 1:
			
			break;
		}
	}
	
	public float getHealthPercentageLimit(){
		return this.healthPercentageLimit;
	}
	
	public void setHealthPercentageLimit(float healthPercentageLimit){
		this.healthPercentageLimit = healthPercentageLimit;
	}

}
