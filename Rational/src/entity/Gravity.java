package entity;

import component.Entity;

public class Gravity {

	public Gravity() {}
	
	public void update(int delta, Entity entity, float gravity){
		entity.setMotionY(entity.getMotionY() - gravity);
	}

}
