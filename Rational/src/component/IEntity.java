package component;

import org.newdawn.slick.Graphics;

public interface IEntity {
	public void draw(Graphics g);
	public void update(int delta);
	public void keyPressed(int key, char c);
	public void keyReleased(int key, char c);
	public float getHealth();
	public float getMaxHealth();
	public float getBaseDamage();
	public float getDamage();
	public float getDamageIncr();
	public float getMotionX();
	public float getMotionY();
	public void setHealth(float health);
	public void setMaxHealth(float MaxHealth);
	public void setBaseDamage(float baseDamage);
	public void setDamageIncr(float damageIncr);
	public void decrHealth(float amount);
	public void incrHealth(float amount);
	public void attack(Entity entity);
	public boolean isAlive();
}
