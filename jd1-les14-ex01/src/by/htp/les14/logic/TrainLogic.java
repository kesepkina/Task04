package by.htp.les14.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.les14.entity.Train;

public class TrainLogic {

	// to do
	public List<Train> sortByNumber(List<Train> trains) {
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);

		Train train1;
		Train train2;

		for (int i = 0; i < sortTrains.size() - 1; i++) {
			for (int j = i + 1; j < sortTrains.size(); j++) {

				train1 = sortTrains.get(i);
				train2 = sortTrains.get(j);

				if (train1.getNumber() > train2.getNumber()) {
					sortTrains.set(i, train2);
					sortTrains.set(j, train1);
				}
			}
		}

		return sortTrains;
	}

	public Train findByNumber(int findNumber, List<Train> trains) {
		Train train = null;

		for (int i = 0; i < trains.size(); i++) {
			train = trains.get(i);
			if (train.getNumber() == findNumber) {
				break;
			}
		}

		return train;
	}

	// to do
	public List<Train> sortBy(List<Train> trains) {
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);

		Train train1;
		Train train2;

		for (int i = 0; i < sortTrains.size() - 1; i++) {
			for (int j = i + 1; j < sortTrains.size(); j++) {
				train1 = sortTrains.get(i);
				train2 = sortTrains.get(j);

				if (train1.getDestinationStation().compareTo(train2.getDestinationStation()) > 0) {
					sortTrains.set(i, train2);
					sortTrains.set(j, train1);
				}
			}
		}

		int start = -1;
		int end = -1;

		for (int i = 0; i < sortTrains.size() - 1; i++) {
			train1 = sortTrains.get(i);
			train2 = sortTrains.get(i + 1);
			if (train1.getDestinationStation().equals(train2.getDestinationStation())) {
				if (start == -1) {
					start = i;
				}
				end = i + 1;
			} else if (start != -1) {
				sortPartByDate(sortTrains, start, end);
				start = -1;
			}
		}

		if (start != -1) {
			sortPartByDate(sortTrains, start, end);
		}

		return sortTrains;
	}

	private void sortPartByDate(List<Train> trains, int startIndex, int endIndex) {

		Train train1;
		Train train2;

		for (int i = startIndex; i < endIndex; i++) {
			for (int j = i + 1; j < endIndex + 1; j++) {

				train1 = trains.get(i);
				train2 = trains.get(j);

				if (train1.getCalendar().compareTo(train2.getCalendar()) > 0) {
					trains.set(i, train2);
					trains.set(j, train1);
				}
			}
		}
	}

}
