package day11;

public class Nemo01 extends Moyang {
	private int width, height;
	private double area;
	
	// 생성자
	public Nemo01() {}
	
	public Nemo01(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() { // 오버로딩
		area = width * height;
	}
	
	@Override
	public void toPrint() {
		System.out.printf("가로가 %3d 이고, 세로가 %3d 이고, 넓이가 %6.2f 인 사각형", 
												width, height, area);
		System.out.println();
	}
}
