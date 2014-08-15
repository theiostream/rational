package level;

import game.ILevel;
import game.Rational;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class TestLevel implements ILevel {
	
	BgObjList bgObjList = new BgObjList();
	float x = 5, y = 455, motionX = 0, width = 50, height = 50;
	
	public TestLevel() {
		bgObjList.add(5, 255, 150, 50);
		bgObjList.add(405, 155, 150, 50);
	}

	@Override
	public void init() throws SlickException {
		
	}

	@Override
	public void update(int delta) throws SlickException {
		bgObjList.update(delta);
		if(x + width + 150 >= Rational.getWidth() && motionX == 1){
			motionX = 0;
			bgObjList.moveLeft();
		}else if(x <= 150 && motionX == -1){
			motionX = 0;
			bgObjList.moveRight();
		}else{
			x += motionX;
		}
	}

	@Override
	public void draw(Graphics g) throws SlickException {
		bgObjList.draw(g);
		g.drawRect(x, y, width, height);
	}
	
	public void keyPressed(int key, char c) {
		//bgObjList.keyPressed(key, c);
		if (key == Keyboard.KEY_RIGHT) {
			motionX = 1;	
		}
		else if (key == Keyboard.KEY_LEFT) {
			motionX = -1;
		}
	}
	
	public void keyReleased(int key, char c) {
		//bgObjList.keyReleased(key, c);
		bgObjList.stopX();
		motionX = 0;
	}

}
