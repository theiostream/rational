package ai.components;
/*
 * Used mode settings: Main, AngryTrigger
 */
import java.util.ArrayList;

import ai.AI;
import ai.AIComponent;
import ai.AIComponentState;
import ai.Mode;

import component.Entity;

import entity.Player;

public class AIAttack extends AIComponent {
	
	private float range;
	private double cooldown, timer;
	
	public AIAttack(ArrayList<Mode> mode) {
		super(mode);
		setState(AIComponentState.REGULAR);
		setRange(5);
		setCooldown(600);
		resetTimer();
	}

	@Override
	public void run(int delta, Player player, Entity entity, AI ai) {
		
		switch(getMode("AngryTrigger")){
		case 0:
			if(getState() == AIComponentState.REGULAR && (entity.withinRangeDown(player, this.range) || entity.withinRangeUp(player, this.range)
				|| entity.withinRangeLeft(player, this.range) || entity.withinRangeRight(player, this.range))){
				setState(AIComponentState.ANGRY);
			}	
			break;
		case 1:		
			
			break;
		}
		
		if(getState() == AIComponentState.IDLE){
			incrTimer();
			if(getTimer() == getCooldown()){
				setState(AIComponentState.REGULAR);
				resetTimer();
			}
		}
		
		switch(getMode("Main")){
		case 0:
			if(getState() == AIComponentState.ANGRY){
				entity.attack(player);
				setState(AIComponentState.IDLE);
			}
			break;
		case 1:
			
			break;
		}
	}
	
	public void setRange(float range){
		this.range = range;
	}
	
	public float getRange(){
		return range;
	}
	
	public void setTimer(double timer){
		this.timer = timer;
	}
	
	public double getTimer(){
		return this.timer;
	}
	
	public void resetTimer(){
		setTimer(0);
	}
	
	public void incrTimer(){
		setTimer(getTimer() + 1);
	}
	
	public void setCooldown(double cooldown){
		this.cooldown = cooldown;
	}
	
	public double getCooldown(){
		return this.cooldown;
	}

}
