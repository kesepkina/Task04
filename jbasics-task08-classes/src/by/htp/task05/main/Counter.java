package by.htp.task05.main;

public class Counter {

	private int value;

	public Counter() {
		value = 0;
	}

	public Counter(int value) {
		this.value = value;
	}

	public void Increase() {
		value++;
	}

	public void Decrease() {
		value--;
	}

	public int getValue() {
		return value;
	}

}
