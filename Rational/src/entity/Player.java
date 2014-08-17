package entity;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import component.Entity;
import component.IEntity;
import component.Coords.Point;
import component.Coords.Size;

public class Player extends Entity implements IEntity {
	
	private static float width = 50, height = 50, health = 20, baseDmg = 2;
	
	public Player(float x, float y) {
		super(x, y, width, height, health, baseDmg);
	}

	public Player(Point point) {
		super(point, new Size(width, height), health, baseDmg);
	}

	public Player(float x, float y, Color color) {
		super(x, y, width, height, color, health, baseDmg);
	}

	public Player(Point point, Color color) {
		super(point, new Size(width, height), color, health, baseDmg);
	}

	public Player(float x, float y, float red, float green, float blue) {
		super(x, y, width, height, red, green, blue, health, baseDmg);
	}

	public Player(Point point, float red, float green, float blue) {
		super(point, new Size(width, height), red, green, blue, health, baseDmg);
	}

	public Player(float x, float y, Color color, Image image) {
		super(x, y, width, height, color, image, health, baseDmg);
	}

	public Player(Point point, Color color, Image image) {
		super(point, new Size(width, height), color, image, health, baseDmg);
	}

	public Player(float x, float y, float red, float green, float blue, Image image) {
		super(x, y, width, height, red, green, blue, image, health, baseDmg);
	}

	public Player(Point point, float red, float green, float blue, Image image) {
		super(point, new Size(width, height), red, green, blue, image, health, baseDmg);
	}

	public Player(float x, float y, float speed) {
		super(x, y, width, height, speed, health, baseDmg);
	}

	public Player(Point point, float speed) {
		super(point, new Size(width, height), speed, health, baseDmg);
	}

	public Player(float x, float y, Color color, float speed) {
		super(x, y, width, height, color, speed, health, baseDmg);
	}

	public Player(Point point, Color color, float speed) {
		super(point, new Size(width, height), color, speed, health, baseDmg);
	}

	public Player(float x, float y, float red, float green, float blue, float speed) {
		super(x, y, width, height, red, green, blue, speed, health, baseDmg);
	}

	public Player(Point point, float red, float green, float blue, float speed) {
		super(point, new Size(width, height), red, green, blue, speed, health, baseDmg);
	}

	public Player(float x, float y, Color color, Image image, float speed) {
		super(x, y, width, height, color, image, speed, health, baseDmg);
	}

	public Player(Point point, Color color, Image image, float speed) {
		super(point, new Size(width, height), color, image, speed, health, baseDmg);
	}

	public Player(float x, float y, float red, float green, float blue, Image image, float speed) {
		super(x, y, width, height, red, green, blue, image, speed, health, baseDmg);
	}

	public Player(Point point, float red, float green, float blue, Image image, float speed) {
		super(point, new Size(width, height), red, green, blue, image, speed, health, baseDmg);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawRect(getX(), getY(), getWidth(), getHeight());
	}
	
	@Override
	public void update(int delta){
		setX(getX() + motionX);
		setY(getY() + motionY);
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
		case Keyboard.KEY_UP:
			super.moveUp();
			break;
		case Keyboard.KEY_DOWN:
			super.moveDown();
			break;
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
}
