package level;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import component.BgObj;
import component.Coords.Point;
import component.Coords.Size;

import entity.Player;

public class BgObjList {

	ArrayList<BgObj> bgObjs = new ArrayList<BgObj>();
	
	public BgObjList() {}

	public void update(int delta, Player player, boolean yScroll){
		for(int i = 0; i < bgObjs.size(); i++){
			bgObjs.get(i).update(delta, player, yScroll);
		}
	}
	
	public void draw(Graphics g){
		for(int i = 0; i < bgObjs.size(); i++){
			bgObjs.get(i).draw(g); 
		}
	}
	
	public void moveLeft(){
		for(int i = 0; i < bgObjs.size(); i++){
			bgObjs.get(i).moveLeft();;
		}
	}
	
	public void moveRight(){
		for(int i = 0; i < bgObjs.size(); i++){
			bgObjs.get(i).moveRight();
		}
	}
	
	public void moveUp(){
		for(int i = 0; i < bgObjs.size(); i++){
			bgObjs.get(i).moveUp();
		}
	}
	
	public void moveDown(){
		for(int i = 0; i < bgObjs.size(); i++){
			bgObjs.get(i).moveDown();
		}
	}
	
	public void stopX(){
		for(int i = 0; i < bgObjs.size(); i++){
			bgObjs.get(i).stopX();
		}
	}
	
	public void stopY(){
		for(int i = 0; i < bgObjs.size(); i++){
			bgObjs.get(i).stopY();
		}
	}
	
	public void stop(){
		for(int i = 0; i < bgObjs.size(); i++){
			bgObjs.get(i).stop();
		}
	}
	
	public void add(float x, float y, float width, float height, boolean fill){
		bgObjs.add(new BgObj(x, y, width, height, fill));
	}
	
	public void add(Point point, Size size, boolean fill){
		bgObjs.add(new BgObj(point, size, fill));
	}
	
	public void add(float x, float y, float width, float height, Color color, boolean fill){
		bgObjs.add(new BgObj(x, y, width, height, color, fill));
	}
	
	public void add(Point point, Size size, Color color, boolean fill){
		bgObjs.add(new BgObj(point, size, color, fill));
	}
	
	public void add(float x, float y, float width, float height, String texture){
		bgObjs.add(new BgObj(x, y, width, height, Color.white, new Image(loadTexture(texture))));
	}
	
	public void add(Point point, Size size, String texture){
		bgObjs.add(new BgObj(point, size, Color.white, new Image(loadTexture(texture))));
	}
	
	public void add(float x, float y, float width, float height, Color color, String texture){
		bgObjs.add(new BgObj(x, y, width, height, color, new Image(loadTexture(texture))));
	}
	
	public void add(Point point, Size size, Color color, String texture){
		bgObjs.add(new BgObj(point, size, color, new Image(loadTexture(texture))));
	}
	
	private Texture loadTexture(String key){
		try {
			return TextureLoader.getTexture("PNG", new FileInputStream(new File("res/" + key + ".png")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
