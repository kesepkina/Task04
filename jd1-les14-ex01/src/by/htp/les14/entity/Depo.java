package by.htp.les14.entity;

import java.util.ArrayList;
import java.util.List;

public class Depo {

	private List<Train> trains;


	public Depo() {
		trains = new ArrayList<Train>();// Train[] mas = new Train[5]
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void addTrain(Train train) {
		trains.add(train);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trains == null) ? 0 : trains.hashCode());
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
		Depo other = (Depo) obj;
		if (trains == null) {
			if (other.trains != null)
				return false;
		} else if (!trains.equals(other.trains))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Depo [trains=" + trains + "]";
	}

}
