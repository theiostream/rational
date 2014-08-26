package component;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import component.coords.Point;
import component.coords.Rect;
import component.coords.Size;

public abstract class Drawable implements IDrawable {

	private Rect rect;
	private float motionX, motionY, speed;
	private Color color;
	private Image image;
	private boolean fill;
	
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
	public void update(int delta){
		setX(getX() + (motionX * speed));
		setY(getY() + (motionY * speed));
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
			if(fill){
				g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
			}else{
				g.drawRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
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
	public boolean intersectsUp(Drawable drawable) {
		if(drawable.getY() + drawable.getHeight() >= getY()){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public boolean intersectsDown(Drawable drawable) {
		if(getY() + getHeight() >= drawable.getY()){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public boolean intersectsLeft(Drawable drawable) {
		if(drawable.getX() + drawable.getWidth() >= getX()){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public boolean intersectsRight(Drawable drawable) {
		if(getX() + getWidth() >= drawable.getX()){
			return true;
		}else{
			return false;
		}
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
	public float getMotionX() {
		return motionX;
	}

	@Override
	public float getMotionY() {
		return motionY;
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
		return rect;
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
	public void setX(float x) {
		rect.setX(x);
	}

	@Override
	public void setY(float y) {
		rect.setY(y);
	}
	
	@Override
	public void setMotionX(float motionX) {
		this.motionX = motionX;
	}

	@Override
	public void setMotionY(float motionY) {
		this.motionY = motionY;
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
	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public void setColor(float r, float g, float b) {
		this.color = new Color(r, g, b);
	}

	@Override
	public void setImage(Image image) {
		this.image = image;
	}

	@Override
	public void moveRight() {
		this.motionX = 1;
	}

	@Override
	public void moveLeft() {
		this.motionX = -1;
	}

	@Override
	public void stopX() {
		this.motionX = 0;
	}
	
	@Override
	public void moveUp() {
		this.motionY = -1;
	}

	@Override
	public void moveDown() {
		this.motionY = 1;
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
