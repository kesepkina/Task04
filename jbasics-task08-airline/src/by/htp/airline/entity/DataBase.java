package by.htp.airline.entity;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	
	List<Airline> airlineList;
	
	public DataBase() {
		airlineList = new ArrayList<Airline>();
	}
	
	public List<Airline> getAirlineList(){
		return airlineList;
	}
	
	public void addAirline(Airline airline) {
		airlineList.add(airline);
	}

}
