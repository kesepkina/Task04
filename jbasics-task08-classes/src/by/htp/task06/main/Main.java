package by.htp.task06.main;

/* Составьте описание класса для представления времени. Предусмотрте возможности установки времени
 * и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
 * времени на заданное количество часов, минут и секунд.*/

public class Main {

	public static void main(String[] args) {

		Time time1 = new Time();
		Time time2 = new Time(24, 12, 60);

		time1.GetTime();
		time2.GetTime();
		System.out.println();

		time1.setSeconds(25);
		time2.setHours(25);
		
		time1.GetTime();
		time2.GetTime();
		System.out.println();
		
		time1.Increase(22, 59, 140);
		time2.Decrease(12, 14, 15);

		time1.GetTime();
		time2.GetTime();

	}
}
