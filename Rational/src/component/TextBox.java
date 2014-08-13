package component;

public abstract class TextBox implements ITextBox {

	public double x, y, width, height;
	public String text;
	public TextBox(double x, double y, double width, double height, String text) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.text = text;
	}

	@Override
	public void draw() {

	}

	@Override
	public void update(int delta) {

	}

	@Override
	public void setLocation(double x, double y) {
		setX(x);
		setY(y);
	}

	@Override
	public void setX(double x) {
		this.x = x;
	}

	@Override
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public void setText(String text){
		this.text = text;
	}

	@Override
	public double getX() {
		return x;
	}

	@Override
	public double getY() {
		return y;
	}

	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public double getHeight() {
		return height;
	}
	
	@Override
	public String getText(){
		return text;
	}

}
