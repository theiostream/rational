package component;

import org.newdawn.slick.Color;
import org.newdawn.slick.Image;

import component.coords.Point;
import component.coords.Size;

public class BackgroundObject extends Drawable implements IDrawable {
	
	public BackgroundObject(float x, float y, float width, float height, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, Color.white, fill);
	}
	
	public BackgroundObject(Point point, Size size, boolean fill){
		super(point, size, 0f, 0f, 1f, Color.white, fill);
	}
	
	public BackgroundObject(float x, float y, float width, float height, Color color, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, color, fill);
	}
	
	public BackgroundObject(Point point, Size size, Color color, boolean fill){
		super(point, size, 0f, 0f, 1f, color, fill);
	}
	
	public BackgroundObject(float x, float y, float width, float height, float red, float green, float blue, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, new Color(red, green, blue), fill);
	}
	
	public BackgroundObject(Point point, Size size, float red, float green, float blue, boolean fill){
		super(point, size, 0f, 0f, 1f, new Color(red, green, blue), fill);
	}
	
	public BackgroundObject(float x, float y, float width, float height, Color color, Image image){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, color, image);
	}
	
	public BackgroundObject(Point point, Size size, Color color, Image image){
		super(point, size, 0f, 0f, 1f, color, image);
	}
	
	public BackgroundObject(float x, float y, float width, float height, float red, float green, float blue, Image image){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, new Color(red, green, blue), image);
	}
	
	public BackgroundObject(Point point, Size size, float red, float green, float blue, Image image){
		super(point, size, 0f, 0f, 1f, new Color(red, green, blue), image);
	}
	
	public BackgroundObject(float x, float y, float width, float height, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, Color.white, fill);
	}
	
	public BackgroundObject(Point point, Size size, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, Color.white, fill);
	}
	
	public BackgroundObject(float x, float y, float width, float height, Color color, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, color, fill);
	}
	
	public BackgroundObject(Point point, Size size, Color color, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, color, fill);
	}
	
	public BackgroundObject(float x, float y, float width, float height, float red, float green, float blue, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, new Color(red, green, blue), fill);
	}
	
	public BackgroundObject(Point point, Size size, float red, float green, float blue, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, new Color(red, green, blue), fill);
	}
	
	public BackgroundObject(float x, float y, float width, float height, Color color, Image image, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, color, image);
	}
	
	public BackgroundObject(Point point, Size size, Color color, Image image, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, color, image);
	}
	
	public BackgroundObject(float x, float y, float width, float height, float red, float green, float blue, Image image, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, new Color(red, green, blue), image);
	}
	
	public BackgroundObject(Point point, Size size, float red, float green, float blue, Image image, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, new Color(red, green, blue), image);
	}
	public BackgroundObject(Point point, Size size, float motionX, float motionY, float speed, Color color, boolean fill){
		super(point, size, motionX, motionY, speed, color, fill);
	}

	@Override
	public ObjectType getType() {
		return ObjectType.BACKGROUND;
	}
}
