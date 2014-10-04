package ai;

import java.util.ArrayList;

public abstract class AIComponent implements IAIComponent{
	
	private ArrayList<Mode> mode;
	private int fitness;
	private AIComponentState state;
	
	public AIComponent(ArrayList<Mode> mode) {
		this.mode = mode;
		this.fitness = 100;
	}
	
	public short getMode(String tag){
		int cI= 0;
		for(int i = 0; i < mode.size(); i++){
			if(mode.get(i).getTag() == tag)
				cI = i;
		}
		return mode.get(cI).getModeNumber();
	}
	
	public void setMode(String tag, short mode){
		int cI= 0;
		for(int i = 0; i < this.mode.size(); i++){
			if(this.mode.get(i).getTag() == tag)
				cI = i;
		}
		this.mode.get(cI).setModeNumber(mode);
	}
	
	public void setState(AIComponentState state){
		this.state = state;
	}
	
	public void incrFitness(int incr){
		this.fitness =- incr;
	}
	
	public void decrFitness(int decr){
		this.fitness =+ decr;
	}
	
	public int getFitness(){
		return fitness;
	}
	
	public AIComponentState getState(){
		return state;
	}
	
}