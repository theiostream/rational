package level;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import game.ILevel;
import game.Rational;

public class TestLevel implements ILevel {

	float x = 5, y = 455, motionX = 0, width = 50, height = 50;
	float bx = 5, by = 255, bmotionX = 0, bwidth = 150, bheight = 50;
	
	public TestLevel() {

	}

	@Override
	public void init() throws SlickException {

	}

	@Override
	public void update(int delta) throws SlickException {
		if(x + width + 150 >= Rational.getWidth() && motionX == 1){
			motionX = 0;
			bmotionX = -1;
		}else if(x <= 150 && motionX == -1){
			motionX = 0;
			bmotionX = 1;
		}else{
			bx += bmotionX;
			x += motionX;
		}
	}

	@Override
	public void draw(Graphics g) throws SlickException {
		g.drawRect(bx, by, bwidth, bheight);
		g.drawRect(bx + 400, by - 100, bwidth, bheight);
		g.drawRect(x, y, width, height);
	}
	
	public void keyPressed(int key, char c) {
		if (key == Keyboard.KEY_RIGHT) {
			motionX = 1;
		}
		else if (key == Keyboard.KEY_LEFT) {
			motionX = -1;
		}
	}
	
	public void keyReleased(int key, char c) {
		motionX = 0;
		bmotionX = 0;
	}

}
