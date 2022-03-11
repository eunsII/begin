package day12;

public class Test02 {
	public Test02() {
		Abc a = new Abc();
		Efg e = new Efg();
		
		toPrint(a);
		toPrint(e); // Abc a = e; 와 같이 자동형변환 되서 매개변수에 기억된다.
	}
	public static void main(String[] args) {
		new Test02();
	}
	
	public void toPrint(Abc a) {
		a.abc();
	}
}

class Abc {
	public void abc() {
		System.out.println("############## 나는 Abc.abc() ##############");
	}
}

class Efg extends Abc {
	public void abc() {
		System.out.println("************** 나는 Efg.abc() **************");
	}
}
