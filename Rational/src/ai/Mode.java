package ai;

public class Mode {

	private short mode;
	private String tag;
	
	public Mode(short mode, String tag) {
		this.mode = mode;
		this.tag = tag;
	}
	
	public void setModeNumber(short mode){
		this.mode = mode;
	}
	
	public void setTag(String tag){
		this.tag = tag;
	}
	
	public short getModeNumber(){
		return mode;
	}
	
	public String getTag(){
		return tag;
	}

}
