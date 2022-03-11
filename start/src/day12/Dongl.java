package day12;

public class Dongl extends Figure {
	private int rad;
	private double arround, area;
	
	// 생성자
	public Dongl() {}
	
	public Dongl(int rad) {
		this.rad = rad;
		setArea(); // 면적셋팅
		setArround(); // 둘레셋팅
	}
	
	@Override
	public void setArea() {
		area = rad * rad * Math.PI;
	}
	
	public void setArround() {
		arround = 2 * rad * Math.PI;
	}

	@Override
	public void toPrint() {
		System.out.printf("이 원은 반지름이 %3d 이고 둘레가 %6.2f 이고 면적이 %6.2f 입니다.", rad, arround, area);
		System.out.println();
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

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
