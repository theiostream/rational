package ai;

import java.util.ArrayList;

import component.Entity;
import entity.Player;

public class AI {
	
	private ArrayList<AIComponent> component;
	private Entity entity;
	
	public AI(Entity entity) {
		this.entity = entity;
	}
	
	public void update(int delta, Player player){
		for(int i = 0; i < component.size(); i++){
			component.get(i).run(delta, player, entity, this);
		}
	}
	
	public ArrayList<AIComponent> getComponentList(){
		return component;
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
	
	public AIComponentState getState(AIComponent component){
		int componentNumber = 0;
		for(int i = 0; i < this.component.size(); i++){
			if(this.component.get(i).equals(component)){
				componentNumber = i;
				break;
			}
		}
		return this.component.get(componentNumber).getState();
	}

}
