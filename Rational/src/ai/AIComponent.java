package ai;

public abstract class AIComponent implements IAIComponent{
	
	private AIComponentType cType;
	private String mode;
	private int fitness;
	
	public AIComponent(AIComponentType cType, String mode) {
		this.cType = cType;
		this.mode = mode;
		this.fitness = 100;
	}
	
	public AIComponentType getType(){
		return cType;
	}
	
	public String getMode(){
		return mode;
	}
	
	public void incrFitness(int incr){
		this.fitness =- incr;
	}
	
	public int getFitness(){
		return fitness;
	}
	
}