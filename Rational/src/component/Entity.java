package component;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.Image;

import component.coords.Point;
import component.coords.Size;

import entity.Gravity;

public abstract class Entity extends Drawable implements IEntity {

	private Gravity gravity = new Gravity();
	private float maxHealth, health, baseDmg, dmg, dmgIncr;
	
	public Entity(float x, float y, float width, float height, float health, float baseDmg){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, Color.white, true);
		this.maxHealth = health;
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(Point point, Size size, float health, float baseDmg){
		super(point, size, 0f, 0f, 1f, Color.white, true);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(float x, float y, float width, float height, Color color, float health, float baseDmg){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, color, true);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(Point point, Size size, Color color, float health, float baseDmg){
		super(point, size, 0f, 0f, 1f, color, true);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(float x, float y, float width, float height, float red, float green, float blue, float health, float baseDmg){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, new Color(red, green, blue), true);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(Point point, Size size, float red, float green, float blue, float health, float baseDmg){
		super(point, size, 0f, 0f, 1f, new Color(red, green, blue), true);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(float x, float y, float width, float height, Color color, Image image, float health, float baseDmg){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, color, image);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(Point point, Size size, Color color, Image image, float health, float baseDmg){
		super(point, size, 0f, 0f, 1f, color, image);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(float x, float y, float width, float height, float red, float green, float blue, Image image, float health, float baseDmg){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, new Color(red, green, blue), image);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(Point point, Size size, float red, float green, float blue, Image image, float health, float baseDmg){
		super(point, size, 0f, 0f, 1f, new Color(red, green, blue), image);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(float x, float y, float width, float height, float speed, float health, float baseDmg){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, Color.white, true);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(Point point, Size size, float speed, float health, float baseDmg){
		super(point, size, 0f, 0f, speed, Color.white, true);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(float x, float y, float width, float height, Color color, float speed, float health, float baseDmg){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, color, true);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(Point point, Size size, Color color, float speed, float health, float baseDmg){
		super(point, size, 0f, 0f, speed, color, true);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(float x, float y, float width, float height, float red, float green, float blue, float speed, float health, float baseDmg){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, new Color(red, green, blue), true);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(Point point, Size size, float red, float green, float blue, float speed, float health, float baseDmg){
		super(point, size, 0f, 0f, speed, new Color(red, green, blue), true);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(float x, float y, float width, float height, Color color, Image image, float speed, float health, float baseDmg){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, color, image);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(Point point, Size size, Color color, Image image, float speed, float health, float baseDmg){
		super(point, size, 0f, 0f, speed, color, image);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(float x, float y, float width, float height, float red, float green, float blue, Image image, float speed, float health, float baseDmg){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, new Color(red, green, blue), image);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	public Entity(Point point, Size size, float red, float green, float blue, Image image, float speed, float health, float baseDmg){
		super(point, size, 0f, 0f, speed, new Color(red, green, blue), image);
		this.health = health;
		this.baseDmg = baseDmg;
	}
	
	@Override
	public void update(int delta){
		gravity.update(delta, this, 0.5f);
	}

	@Override
	public void keyPressed(int key, char c) {
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
	public float getHealth(){
		return this.health;
	}
	
	@Override
	public float getMaxHealth(){
		return this.maxHealth;
	}
	
	@Override
	public float getBaseDamage(){
		return this.baseDmg;
	}
	
	@Override
	public float getDamageIncr(){
		return this.dmg;
	}
	
	@Override
	public float getDamage(){
		return this.baseDmg + this.dmgIncr;
	}
	
	@Override
	public void setMaxHealth(float maxHealth){
		this.maxHealth = maxHealth;
	}
	
	@Override
	public void setHealth(float health) {
		this.health = health;
	}
	
	@Override
	public void setBaseDamage(float baseDamage){
		this.baseDmg = baseDamage;
	}
	
	@Override
	public void setDamageIncr(float damageIncr){
		this.dmgIncr = damageIncr;
	}
	
	@Override
	public void decrHealth(float amount){
		this.health -= amount;
	}
	
	@Override
	public void incrHealth(float amount){
		this.health += amount;
	}
	
	@Override
	public void attack(Entity entity){
		entity.decrHealth(baseDmg);
	}

	@Override
	public boolean isAlive() {
		if(health <= 0){
			return false;
		}else{
			return true;
		}
	}
	
	@Override
	public ObjectType getType() {
		return ObjectType.ENTITY;
	}

}
