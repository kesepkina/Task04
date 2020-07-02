package by.htp.airline.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import by.htp.airline.entity.Airline;
import by.htp.airline.entity.DataBase;
import by.htp.airline.entity.Time;
import by.htp.airline.logic.AirlineLogic;
import by.htp.airline.view.AirlineView;

public class Main {

	/*
	 * Создать класс Airline, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Airline, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль. Airline: пункт
	 * назначения, номер рейса, тип самолета, время вылета, дни недели. Найти и
	 * вывести: a) список рейсов для заданного пункта назначения; b) список рейсов
	 * для заданного дня недели; c) список рейсов для заданного дня недели, время
	 * вылета для которых больше заданного.
	 */

	public static void main(String[] args) {

		DataBase database1 = new DataBase();
		AirlineLogic logic = new AirlineLogic();
		AirlineView view = new AirlineView();

		database1.addAirline(new Airline("Moscow", "BA 12", "Boeing-737", new Time(12, 23, 45),
				new ArrayList<>(Arrays.asList(Calendar.MONDAY, Calendar.WEDNESDAY, Calendar.FRIDAY))));
		database1.addAirline(new Airline("Moscow", "BA 32", "Boeing-747", new Time(6, 0, 15), new ArrayList<>(
				Arrays.asList(Calendar.TUESDAY, Calendar.THURSDAY, Calendar.SATURDAY, Calendar.SUNDAY))));
		database1.addAirline(new Airline("New York", "AA 312", "Airbus A310", new Time(10, 19, 0),
				new ArrayList<>(Arrays.asList(Calendar.WEDNESDAY))));
		database1.addAirline(new Airline("Warsaw", "LC 220", "Boeing-737", new Time(15, 5, 45),
				new ArrayList<>(Arrays.asList(Calendar.MONDAY, Calendar.TUESDAY, Calendar.THURSDAY, Calendar.FRIDAY,
						Calendar.SATURDAY, Calendar.SUNDAY))));
		database1.addAirline(new Airline("Moscow", "RA 43", "Boeing-737", new Time(10, 23, 45),
				new ArrayList<>(Arrays.asList(Calendar.MONDAY, Calendar.THURSDAY))));

		List<Airline> listByDestination = new ArrayList<Airline>();
		String searchedDestination = "Moscow";
		listByDestination = logic.FindByDestination(database1.getAirlineList(), searchedDestination);
		view.print("Flights to Moscow", listByDestination);

		List<Airline> listByDayOfWeek = new ArrayList<Airline>();
		listByDayOfWeek = logic.FindByDayOfWeek(database1.getAirlineList(), Calendar.MONDAY);
		view.print("Flights on Monday", listByDayOfWeek);

		List<Airline> listByTimeAndDay = new ArrayList<Airline>();
		Time searchingTime = new Time(12,0,0);
		listByTimeAndDay = logic.FindByTime(database1.getAirlineList(), searchingTime, Calendar.MONDAY);
		view.print("Flights on Monday after " + searchingTime.GetTime(), listByTimeAndDay);
	}

}
