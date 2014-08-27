package component;

import org.newdawn.slick.Color;
import org.newdawn.slick.Image;

import component.coords.Point;
import component.coords.Rect;
import component.coords.Size;

public class Button extends TextBox {
	
	private boolean isButtonRightClicked = false, isButtonLeftClicked = false, isButtonMiddleClicked = false;
	private String function;
	
	public Button(float x, float y, float width, float height, String function, String text, Color color) {
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
	}
	
	@Override
	public void mousePressed(int button, int x, int y){
		if(x >= getX() && x <= getX() + getWidth() && y >= getY() && y <= getY() + getHeight()){
			switch(button){
			case 0:
				System.out.println(0);
			case 1:
				System.out.println(1);
			case 2:
				System.out.println(2);
			}
		}
	}
	
	@Override
	public void mouseReleased(int button, int x, int y){
		if(x >= getX() && x <= getX() + getWidth() && y >= getY() && y <= getY() + getHeight()){
			switch(button){
			case 0:
				System.out.println(0);
			case 1:
				System.out.println(1);
			case 2:
				System.out.println(2);
			}
		}
	}
	
	@Override
	public void update(int delta){
		
	}

}
