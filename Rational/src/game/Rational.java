package game;

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
	public static int getWidth() { return 800; }
	public static int getHeight() { return 600; }
	
	public Rational(String title) {
		super(title);
	}

	private TrueTypeFont gameFont;
	private int playerX=250, playerMove=0;
	
	Rect boxFrame = new Rect(Rational.getWidth()/2 - 500/2, 225, 500, 100);
	TextBox tBox = new TextBox(boxFrame, "What? Where am I? Why is everything black?", Color.white);
	
	public void init(GameContainer container) throws SlickException {
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, getWidth(), getHeight(), 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_BLEND);
		
		try {
			gameFont = Fonts.gameFont();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(GameContainer container, int delta) throws SlickException {
		playerX += playerMove;
	}
	
	public void render(GameContainer container, Graphics g) throws SlickException {
		tBox.draw(g, gameFont);
		g.setColor(Color.green);
		g.fillRect(playerX, 500, 50, 50);
	}
	
	public void keyPressed(int key, char c) {
		if (key == Keyboard.KEY_RIGHT) {
			playerMove = 1;
		}
		else if (key == Keyboard.KEY_LEFT) {
			playerMove = -1;
		}
	}
	
	public void keyReleased(int key, char c) {
		playerMove = 0;
	}
	
		
}
