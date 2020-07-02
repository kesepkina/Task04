package by.htp.task05.main;

// ќпишите класс, реализующий дес€тичный счетчик, который может увеличивать или уменьшать
// свое значение на единицу в заданном диапазоне.ѕредусмотрите инициализацию счетчика
// значени€ми по умолчанию и произвольными значени€ми.—четчик имеет методы увеличени€ и
// уменьшени€ состо€ни€,и метод позвол€ющее получить его текущее состо€ние.Ќаписать код,
// демонстрирующий все возможности класса.

public class Main {

	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter(3);

		System.out.println("Counter1 = " + counter1.getValue());
		System.out.println("Counter2 = " + counter2.getValue());

		counter1.Increase();
		counter2.Decrease();

		System.out.println("Counter1 = " + counter1.getValue());
		System.out.println("Counter2 = " + counter2.getValue());

	}

}
