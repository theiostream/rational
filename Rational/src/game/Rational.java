package game;

import level.LevelDivisor;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;

import component.TextBox;
import component.Coords.Rect;
import font.Fonts;

public class Rational extends BasicGame {
	@SuppressWarnings("unused")
	private TrueTypeFont gameFont;
	private int playerX = 250, playerMove = 0;
	
	private LevelDivisor lDivisor = new LevelDivisor();
	
	int level = 0;
	
	Rect boxFrame = new Rect(Rational.getWidth()/2 - 500/2, 25, 500, 100);
	TextBox tBox = new TextBox(boxFrame, "What? Where am I? Why is everything black?", Color.white);
	
	public Rational(String title) {
		super(title);
	}
	
	public void init(GameContainer container) throws SlickException {
		initGL();
		initFonts();
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
		//playerX += playerMove;
	}
	
	public void render(GameContainer container, Graphics g) throws SlickException {
		lDivisor.drawLevel(level, g);
		//tBox.draw(g, gameFont);
		//g.setColor(Color.green);
		//g.fillRect(playerX, 500, 50, 50);
	}
	
	public void keyPressed(int key, char c) {
		lDivisor.keyPressedLevel(level, key, c);
		if (key == Keyboard.KEY_RIGHT) {
			playerMove = 1;
		}
		else if (key == Keyboard.KEY_LEFT) {
			playerMove = -1;
		}
	}
	
	public void keyReleased(int key, char c) {
		lDivisor.keyReleasedLevel(level, key, c);
		playerMove = 0;
	}
	
	public int getLevel(){
		return level;
	}
	
	public void setLevel(int level){
		this.level = level;
	}
	
	public static int getWidth() {
		return 800; 
	}
	
	public static int getHeight() {
		return 600;
	}
}
