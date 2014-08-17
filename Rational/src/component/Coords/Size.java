package component.coords;

public class Size {
	float width, height;
	
	public Size(float width, float height) {
		this.width = width;
		this.height = height;
	}
	
	public float getWidth(){
		return width;
	}
	
	public float getHeight(){
		return height;
	}
	
	public void setWidth(float width){
		this.width = width;
	}
	
	public void setHeight(float height){
		this.height = height;
	}
}
