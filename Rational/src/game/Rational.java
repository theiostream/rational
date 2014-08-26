package game;

import level.base.LevelDivisor;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;

import component.TextBox;
import component.coords.Rect;

import font.Fonts;

public class Rational extends BasicGame {
	
	@SuppressWarnings("unused")
	private TrueTypeFont gameFont;
	
	private LevelDivisor lDivisor = new LevelDivisor();
	
	int level = 0;
	
	Rect boxFrame = new Rect(Rational.getWidth()/2 - 500/2, 25, 500, 100);
	TextBox tBox = new TextBox(boxFrame, "What? Where am I? Why is everything black?", Color.white);
	
	private static Rational INSTANCE = new Rational("Rational");
	public static Rational getGame() {
		return INSTANCE;
	}
	
	public Rational(String title) {
		super(title);
	}
	
	public void init(GameContainer container) throws SlickException {
		initGL();
		initFonts();
		
		lDivisor.initLevel(level);
	}

	public void initGL(){
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, getWidth(), getHeight(), 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_BLEND);
	}
	
	public void initFonts(){
		try {
			gameFont = Fonts.gameFont();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(GameContainer container, int delta) throws SlickException {
		lDivisor.updateLevel(level, delta);
	}
	
	public void render(GameContainer container, Graphics g) throws SlickException {
		lDivisor.drawLevel(level, g);
	}
	
	public void keyPressed(int key, char c) {
		lDivisor.keyPressedLevel(level, key, c);
	}
	
	public void keyReleased(int key, char c) {
		lDivisor.keyReleasedLevel(level, key, c);
	}
	
	public int getLevel(){
		return level;
	}
	
	public void setLevel(int level){
		this.level = level;
		lDivisor.initLevel(level);
	}
	
	public static int getWidth() {
		return 800; 
	}
	
	public static int getHeight() {
		return 600;
	}
}
