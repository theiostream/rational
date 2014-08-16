package component;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import component.Coords.Point;
import component.Coords.Size;

public class BgObj extends Drawable implements IBgObj {
	
	public BgObj(float x, float y, float width, float height, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, Color.white, fill);
	}
	
	public BgObj(Point point, Size size, boolean fill){
		super(point, size, 0f, 0f, 1f, Color.white, fill);
	}
	
	public BgObj(float x, float y, float width, float height, Color color, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, color, fill);
	}
	
	public BgObj(Point point, Size size, Color color, boolean fill){
		super(point, size, 0f, 0f, 1f, color, fill);
	}
	
	public BgObj(float x, float y, float width, float height, float red, float green, float blue, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, new Color(red, green, blue), fill);
	}
	
	public BgObj(Point point, Size size, float red, float green, float blue, boolean fill){
		super(point, size, 0f, 0f, 1f, new Color(red, green, blue), fill);
	}
	
	public BgObj(float x, float y, float width, float height, Color color, Image image){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, color, image);
	}
	
	public BgObj(Point point, Size size, Color color, Image image){
		super(point, size, 0f, 0f, 1f, color, image);
	}
	
	public BgObj(float x, float y, float width, float height, float red, float green, float blue, Image image){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, new Color(red, green, blue), image);
	}
	
	public BgObj(Point point, Size size, float red, float green, float blue, Image image){
		super(point, size, 0f, 0f, 1f, new Color(red, green, blue), image);
	}
	
	public BgObj(float x, float y, float width, float height, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, Color.white, fill);
	}
	
	public BgObj(Point point, Size size, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, Color.white, fill);
	}
	
	public BgObj(float x, float y, float width, float height, Color color, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, color, fill);
	}
	
	public BgObj(Point point, Size size, Color color, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, color, fill);
	}
	
	public BgObj(float x, float y, float width, float height, float red, float green, float blue, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, new Color(red, green, blue), fill);
	}
	
	public BgObj(Point point, Size size, float red, float green, float blue, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, new Color(red, green, blue), fill);
	}
	
	public BgObj(float x, float y, float width, float height, Color color, Image image, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, color, image);
	}
	
	public BgObj(Point point, Size size, Color color, Image image, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, color, image);
	}
	
	public BgObj(float x, float y, float width, float height, float red, float green, float blue, Image image, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, new Color(red, green, blue), image);
	}
	
	public BgObj(Point point, Size size, float red, float green, float blue, Image image, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, new Color(red, green, blue), image);
	}
	
	@Override
	public void setX(float x){
		rect.setX(x);
	}
	
	@Override
	public void setY(float y){
		rect.setY(y);
	}
	
	@Override
	public void setWidth(float width){
		rect.setWidth(width);
	}
	
	@Override
	public void setHeight(float height){
		rect.setHeight(height);
	}

	@Override
	public void setColor(Color color) {
		super.color = color;
	}

	@Override
	public void setColor(float r, float g, float b) {
		super.color = new Color(r, g, b);
	}

	@Override
	public void setImage(Image image) {
		super.image = image;
	}
	
	@Override
	public void setSpeed(float speed) {
		super.speed = speed;
	}

	@Override
	public void moveRight() {
		super.motionX = 1 * this.speed;
	}

	@Override
	public void moveLeft() {
		super.motionX = -1 * this.speed;
	}

	@Override
	public void stopX() {
		super.motionX = 0;
	}
	
	@Override
	public void moveUp() {
		super.motionY = -1 * this.speed;
	}

	@Override
	public void moveDown() {
		super.motionY = 1 * this.speed;
	}

	@Override
	public void stopY() {
		super.motionY = 0;
	}
	
	@Override
	public void stop() {
		stopX();
		stopY();
	}

	@Override
	public float getX(){
		return rect.getX();
	}
	
	@Override
	public float getY(){
		return rect.getY();
	}
	
	@Override
	public float getWidth(){
		return rect.getWidth();
	}
	
	@Override
	public float getHeight(){
		return rect.getHeight();
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public Image getImage() {
		return image;
	}

	@Override
	public void update(int delta) {
		setX(super.getX() + motionX);
		setY(super.getY() + motionY);
	}

	@Override
	public void draw(Graphics g) {
		if(image != null){
			if(super.color != null){
				g.drawImage(super.image, getX(), getY(), super.color);
			}else{
				g.drawImage(super.image, getX(), getY());
			}
		}else{
			g.setColor(this.color);
			g.drawRect(getX(), getY(), getWidth(), getHeight());
			if(fill){
				g.fillRect(getX(), getY(), getWidth(), getHeight());
			}
			
		}
	}

	@Override
	public void keyPressed(int key, char c) {
		switch(key){
		case Keyboard.KEY_LEFT:
			moveRight();
			break;
		case Keyboard.KEY_RIGHT:
			moveLeft();
			break;
		case Keyboard.KEY_UP:
			moveDown();
			break;
		case Keyboard.KEY_DOWN:
			moveUp();
			break;
		}
	}

	@Override
	public void keyReleased(int key, char c) {
		switch(key){
		case Keyboard.KEY_LEFT:
			stopX();
			break;
		case Keyboard.KEY_RIGHT:
			stopX();
			break;
		case Keyboard.KEY_UP:
			stopY();
			break;
		case Keyboard.KEY_DOWN:
			stopY();
			break;
		}
	}
}
