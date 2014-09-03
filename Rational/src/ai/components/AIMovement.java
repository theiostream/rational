package ai.components;

import ai.AI;
import ai.AIComponent;
import ai.AIComponentState;
import component.Entity;
import entity.Player;

public class AIMovement extends AIComponent {
	
	private AIComponentState state;
	private float healthPercentageLimit = 0.25f;

	public AIMovement(short mode) {
		super(mode);
		this.state = AIComponentState.REGULAR;
	}

	@Override
	public void run(int delta, Player player, Entity entity, AI ai) {
		
		if(entity.getHealth() != entity.getMaxHealth() * healthPercentageLimit){
			this.state = AIComponentState.CURIOUS;
		}else if(entity.getHealth() <= entity.getMaxHealth() * healthPercentageLimit){
			this.state = AIComponentState.DESPERATE;
		}
		
		switch(getMode()){
		case 0:
			if(this.state == AIComponentState.CURIOUS || this.state == AIComponentState.REGULAR){
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
			}else if(this.state == AIComponentState.CURIOUS){
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
