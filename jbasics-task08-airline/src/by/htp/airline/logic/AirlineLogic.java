package by.htp.airline.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.airline.entity.Airline;
import by.htp.airline.entity.Time;

public class AirlineLogic {

	public List<Airline> FindByDestination(List<Airline> airlineList, String searchedDestination) {
		List<Airline> filteredList = new ArrayList<Airline>();

		for (Airline airline : airlineList) {
			if (airline.getDestination().equals(searchedDestination)) {
				filteredList.add(airline);
			}
		}

		return filteredList;
	}

	public List<Airline> FindByDayOfWeek(List<Airline> airlineList, int day) {
		List<Airline> filteredList = new ArrayList<Airline>();

		for (Airline airline : airlineList) {
			if (airline.getDaysOfWeak().contains(day)) {
				filteredList.add(airline);
			}
		}

		return filteredList;
	}

	public List<Airline> FindByTime(List<Airline> airlineList, Time time, int day) {
		List<Airline> filteredListByTime = new ArrayList<Airline>();
		List<Airline> filteredListByDay = new ArrayList<Airline>();
		filteredListByDay = FindByDayOfWeek(airlineList, day);

		for (Airline airline : filteredListByDay) {
			if (airline.getTime().compareTo(time) > 0) {
				filteredListByTime.add(airline);
			}
		}

		return filteredListByTime;
	}

}
