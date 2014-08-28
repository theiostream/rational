package component;
import game.Rational;

import org.newdawn.slick.Color;

import component.coords.Rect;

public class Button extends TextBox {	
	/*public Button(float x, float y, float width, float height, String function, String text, Color color) {
		super(new Rect(new Point(x, y), new Size(width, height)), text, color);
		this.function = function;
	}
	
	public Button(float x, float y, float width, float height, Image image, String function, String text) {
		super(new Rect(new Point(x, y), new Size(width, height)), text, image);
		this.function = function;
	}
	
	public Button(Point point, Size size, Image image, String function, String text) {
		super(new Rect(point, size), text, image);
		this.function = function;
	}
	
	public Button(Point point, Size size, String function, String text) {
		super(new Rect(point, size), text, Color.white);
		this.function = function;
	}
	
	public Button(float x, float y, float width, float height, String function, String text) {
		super(new Rect(new Point(x, y), new Size(width, height)), text, Color.white);
		this.function = function;
	}
	
	public Button(Point point, Size size, Color color, String function, String text) {
		super(new Rect(point, size), text, color);
		this.function = function;
	}
	
	public Button(float x, float y, float width, float height, Color color, String function, String text) {
		super(new Rect(new Point(x, y), new Size(width, height)), text, color);
		this.function = function;
	}*/
	
	public Button(Rect rect, String text, Color color, ObjectType type) {
		super(rect, text, color, type);
	}
	
	@Override
	public void mouseMoved(int oldx, int oldy, int newx, int newy) {
		
	}
	
	@Override
	public void mousePressed(int button, int x, int y){
		System.out.println("PRESSED!");
		Rational.getGame().getCurrentLevel().getObjectList().add(new TextBox(new Rect(200, 200, 100, 100), "Bozo2", Color.red, ObjectType.FOREGROUND));
	}
	
	@Override
	public void mouseReleased(int button, int x, int y){
		
	}
	
	@Override
	public void update(int delta){
		
	}

}
