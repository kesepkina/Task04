package by.htp.airline.entity;

import java.util.List;

public class Airline {

	private String destination;
	private String flightNumber;
	private String AirplaneType;
	private Time time;
	private List<Integer> daysOfWeak;

	public Airline(String destination, String flightNumber, String airplaneType, Time time, List<Integer> daysOfWeak) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		AirplaneType = airplaneType;
		this.time = time;
		this.daysOfWeak = daysOfWeak;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirplaneType() {
		return AirplaneType;
	}

	public void setAirplaneType(String airplaneType) {
		AirplaneType = airplaneType;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public List<Integer> getDaysOfWeak() {
		return daysOfWeak;
	}

	public void setDaysOfWeak(List<Integer> daysOfWeak) {
		this.daysOfWeak = daysOfWeak;
	}

	public String DaysOfWeekToString() {
		String days = "[";

		if (daysOfWeak.contains(1))
			days += "Sunday ";
		if (daysOfWeak.contains(2))
			days += "Monday ";
		if (daysOfWeak.contains(3))
			days += "Tuesday ";
		if (daysOfWeak.contains(4))
			days += "Wednesday ";
		if (daysOfWeak.contains(5))
			days += "Thursday ";
		if (daysOfWeak.contains(6))
			days += "Friday ";
		if (daysOfWeak.contains(7))
			days += "Saturday ";
		days += "]";
		return days;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", AirplaneType="
				+ AirplaneType + ", time=" + time.GetTime() + ", daysOfWeak=" + DaysOfWeekToString() + "]";
	}

}
