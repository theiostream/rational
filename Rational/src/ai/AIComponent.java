package ai;

public abstract class AIComponent implements IAIComponent{
	
	private short mode;
	private int fitness;
	
	public AIComponent(short mode) {
		this.mode = mode;
		this.fitness = 100;
	}
	
	public short getMode(){
		return mode;
	}
	
	public void setMode(short mode){
		this.mode = mode;
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
	
}