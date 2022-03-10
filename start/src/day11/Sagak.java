package day11;

public class Sagak extends Figure {
	private int width, height;
	
	public Sagak() {}
	
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void setArea() {
		area = width * height;
	}
}
