package level.base;


import java.util.ArrayList;

import level.levels.TestLevel;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class LevelDivisor {

	ArrayList<ILevel> levels = new ArrayList<ILevel>();
	
	//LEVELS!
	TestLevel test = new TestLevel();
	
	public LevelDivisor() {
		//ADD LEVELS TO LIST!
		levels.add(test);
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
}
