package entity;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import component.Entity;
import component.IEntity;
import component.ObjectType;
import component.coords.Point;
import component.coords.Size;

public class Player extends Entity implements IEntity {
	
	private static float width = 50, height = 50, health = 20, baseDmg = 2;
	private boolean yMove;
	
	public Player(float x, float y, boolean yMove) {
		super(x, y, width, height, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(Point point, boolean yMove) {
		super(point, new Size(width, height), health, baseDmg);
		this.yMove = yMove;
	}

	public Player(float x, float y, Color color, boolean yMove) {
		super(x, y, width, height, color, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(Point point, Color color, boolean yMove) {
		super(point, new Size(width, height), color, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(float x, float y, float red, float green, float blue, boolean yMove) {
		super(x, y, width, height, red, green, blue, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(Point point, float red, float green, float blue, boolean yMove) {
		super(point, new Size(width, height), red, green, blue, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(float x, float y, Color color, Image image, boolean yMove) {
		super(x, y, width, height, color, image, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(Point point, Color color, Image image, boolean yMove) {
		super(point, new Size(width, height), color, image, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(float x, float y, float red, float green, float blue, Image image, boolean yMove) {
		super(x, y, width, height, red, green, blue, image, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(Point point, float red, float green, float blue, Image image, boolean yMove) {
		super(point, new Size(width, height), red, green, blue, image, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(float x, float y, float speed, boolean yMove) {
		super(x, y, width, height, speed, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(Point point, float speed, boolean yMove) {
		super(point, new Size(width, height), speed, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(float x, float y, Color color, float speed, boolean yMove) {
		super(x, y, width, height, color, speed, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(Point point, Color color, float speed, boolean yMove) {
		super(point, new Size(width, height), color, speed, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(float x, float y, float red, float green, float blue, float speed, boolean yMove) {
		super(x, y, width, height, red, green, blue, speed, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(Point point, float red, float green, float blue, float speed, boolean yMove) {
		super(point, new Size(width, height), red, green, blue, speed, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(float x, float y, Color color, Image image, float speed, boolean yMove) {
		super(x, y, width, height, color, image, speed, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(Point point, Color color, Image image, float speed, boolean yMove) {
		super(point, new Size(width, height), color, image, speed, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(float x, float y, float red, float green, float blue, Image image, float speed, boolean yMove) {
		super(x, y, width, height, red, green, blue, image, speed, health, baseDmg);
		this.yMove = yMove;
	}

	public Player(Point point, float red, float green, float blue, Image image, float speed, boolean yMove) {
		super(point, new Size(width, height), red, green, blue, image, speed, health, baseDmg);
		this.yMove = yMove;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawRect(getX(), getY(), getWidth(), getHeight());
	}
	
	@Override
	public void update(int delta){
		super.update(delta);
		setX(getX() + getMotionX());
		if(yMove){
			setY(getY() + getMotionY());
		}
	}
	
	@Override
	public void keyPressed(int key, char c){
		switch(key){
		case Keyboard.KEY_LEFT:
			super.moveLeft();
			break;
		case Keyboard.KEY_RIGHT:
			super.moveRight();
			break;
		}
		
		if(!yMove){
			switch(key){
			case Keyboard.KEY_SPACE:
				jump();
				break;
			}
		}
		
		if(yMove){
			switch(key){
			case Keyboard.KEY_UP:
				super.moveUp();
				break;
			case Keyboard.KEY_DOWN:
				super.moveDown();
				break;
			}
		}
	}
	
	@Override
	public void keyReleased(int key, char c){
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
	public ObjectType getType() {
		return ObjectType.PLAYER;
	}
	
	public void jump(){
		setMotionY(2.5f);
	}
}
