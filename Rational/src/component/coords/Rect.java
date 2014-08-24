package component.coords;

public class Rect {
	public Point origin;
	public Size size;
	
	public Rect(Point origin, Size size) {
		this.origin = origin;
		this.size = size;
	}
	
	public Rect(float x, float y, float width, float height) {
		this(new Point(x, y), new Size(width, height));
	}
	
	public float getX(){
		return origin.getX();
	}
	
	public float getY(){
		return origin.getY();
	}
	
	public float getWidth(){
		return size.getWidth();
	}
	
	public float getHeight(){
		return size.getHeight();
	}
	
	public void setX(float x){
		this.origin.setX(x);
	}
	
	public void setY(float y){
		this.origin.setY(y);
	}
	
	public void setWidth(float width){
		this.size.setWidth(width);
	}
	
	public void setHeight(float height){
		this.size.setHeight(height);
	}
}
