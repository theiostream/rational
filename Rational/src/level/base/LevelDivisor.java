package level.base;


import java.util.ArrayList;

import level.levels.FirstLevel;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class LevelDivisor {

	ArrayList<ILevel> levels = new ArrayList<ILevel>();
	
	//LEVELS!
	//TestLevel test = new TestLevel();
	FirstLevel first = new FirstLevel();
	
	public LevelDivisor() {
		//ADD LEVELS TO LIST!
		//levels.add(test);
		levels.add(first);
	}

	public void updateLevel(int level, int delta){
		for(int i = 0; i < levels.size(); i++){
			if(level == i){
				try {
					levels.get(i).update(delta);
				} catch (SlickException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void drawLevel(int level, Graphics g){
		for(int i = 0; i < levels.size(); i++){
			if(level == i){
				try {
					levels.get(i).draw(g);
				} catch (SlickException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void initLevel(int level){
		for(int i = 0; i < levels.size(); i++){
			if(level == i){
				try {
					levels.get(i).init();
				} catch (SlickException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void keyPressedLevel(int level, int key, char c){
		for(int i = 0; i < levels.size(); i++){
			if(level == i){
				levels.get(i).keyPressed(key, c);
			}
		}
	}
	
	public void keyReleasedLevel(int level, int key, char c){
		for(int i = 0; i < levels.size(); i++){
			if(level == i){
				levels.get(i).keyReleased(key, c);
			}
		}
	}
	
	public void mouseMovedLevel(int level, int oldx, int oldy, int newx, int newy){
		for(int i = 0; i < levels.size(); i++){
			if(level == i){
				levels.get(i).mouseMoved(oldx, oldy, newx, newy);
			}
		}
	}
	
	public void mousePressedLevel(int level, int button, int x, int y){
		for(int i = 0; i < levels.size(); i++){
			if(level == i){
				levels.get(i).mousePressed(button, x, y);
			}
		}
	}
	
	public void mouseReleasedLevel(int level, int button, int x, int y){
		for(int i = 0; i < levels.size(); i++){
			if(level == i){
				levels.get(i).mouseReleased(button, x, y);
			}
		}
	}
}
