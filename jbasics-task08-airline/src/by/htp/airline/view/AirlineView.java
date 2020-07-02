package by.htp.airline.view;

import java.util.List;

import by.htp.airline.entity.Airline;

public class AirlineView {

	public void print(String message, List<Airline> list) {
		System.out.println(message);

		for (Airline airline : list) {
			if (airline == null) {
				System.out.println("null");
			} else {
				System.out.println(airline.toString());
			}
		}
		System.out.println();
	}

}
