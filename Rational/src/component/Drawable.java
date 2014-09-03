package component;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import component.coords.Point;
import component.coords.Rect;
import component.coords.Size;
import entity.Player;

public abstract class Drawable implements IDrawable {

	private Rect rect;
	private float motionX, motionY, speed;
	private Color color;
	private Image image;
	private boolean fill;
	private ObjectType type;
	private boolean isJumping = false;
	
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
	
	public Drawable(Rect rect, float motionX, float motionY, float speed, Color color, boolean fill, Image image, ObjectType type) {
		this.rect = rect;
		this.motionX = motionX;
		this.motionY = motionY;
		this.speed = speed;
		this.color = color;
		this.fill = fill;
		this.image = image;
		this.type = type;
	}
	
	private void update_(int delta){
		setX(getX() + (motionX * speed));
		setY(getY() + (motionY * speed));
		
		if (this.isJumping) {
			this.isJumping = false;
			motionY = -2;
		}
	}
	
	@Override
	public void update(int delta, Player player, boolean check1, boolean check2, boolean check3, boolean check4, boolean check5, boolean check6){
		if (check1) {
			moveLeft();
			player.stopX();
		}
		else if(check2) {
			moveRight();
			player.stopX();
		}
		else if(check3) {
			update_(delta);
		}
		
		if (!isJumping) {
			if (check4) {
				moveUp();
				player.stopY();
			}
			else if (check5) {
				moveDown();
				player.stopY();
			}
			else if (check6) {
				update_(delta);
			}
		}
		
		if (this.getType() == ObjectType.FOREGROUND) {
			if(player.intersectsUp(this) && player.getMotionY() == 1){
				player.setMotionY(0);
			}else if(player.intersectsDown(this) && player.getMotionY() == -1){
				player.setMotionY(0);
			}else if(player.intersectsLeft(this) && player.getMotionX() == 1){
				player.setMotionX(0);
			}else if(player.intersectsRight(this) && player.getMotionX() == -1){
				player.setMotionX(0);
			}
		}
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
	public void mouseMoved(int oldx, int oldy, int newx, int newy){}
	
	@Override
	public void mousePressed(int button, int x, int y){}
	
	@Override
	public void mouseReleased(int button, int x, int y){}

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
	public boolean withinRangeUp(Drawable drawable, float range){
		if(drawable.getY() + drawable.getHeight() + range >= getY()){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public boolean withinRangeDown(Drawable drawable, float range){
		if(getY() + getHeight() +  range >= drawable.getY()){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public boolean withinRangeLeft(Drawable drawable, float range){
		if(drawable.getX() + drawable.getWidth() + range >= getX()){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public boolean withinRangeRight(Drawable drawable, float range){
		if(getX() + getWidth() +  range >= drawable.getX()){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public float getX() {
		return rect.origin.x;
	}

	@Override
	public float getY() {
		return rect.origin.y;
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
		return rect.size.width;
	}

	@Override
	public float getHeight() {
		return rect.size.height;
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
		rect.origin.x = x;
	}

	@Override
	public void setY(float y) {
		rect.origin.y = y;
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
		rect.size.width = width;
	}

	@Override
	public void setHeight(float height) {
		rect.size.height = height;
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
	
	public void startRunning() {
		this.speed = 2;
	}
	public void stopRunning() {
		this.speed = 0;
	}
	
	public void jump() {
		this.motionY = 3;
		this.isJumping = true;
	}
	
	@Override
	public void stop() {
		this.stopX();
		this.stopY();
	}

	public ObjectType getType() {
		return type;
	}

	public void setType(ObjectType type) {
		this.type = type;
	}

}
