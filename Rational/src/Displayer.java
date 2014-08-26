import game.Rational;

import java.io.File;

import org.lwjgl.LWJGLUtil;
import org.newdawn.slick.AppGameContainer;

public class Displayer {
	public static void main(String[] argv) {
		System.setProperty("org.lwjgl.librarypath", new File(new File(System.getProperty("user.dir"), "native"), LWJGLUtil.getPlatformName()).getAbsolutePath());
		
		try {
			AppGameContainer container = new AppGameContainer(Rational.getGame());
			container.setDisplayMode(Rational.getWidth(), Rational.getHeight(), false);
			container.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}