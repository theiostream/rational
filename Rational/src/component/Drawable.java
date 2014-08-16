package component;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import component.Coords.Point;
import component.Coords.Rect;
import component.Coords.Size;

public abstract class Drawable implements IDrawable {

	protected Rect rect;
	protected float motionX, motionY, speed;
	protected Color color;
	protected Image image;
	protected boolean fill;
	
	public Drawable(float x, float y, float width, float height, float motionX, float motionY, float speed, Color color, Image image) {
		this.rect = new Rect(new Point(x, y), new Size(width, height));
		this.motionX = motionX;
		this.motionY = motionY;
		this.speed = speed;
		this.color = color;
		this.image = image;
		this.fill = false;
	}
	
	public Drawable(Point point, Size size, float motionX, float motionY, float speed, Color color, Image image){
		this.rect = new Rect(point, size);
		this.motionX = motionX;
		this.motionY = motionY;
		this.speed = speed;
		this.color = color;
		this.image = image;
		this.fill = false;
	}
	
	public Drawable(float x, float y, float width, float height, float motionX, float motionY, float speed, Color color, boolean fill) {
		this.rect = new Rect(new Point(x, y), new Size(width, height));
		this.motionX = motionX;
		this.motionY = motionY;
		this.speed = speed;
		this.color = color;
		this.image = null;
		this.fill = fill;
	}
	
	public Drawable(Point point, Size size, float motionX, float motionY, float speed, Color color, boolean fill){
		this.rect = new Rect(point, size);
		this.motionX = motionX;
		this.motionY = motionY;
		this.speed = speed;
		this.color = color;
		this.image = null;
		this.fill = fill;
	}

	@Override
	public void update(int delta) {
		setX(this.getX() + motionX);
		setY(this.getY() + motionY);
	}

	@Override
	public void draw(Graphics g) {
		if(image != null){
			if(this.color != null){
				g.drawImage(this.image, this.getX(), this.getY(), this.color);
			}else{
				g.drawImage(this.image, this.getX(), this.getY());
			}
		}else{
			g.setColor(this.color);
			g.drawRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
			if(fill){
				g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
			}
		}
	}
	
	@Override
	public void keyPressed(int key, char c) {
		switch(key){
		case Keyboard.KEY_LEFT:
			this.moveRight();
			break;
		case Keyboard.KEY_RIGHT:
			this.moveLeft();
			break;
		case Keyboard.KEY_UP:
			this.moveDown();
			break;
		case Keyboard.KEY_DOWN:
			this.moveUp();
			break;
		}
	}

	@Override
	public void keyReleased(int key, char c) {
		switch(key){
		case Keyboard.KEY_LEFT:
			this.stopX();
			break;
		case Keyboard.KEY_RIGHT:
			this.stopX();
			break;
		case Keyboard.KEY_UP:
			this.stopY();
			break;
		case Keyboard.KEY_DOWN:
			this.stopY();
			break;
		}
	}

	@Override
	public void intersects(Drawable drawable) {
		// TODO Auto-generated method stub

	}

	@Override
	public float getX() {
		return rect.getX();
	}

	@Override
	public float getY() {
		return rect.getY();
	}

	@Override
	public Point getPoint() {
		return new Point(getX(), getY());
	}

	@Override
	public float getWidth() {
		return rect.getWidth();
	}

	@Override
	public float getHeight() {
		return rect.getHeight();
	}

	@Override
	public Size getSize() {
		return new Size(getWidth(), getHeight());
	}

	@Override
	public Rect getRect() {
		return this.rect;
	}

	@Override
	public void setX(float x) {
		rect.setX(x);
	}

	@Override
	public void setY(float y) {
		rect.setY(y);

	}

	@Override
	public void setPoint(Point point) {
		setX(point.getX());
		setY(point.getY());
	}

	@Override
	public void setWidth(float width) {
		rect.setWidth(width);
	}

	@Override
	public void setHeight(float height) {
		rect.setHeight(height);
	}

	@Override
	public void setSize(Size size) {
		setWidth(size.getWidth());
		setHeight(size.getHeight());
	}

	@Override
	public void setRect(Rect rect) {
		this.rect = rect;
	}
	
	@Override
	public void setSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public void moveRight() {
		this.motionX = 1 * this.speed;
	}

	@Override
	public void moveLeft() {
		this.motionX = -1 * this.speed;
	}

	@Override
	public void stopX() {
		this.motionX = 0;
	}
	
	@Override
	public void moveUp() {
		this.motionY = -1 * this.speed;
	}

	@Override
	public void moveDown() {
		this.motionY = 1 * this.speed;
	}

	@Override
	public void stopY() {
		this.motionY = 0;
	}
	
	@Override
	public void stop() {
		this.stopX();
		this.stopY();
	}

}
