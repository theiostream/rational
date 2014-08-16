package component;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import component.Coords.Point;
import component.Coords.Rect;
import component.Coords.Size;

public class BgObj implements IBgObj {

	private Rect rect;
	private float motionX, motionY, speed;
	private Color color;
	private Image image;
	private boolean fill;
	
	public BgObj(float x, float y, float width, float height, float motionX, float motionY, float speed, Color color, Image image) {
		this.rect = new Rect(new Point(x, y), new Size(width, height));
		this.motionX = motionX;
		this.motionY = motionY;
		this.speed = speed;
		this.color = color;
		this.image = image;
		this.fill = false;
	}
	
	public BgObj(Point point, Size size, float motionX, float motionY, float speed, Color color, Image image){
		this.rect = new Rect(point, size);
		this.motionX = motionX;
		this.motionY = motionY;
		this.speed = speed;
		this.color = color;
		this.image = image;
		this.fill = false;
	}
	
	public BgObj(float x, float y, float width, float height, float motionX, float motionY, float speed, Color color, boolean fill) {
		this.rect = new Rect(new Point(x, y), new Size(width, height));
		this.motionX = motionX;
		this.motionY = motionY;
		this.speed = speed;
		this.color = color;
		this.image = null;
		this.fill = fill;
	}
	
	public BgObj(Point point, Size size, float motionX, float motionY, float speed, Color color, boolean fill){
		this.rect = new Rect(point, size);
		this.motionX = motionX;
		this.motionY = motionY;
		this.speed = speed;
		this.color = color;
		this.image = null;
		this.fill = fill;
	}
	
	public BgObj(float x, float y, float width, float height, boolean fill){
		this(new Point(x, y), new Size(width, height), 0f, 0f, 1f, Color.white, fill);
	}
	
	public BgObj(Point point, Size size, boolean fill){
		this(point, size, 0f, 0f, 1f, Color.white, fill);
	}
	
	public BgObj(float x, float y, float width, float height, Color color, boolean fill){
		this(new Point(x, y), new Size(width, height), 0f, 0f, 1f, color, fill);
	}
	
	public BgObj(Point point, Size size, Color color, boolean fill){
		this(point, size, 0f, 0f, 1f, color, fill);
	}
	
	public BgObj(float x, float y, float width, float height, float red, float green, float blue, boolean fill){
		this(new Point(x, y), new Size(width, height), 0f, 0f, 1f, new Color(red, green, blue), fill);
	}
	
	public BgObj(Point point, Size size, float red, float green, float blue, boolean fill){
		this(point, size, 0f, 0f, 1f, new Color(red, green, blue), fill);
	}
	
	public BgObj(float x, float y, float width, float height, Color color, Image image){
		this(new Point(x, y), new Size(width, height), 0f, 0f, 1f, color, image);
	}
	
	public BgObj(Point point, Size size, Color color, Image image){
		this(point, size, 0f, 0f, 1f, color, image);
	}
	
	public BgObj(float x, float y, float width, float height, float red, float green, float blue, Image image){
		this(new Point(x, y), new Size(width, height), 0f, 0f, 1f, new Color(red, green, blue), image);
	}
	
	public BgObj(Point point, Size size, float red, float green, float blue, Image image){
		this(point, size, 0f, 0f, 1f, new Color(red, green, blue), image);
	}
	
	public BgObj(float x, float y, float width, float height, float speed, boolean fill){
		this(new Point(x, y), new Size(width, height), 0f, 0f, speed, Color.white, fill);
	}
	
	public BgObj(Point point, Size size, float speed, boolean fill){
		this(point, size, 0f, 0f, speed, Color.white, fill);
	}
	
	public BgObj(float x, float y, float width, float height, Color color, float speed, boolean fill){
		this(new Point(x, y), new Size(width, height), 0f, 0f, speed, color, fill);
	}
	
	public BgObj(Point point, Size size, Color color, float speed, boolean fill){
		this(point, size, 0f, 0f, speed, color, fill);
	}
	
	public BgObj(float x, float y, float width, float height, float red, float green, float blue, float speed, boolean fill){
		this(new Point(x, y), new Size(width, height), 0f, 0f, speed, new Color(red, green, blue), fill);
	}
	
	public BgObj(Point point, Size size, float red, float green, float blue, float speed, boolean fill){
		this(point, size, 0f, 0f, speed, new Color(red, green, blue), fill);
	}
	
	public BgObj(float x, float y, float width, float height, Color color, Image image, float speed, boolean fill){
		this(new Point(x, y), new Size(width, height), 0f, 0f, speed, color, image);
	}
	
	public BgObj(Point point, Size size, Color color, Image image, float speed, boolean fill){
		this(point, size, 0f, 0f, speed, color, image);
	}
	
	public BgObj(float x, float y, float width, float height, float red, float green, float blue, Image image, float speed, boolean fill){
		this(new Point(x, y), new Size(width, height), 0f, 0f, speed, new Color(red, green, blue), image);
	}
	
	public BgObj(Point point, Size size, float red, float green, float blue, Image image, float speed, boolean fill){
		this(point, size, 0f, 0f, speed, new Color(red, green, blue), image);
	}
	
	@Override
	public void setX(float x){
		this.rect.setX(x);
	}
	
	@Override
	public void setY(float y){
		this.rect.setY(y);
	}
	
	@Override
	public void setWidth(float width){
		this.rect.setWidth(width);
	}
	
	@Override
	public void setHeight(float height){
		this.rect.setHeight(height);
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
}
