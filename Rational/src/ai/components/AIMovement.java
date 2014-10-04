package ai.components;

import java.util.ArrayList;

import ai.AI;
import ai.AIComponent;
import ai.AIComponentState;
import ai.Mode;
import component.Entity;
import entity.Player;

public class AIMovement extends AIComponent {
	
	private AIComponentState state;
	private float healthPercentageLimit;

	public AIMovement(ArrayList<Mode> mode) {
		super(mode);
		setState(AIComponentState.REGULAR);
		setHealthPercentageLimit(0.25f);
	}

	@Override
	public void run(int delta, Player player, Entity entity, AI ai) {
		
		if(entity.getHealth() != entity.getMaxHealth() * healthPercentageLimit){
			setState(AIComponentState.CURIOUS);
		}else if(entity.getHealth() <= entity.getMaxHealth() * healthPercentageLimit){
			setState(AIComponentState.DESPERATE);
		}
		
		switch(getMode("Main")){
		case 0:
			if(getState() == AIComponentState.CURIOUS || getState() == AIComponentState.REGULAR){
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
			}else if(getState() == AIComponentState.DESPERATE){
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
	
	public AIComponentState getState(){
		return this.state;
	}
	
	public void setState(AIComponentState state){
		this.state = state;
	}
	
	public float getHealthPercentageLimit(){
		return this.healthPercentageLimit;
	}
	
	public void setHealthPercentageLimit(float healthPercentageLimit){
		this.healthPercentageLimit = healthPercentageLimit;
	}

}
