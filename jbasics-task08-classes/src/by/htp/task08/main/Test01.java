package by.htp.task08.main;

public class Test01 {

	private int a;
	private int b;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void getAB() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public int sum() {
		int sum = 0;
		sum = a + b;
		return sum;
	}

	public int max() {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}

}
