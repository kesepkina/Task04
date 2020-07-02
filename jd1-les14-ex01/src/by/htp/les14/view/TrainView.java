package by.htp.les14.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import by.htp.les14.entity.Train;

public class TrainView {

	public void print(String message, List<Train> trains) {
		System.out.println(message);

		for (Train train : trains) {
			if (train == null) {
				System.out.println("null");
			}
			print(train);
		}
		System.out.println();
	}

	public void print(Train train) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm");
		Calendar cal = train.getCalendar();
		System.out.println("Destination: " + train.getDestinationStation() + "; Number: " + train.getNumber()
				+ "; Departure: " + sdf.format(cal.getTime()));

	}

}
