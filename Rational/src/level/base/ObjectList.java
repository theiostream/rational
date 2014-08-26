package level.base;

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

import component.BackgroundObject;
import component.Drawable;
import component.coords.Point;
import component.coords.Size;

import entity.Player;
import game.Rational;

public class ObjectList {

	private boolean check1 = false, check2 = false, check3 = false, check4 = false, check5 = false, check6 = false;
	private boolean dynamic = true;
	ArrayList<Drawable> objects = new ArrayList<Drawable>();
	
	public ObjectList(boolean dyn) {
		this.dynamic = dyn;
	}
	
	public void update(int delta, Player player, boolean yScroll){
		if (this.dynamic) {
			if(player.getX() + player.getWidth() + 150 >= Rational.getWidth() && player.getMotionX() == 1){
					check1 = true;
				}else if(player.getX() <= 150 && player.getMotionX() == -1){
					check2 = true;
				}else{
					check3 = true;
				}
				
			if(yScroll){
				if(player.getY() + player.getHeight() + 150 >= Rational.getHeight() && player.getMotionY() == 1){
					check4 = true;
				}else if(player.getY() <= 150 && player.getMotionY() == -1){
					check5 = true;
				}else{
					check6 = true;
				}
			}
			
			for(int i = 0; i < objects.size(); i++){
				objects.get(i).update(delta, player, check1, check2, check3, check4, check5, check6);
			}
			
			check1 = false;
			check2 = false;
			check3 = false;
			check4 = false;
			check5 = false;
			check6 = false;
		}
	}
	
	public void draw(Graphics g){
		for(int i = 0; i < objects.size(); i++){
			objects.get(i).draw(g);
		}
	}
	
	public void moveLeft(){
		for(int i = 0; i < objects.size(); i++){
			objects.get(i).moveLeft();;
		}
	}
	
	public void moveRight(){
		for(int i = 0; i < objects.size(); i++){
			objects.get(i).moveRight();
		}
	}
	
	public void moveUp(){
		for(int i = 0; i < objects.size(); i++){
			objects.get(i).moveUp();
		}
	}
	
	public void moveDown(){
		for(int i = 0; i < objects.size(); i++){
			objects.get(i).moveDown();
		}
	}
	
	public void stopX(){
		for(int i = 0; i < objects.size(); i++){
			objects.get(i).stopX();
		}
	}
	
	public void stopY(){
		for(int i = 0; i < objects.size(); i++){
			objects.get(i).stopY();
		}
	}
	
	public void stop(){
		for(int i = 0; i < objects.size(); i++){
			objects.get(i).stop();
		}
	}
	
	
	
	public void add(float x, float y, float width, float height, boolean fill){
		objects.add(new BackgroundObject(x, y, width, height, fill));
	}
	
	public void add(Point point, Size size, boolean fill){
		objects.add(new BackgroundObject(point, size, fill));
	}
	
	public void add(float x, float y, float width, float height, Color color, boolean fill){
		objects.add(new BackgroundObject(x, y, width, height, color, fill));
	}
	
	public void add(Point point, Size size, Color color, boolean fill){
		objects.add(new BackgroundObject(point, size, color, fill));
	}
	
	public void add(float x, float y, float width, float height, String texture){
		objects.add(new BackgroundObject(x, y, width, height, Color.white, new Image(loadTexture(texture))));
	}
	
	public void add(Point point, Size size, String texture){
		objects.add(new BackgroundObject(point, size, Color.white, new Image(loadTexture(texture))));
	}
	
	public void add(float x, float y, float width, float height, Color color, String texture){
		objects.add(new BackgroundObject(x, y, width, height, color, new Image(loadTexture(texture))));
	}
	
	public void add(Point point, Size size, Color color, String texture){
		objects.add(new BackgroundObject(point, size, color, new Image(loadTexture(texture))));
	}
	
	public void add(Drawable drawable) {
		objects.add(drawable);
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
