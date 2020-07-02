package by.htp.les14.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Train {// Java Bean
	
	private String destinationStation;
	private int number;
	private Calendar calendar;
	
	public Train() {// без параметров
		this.destinationStation = "Minsk";
		this.number = 0;
		this.calendar = new GregorianCalendar(2020, 6, 6, 0, 0);
	}
	
	public Train(String destinationStation, int number, Calendar calendar) {// с параметрами
		this.destinationStation = destinationStation;
		this.number = number;
		this.calendar = calendar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calendar == null) ? 0 : calendar.hashCode());
		result = prime * result + ((destinationStation == null) ? 0 : destinationStation.hashCode());
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (calendar == null) {
			if (other.calendar != null)
				return false;
		} else if (!calendar.equals(other.calendar))
			return false;
		if (destinationStation == null) {
			if (other.destinationStation != null)
				return false;
		} else if (!destinationStation.equals(other.destinationStation))
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [destinationStation=" + destinationStation + ", number=" + number + ", calendar=" + calendar
				+ "]";
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
	

}
