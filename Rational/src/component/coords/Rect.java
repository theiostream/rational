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
	
	public boolean isWithinPoint(Point point) {
		return (point.x > origin.x && point.x < origin.x + size.width) && (point.y > origin.y && point.y < origin.y + size.height);
	}
}
