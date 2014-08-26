package component;

import org.newdawn.slick.Color;
import org.newdawn.slick.Image;

import component.coords.Point;
import component.coords.Size;
import entity.Player;

public class FgObj extends Drawable implements IDrawable {

	public void update(int delta, Player player, boolean check1, boolean check2, boolean check3, boolean check4, boolean check5, boolean check6){
		if(check1){
			moveLeft();
			player.stopX();
		}else if(check2){
			moveRight();
			player.stopX();
		}else if(check3){
			update(delta);
		}
		
		if(check4){
			moveUp();
			player.stopY();
		}else if(check5){
			moveDown();
			player.stopY();
		}else if(check6){
			update(delta);
		}
		
		if(player.intersectsUp(this) && player.getMotionY() == 1){
			player.setMotionY(0);
		}else if(player.intersectsDown(this) && player.getMotionY() == -1){
			player.setMotionY(0);
		}else if(player.intersectsLeft(this) && player.getMotionX() == 1){
			player.setMotionX(0);
		}else if(player.intersectsRight(this) && player.getMotionX() == -1){
			player.setMotionX(0);
		}
	}

	public FgObj(float x, float y, float width, float height, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, Color.white, fill);
	}
	
	public FgObj(Point point, Size size, boolean fill){
		super(point, size, 0f, 0f, 1f, Color.white, fill);
	}
	
	public FgObj(float x, float y, float width, float height, Color color, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, color, fill);
	}
	
	public FgObj(Point point, Size size, Color color, boolean fill){
		super(point, size, 0f, 0f, 1f, color, fill);
	}
	
	public FgObj(float x, float y, float width, float height, float red, float green, float blue, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, new Color(red, green, blue), fill);
	}
	
	public FgObj(Point point, Size size, float red, float green, float blue, boolean fill){
		super(point, size, 0f, 0f, 1f, new Color(red, green, blue), fill);
	}
	
	public FgObj(float x, float y, float width, float height, Color color, Image image){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, color, image);
	}
	
	public FgObj(Point point, Size size, Color color, Image image){
		super(point, size, 0f, 0f, 1f, color, image);
	}
	
	public FgObj(float x, float y, float width, float height, float red, float green, float blue, Image image){
		super(new Point(x, y), new Size(width, height), 0f, 0f, 1f, new Color(red, green, blue), image);
	}
	
	public FgObj(Point point, Size size, float red, float green, float blue, Image image){
		super(point, size, 0f, 0f, 1f, new Color(red, green, blue), image);
	}
	
	public FgObj(float x, float y, float width, float height, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, Color.white, fill);
	}
	
	public FgObj(Point point, Size size, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, Color.white, fill);
	}
	
	public FgObj(float x, float y, float width, float height, Color color, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, color, fill);
	}
	
	public FgObj(Point point, Size size, Color color, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, color, fill);
	}
	
	public FgObj(float x, float y, float width, float height, float red, float green, float blue, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, new Color(red, green, blue), fill);
	}
	
	public FgObj(Point point, Size size, float red, float green, float blue, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, new Color(red, green, blue), fill);
	}
	
	public FgObj(float x, float y, float width, float height, Color color, Image image, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, color, image);
	}
	
	public FgObj(Point point, Size size, Color color, Image image, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, color, image);
	}
	
	public FgObj(float x, float y, float width, float height, float red, float green, float blue, Image image, float speed, boolean fill){
		super(new Point(x, y), new Size(width, height), 0f, 0f, speed, new Color(red, green, blue), image);
	}
	
	public FgObj(Point point, Size size, float red, float green, float blue, Image image, float speed, boolean fill){
		super(point, size, 0f, 0f, speed, new Color(red, green, blue), image);
	}
}
