package ai;

import java.util.ArrayList;

import component.Entity;

import entity.Player;

public class AI {
	
	private ArrayList<AIComponent> component;
	private AIState state;
	private AIState nextState;
	private Entity entity;
	
	public AI(ArrayList<AIComponent> list, AIState startingState, Entity entity) {
		this.component = list;
		this.state = startingState;
		this.nextState = startingState;
		this.entity = entity;
	}
	
	public void update(int delta, Player player){
		
		for(int i = 0; i < component.size(); i++){
			component.get(i).run(delta, player, entity, this);
		}
		
		state = nextState;
	}
	
	public AIState getNextState(){
		return nextState;
	}
	
	public AIState getCurrentState(){
		return state;
	}
	
	public ArrayList<AIComponent> getComponentList(){
		return component;
	}
	
	public void setNextState(AIState nextState){
		this.nextState = nextState;
	}
	
	public void setComponentList(ArrayList<AIComponent> list){
		this.component = list;
	}
	
	public void mergeWithList(ArrayList<AIComponent> list){
		for(int i = 0; i < component.size(); i++){
			if(list.get(i).getFitness() < component.get(i).getFitness()){
				component.set(i, list.get(i));
			}
		}
	}

}
