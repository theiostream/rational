package component;

import org.newdawn.slick.Color;
import org.newdawn.slick.Image;

import component.Coords.Point;
import component.Coords.Size;
import entity.Player;
import game.Rational;

public class BgObj extends Drawable implements IDrawable {
	
	public void update(int delta, Player player){
		if(player.getX() + player.getWidth() + 150 >= Rational.getWidth() && player.getMotionX() == 1){
			player.stopX();
			moveLeft();
		}else if(player.getX() <= 150 && player.getMotionX() == -1){
			moveRight();
			player.stopX();
		}else if(player.getY() + player.getHeight() + 50 >= Rational.getHeight() && player.getMotionY() == 1){
			moveDown();
			player.stopY();
		}else if(player.getY() <= 50 && player.getMotionY() == -1){
			moveUp();
			player.stopY();
		}else{
			update(delta);
		}
	}
	
	public BgObj(float x, float y, float width, float height, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, Color.white, fill);
	}
	
	public BgObj(Point point, Size size, boolean fill){
		super(point, size, 0f, 0f, 1f, Color.white, fill);
	}
	
	public BgObj(float x, float y, float width, float height, Color color, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, color, fill);
	}
	
	public BgObj(Point point, Size size, Color color, boolean fill){
		super(point, size, 0f, 0f, 1f, color, fill);
	}
	
	public BgObj(float x, float y, float width, float height, float red, float green, float blue, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, new Color(red, green, blue), fill);
	}
	
	public BgObj(Point point, Size size, float red, float green, float blue, boolean fill){
		super(point, size, 0f, 0f, 1f, new Color(red, green, blue), fill);
	}
	
	public BgObj(float x, float y, float width, float height, Color color, Image image){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, color, image);
	}
	
	public BgObj(Point point, Size size, Color color, Image image){
		super(point, size, 0f, 0f, 1f, color, image);
	}
	
	public BgObj(float x, float y, float width, float height, float red, float green, float blue, Image image){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, new Color(red, green, blue), image);
	}
	
	public BgObj(Point point, Size size, float red, float green, float blue, Image image){
		super(point, size, 0f, 0f, 1f, new Color(red, green, blue), image);
	}
	
	public BgObj(float x, float y, float width, float height, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, Color.white, fill);
	}
	
	public BgObj(Point point, Size size, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, Color.white, fill);
	}
	
	public BgObj(float x, float y, float width, float height, Color color, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, color, fill);
	}
	
	public BgObj(Point point, Size size, Color color, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, color, fill);
	}
	
	public BgObj(float x, float y, float width, float height, float red, float green, float blue, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, new Color(red, green, blue), fill);
	}
	
	public BgObj(Point point, Size size, float red, float green, float blue, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, new Color(red, green, blue), fill);
	}
	
	public BgObj(float x, float y, float width, float height, Color color, Image image, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, color, image);
	}
	
	public BgObj(Point point, Size size, Color color, Image image, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, color, image);
	}
	
	public BgObj(float x, float y, float width, float height, float red, float green, float blue, Image image, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, new Color(red, green, blue), image);
	}
	
	public BgObj(Point point, Size size, float red, float green, float blue, Image image, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, new Color(red, green, blue), image);
	}
}
