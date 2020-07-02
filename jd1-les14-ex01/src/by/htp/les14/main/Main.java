package by.htp.les14.main;

import java.util.GregorianCalendar;
import java.util.List;

import by.htp.les14.entity.Depo;
import by.htp.les14.entity.Train;
import by.htp.les14.logic.TrainLogic;
import by.htp.les14.view.TrainView;

/*4. Создайте класс Train, содержащий поля: название пункта назначения, 
номер поезда, время отправления. Создайте данные в массив из пяти элементов 
типа Train, добавьте возможность сортировки элементов массива по номерам поездов. 
Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми 
пунктами назначения должны быть упорядочены по времени отправления.*/
public class Main {

	public static void main(String[] args) {

		Depo depo = new Depo();
		TrainLogic logic = new TrainLogic();
		TrainView view = new TrainView();

		depo.addTrain(new Train("Moscow", 12334, new GregorianCalendar(2020, 8, 1, 12, 20)));
		depo.addTrain(new Train());
		depo.addTrain(new Train("Brest", 12763, new GregorianCalendar(2020, 8, 1, 12, 25)));
		depo.addTrain(new Train("Moscow", 23743, new GregorianCalendar(2020, 8, 1, 12, 19)));
		depo.addTrain(new Train("Moscow", 23742, new GregorianCalendar(2020, 8, 1, 13, 19)));

		List<Train> sorted1;
		sorted1 = logic.sortByNumber(depo.getTrains());
		view.print("By Number", sorted1);

		Train train;
		int findNumber = 12334;
		train = logic.findByNumber(findNumber, depo.getTrains());
		System.out.println("Train with number " + findNumber);
		view.print(train);
		System.out.println();

		List<Train> sorted2;
		sorted2 = logic.sortBy(depo.getTrains());
		view.print("By Destination", sorted2);
	}

}
