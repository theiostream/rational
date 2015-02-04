package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.newdawn.slick.Image;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

public class ImageLoader {

	public ImageLoader() {}	

	public Texture loadTexture(String key, String format){
		try {
			return TextureLoader.getTexture(format.toUpperCase(), new FileInputStream(new File("res/" + key + "." + format)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
        e.printStackTrace();
    }
    return null;
}

    public Image loadImage(String key, String format){
		try {
			return new Image(TextureLoader.getTexture(format.toUpperCase(), new FileInputStream(new File("res/" + key + "." + format))));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Image loadScaledImage(String key, String format, float scale){
		try {
			Image v1 = new Image(TextureLoader.getTexture(format.toUpperCase(), new FileInputStream(new File("Rational/res/" + key + "." + format))));
			v1.setFilter(Image.FILTER_NEAREST);
			return v1.getScaledCopy(scale);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
