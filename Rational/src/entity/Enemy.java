package entity;

import org.newdawn.slick.Color;
import org.newdawn.slick.Image;

import component.Entity;
import component.ObjectType;
import component.coords.Point;
import component.coords.Size;

public abstract class Enemy extends Entity implements IEnemy{

	public Enemy(float x, float y, float width, float height, float health, float baseDmg) {
		super(x, y, width, height, health, baseDmg);
	}

	public Enemy(Point point, Size size, float health, float baseDmg) {
		super(point, size, health, baseDmg);
	}

	public Enemy(float x, float y, float width, float height, Color color, float health, float baseDmg) {
		super(x, y, width, height, color, health, baseDmg);
	}

	public Enemy(Point point, Size size, Color color, float health, float baseDmg) {
		super(point, size, color, health, baseDmg);
	}

	public Enemy(float x, float y, float width, float height, float red, float green, float blue, float health, float baseDmg) {
		super(x, y, width, height, red, green, blue, health, baseDmg);
	}

	public Enemy(Point point, Size size, float red, float green, float blue, float health, float baseDmg) {
		super(point, size, red, green, blue, health, baseDmg);
	}

	public Enemy(float x, float y, float width, float height, Color color, Image image, float health, float baseDmg) {
		super(x, y, width, height, color, image, health, baseDmg);
	}

	public Enemy(Point point, Size size, Color color, Image image, float health, float baseDmg) {
		super(point, size, color, image, health, baseDmg);
	}

	public Enemy(float x, float y, float width, float height, float red, float green, float blue, Image image, float health, float baseDmg) {
		super(x, y, width, height, red, green, blue, image, health, baseDmg);
	}

	public Enemy(Point point, Size size, float red, float green, float blue, Image image, float health, float baseDmg) {
		super(point, size, red, green, blue, image, health, baseDmg);
	}

	public Enemy(float x, float y, float width, float height, float speed, float health, float baseDmg) {
		super(x, y, width, height, speed, health, baseDmg);
	}

	public Enemy(Point point, Size size, float speed, float health, float baseDmg) {
		super(point, size, speed, health, baseDmg);
	}

	public Enemy(float x, float y, float width, float height, Color color, float speed, float health, float baseDmg) {
		super(x, y, width, height, color, speed, health, baseDmg);
	}

	public Enemy(Point point, Size size, Color color, float speed, float health, float baseDmg) {
		super(point, size, color, speed, health, baseDmg);
	}

	public Enemy(float x, float y, float width, float height, float red, float green, float blue, float speed, float health, float baseDmg) {
		super(x, y, width, height, red, green, blue, speed, health, baseDmg);
	}

	public Enemy(Point point, Size size, float red, float green, float blue, float speed, float health, float baseDmg) {
		super(point, size, red, green, blue, speed, health, baseDmg);
	}

	public Enemy(float x, float y, float width, float height, Color color, Image image, float speed, float health, float baseDmg) {
		super(x, y, width, height, color, image, speed, health, baseDmg);
	}

	public Enemy(Point point, Size size, Color color, Image image, float speed, float health, float baseDmg) {
		super(point, size, color, image, speed, health, baseDmg);
	}

	public Enemy(float x, float y, float width, float height, float red, float green, float blue, Image image, float speed, float health, float baseDmg) {
		super(x, y, width, height, red, green, blue, image, speed, health,
				baseDmg);
	}

	public Enemy(Point point, Size size, float red, float green, float blue, Image image, float speed, float health, float baseDmg) {
		super(point, size, red, green, blue, image, speed, health, baseDmg);
	}
	
	@Override
	public ObjectType getType() {
		return ObjectType.ENEMY;
	}

}
