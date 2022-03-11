package day12.sub;

public class Nemo implements Figure {
	private int garo, sero, area;
	
	// 생성자
	public Nemo() {}
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	
	@Override
	public void setArea() {
		area = garo * sero;
	}

	@Override
	public void toPrint() {
		System.out.printf("이 사각형은 가로가 %3d 이고 세로가 %3d 이고 면적이 %6d 입니다.", garo, sero, area);
		System.out.println();
	}
	public int getGaro() {
		return garo;
	}
	public void setGaro(int garo) {
		this.garo = garo;
	}
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}

}
