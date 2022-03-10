package day11;

// 원 한개의 정보를 기억할 클래스
public class Won {
	private int rad;
	private double arround, area;
	public static final double PI = 3.14;
	
	public Won() {}
	
	public Won(int rad) {
		this.rad = rad;
	}

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public double getArround() {
		return arround;
	}

	public void setArround(double arround) {
		this.arround = arround;
	}
	
	public void setArround() {
		arround = 2 * rad * Won.PI;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() {
		area = rad * rad * Won.PI;
	}
	
	
}
