package level.base;

import java.util.ArrayList;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import util.ImageLoader;

import component.BackgroundObject;
import component.Drawable;
import component.ForegroundObject;
import component.ObjectType;
import component.coords.Point;
import component.coords.Size;

import entity.Player;
import game.Rational;

public class ObjectList {
	
	static ImageLoader imgLoad = new ImageLoader();
	private boolean check1 = false, check2 = false, check3 = false, check4 = false, check5 = false, check6 = false;
	
	ArrayList<Drawable> objects = new ArrayList<Drawable>();
	
	public ObjectList() {}
	
	public void update(int delta, Player player, boolean yScroll){
		if (player.getX() + player.getWidth() + 150 >= Rational.getWidth() && player.getMotionX() == 1){
			check1 = true;
		}
		else if(player.getX() <= 150 && player.getMotionX() == -1){
			check2 = true;
		}
		else{
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
	
	public void draw(Graphics g){
		for (int i = 0; i < objects.size(); i++){
			objects.get(i).draw(g);
		}
	}
	
	public void keyPressed(int key, char c){
		for(int i = 0; i < objects.size(); i++){
			objects.get(i).keyPressed(key, c);
		}
	}
	
	public void keyReleased(int key, char c){
		for(int i = 0; i < objects.size(); i++){
			objects.get(i).keyReleased(key, c);
		}
	}
	
	public void mouseMoved(int oldx, int oldy, int newx, int newy){
		for(int i = 0; i < objects.size(); i++){
			Drawable object = objects.get(i);
			if (object.getRect().isWithinPoint(new Point(newx, newy)))
				object.mouseMoved(oldx, oldy, newx, newy);
		}
	}
	
	public void mousePressed(int button, int x, int y){
		for(int i = 0; i < objects.size(); i++){
			System.out.println("Mouse Pressed: Doing stuff");
			
			Drawable object = objects.get(i);
			if (object.getRect().isWithinPoint(new Point(x, y))) {
				System.out.println("Within?");
				object.mousePressed(button, x, y);
			}
		}
	}
	
	public void mouseReleased(int button, int x, int y){
		for(int i = 0; i < objects.size(); i++){
			Drawable object = objects.get(i);
			if (object.getRect().isWithinPoint(new Point(x, y)))
				object.mouseReleased(button, x, y);
		}
	}
	
	public ObjectList getDrawableList(ObjectType type){
		ObjectList list = new  ObjectList();
		
		for(int i = 0; i < objects.size(); i++){
			if(objects.get(i).getType() == type){
				list.add(objects.get(i));
				objects.remove(i);
			}
		}
		
		return list;
	}
	
	public void moveLeft(){
		for(int i = 0; i < objects.size(); i++){
			objects.get(i).moveLeft();
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
	
	public void addBgObj(float x, float y, float width, float height, boolean fill){
		objects.add(new BackgroundObject(x, y, width, height, fill));
	}
	
	public void addBgObj(Point point, Size size, boolean fill){
		objects.add(new BackgroundObject(point, size, fill));
	}
	
	public void addBgObj(float x, float y, float width, float height, Color color, boolean fill){
		objects.add(new BackgroundObject(x, y, width, height, color, fill));
	}
	
	public void addBgObj(Point point, Size size, Color color, boolean fill){
		objects.add(new BackgroundObject(point, size, color, fill));
	}
	
	public void addBgObj(float x, float y, float width, float height, String texture){
		objects.add(new BackgroundObject(x, y, width, height, Color.white, imgLoad.loadImage(texture, "png")));
	}
	
	public void addBgObj(Point point, Size size, String texture){
		objects.add(new BackgroundObject(point, size, Color.white, imgLoad.loadImage(texture, "png")));
	}
	
	public void addBgObj(float x, float y, float width, float height, Color color, String texture){
		objects.add(new BackgroundObject(x, y, width, height, color, imgLoad.loadImage(texture, "png")));
	}
	
	public void addBgObj(Point point, Size size, Color color, String texture){
		objects.add(new BackgroundObject(point, size, color, imgLoad.loadImage(texture, "png")));
	}
	
	public void addFgObj(float x, float y, float width, float height, boolean fill){
		objects.add(new ForegroundObject(x, y, width, height, fill));
	}
	
	public void addFgObj(Point point, Size size, boolean fill){
		objects.add(new ForegroundObject(point, size, fill));
	}
	
	public void addFgObj(float x, float y, float width, float height, Color color, boolean fill){
		objects.add(new ForegroundObject(x, y, width, height, color, fill));
	}
	
	public void addFgObj(Point point, Size size, Color color, boolean fill){
		objects.add(new ForegroundObject(point, size, color, fill));
	}
	
	public void addFgObj(float x, float y, float width, float height, String texture){
		objects.add(new ForegroundObject(x, y, width, height, Color.white, imgLoad.loadImage(texture, "png")));
	}
	
	public void addFgObj(Point point, Size size, String texture){
		objects.add(new ForegroundObject(point, size, Color.white, imgLoad.loadImage(texture, "png")));
	}
	
	public void addFgObj(float x, float y, float width, float height, Color color, String texture){
		objects.add(new ForegroundObject(x, y, width, height, color, imgLoad.loadImage(texture, "png")));
	}
	
	public void addFgObj(Point point, Size size, Color color, String texture){
		objects.add(new ForegroundObject(point, size, color, imgLoad.loadImage(texture, "png")));
	}
	
	/*public void addTextBox(float x, float y, float width, float height, String text){
		objects.add(new TextBox(x, y, width, height, text));
	}
	
	public void addTextBox(Point point, Size size, String text){
		objects.add(new TextBox(point, size, text));
	}
	
	public void addTextBox(float x, float y, float width, float height, Color color, String text){
		objects.add(new TextBox(x, y, width, height, text, color));
	}
	
	public void addTextBox(Point point, Size size, Color color, String text){
		objects.add(new TextBox(point, size, color, text));
	}
	
	public void addTextBox(float x, float y, float width, float height, String texture, String text){
		objects.add(new TextBox(x, y, width, height, new Image(loadTexture(texture)), text));
	}
	
	public void addTextBox(Point point, Size size, Color color, String texture, String text){
		objects.add(new TextBox(point, size, new Image(loadTexture(texture)), text));
	}*/
	
	/*public void addButton(float x, float y, float width, float height, Color color, String function, String text){
		objects.add(new Button(x, y, width, height, color, function, text));
	}
	
	public void addButton(Point point, Size size, Color color, String texture, String function, String text){
		objects.add(new Button(point, size, new Image(loadTexture(texture)), function, text));
	}
	
	public void addButton(Point point, Size size, String texture, String function, String text){
		objects.add(new Button(point, size, new Image(loadTexture(texture)), function, text));
	}
	
	public void addButton(float x, float y, float width, float height, Color color, String function, String text){
		objects.add(new Button(x, y, width, height, color, function, text));
	}*/
	
	public void add(Drawable drawable) {
		objects.add(drawable);
	}
	
}
