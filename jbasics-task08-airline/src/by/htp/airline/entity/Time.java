package by.htp.airline.entity;

import java.util.Formatter;

public class Time {

	private int hours;
	private int minutes;
	private int seconds;

	public Time() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public Time(int hours, int minutes, int seconds) {
		this.setHours(hours);
		this.setMinutes(minutes);
		this.setSeconds(seconds);
	}

	public int compareTo(Time time) {
		if (hours > time.getHours()) {
			return 1;
		} else if (hours == time.getHours()) {
			if (minutes > time.getMinutes()) {
				return 1;
			} else if (minutes == time.getMinutes()) {
				if (seconds > time.getSeconds()) {
					return 1;
				} else if (seconds == time.getSeconds()) {
					return 0;
				}
			}
		}
		return -1;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours > -1 && hours < 24) {
			this.hours = hours;
		} else {
			this.hours = 0;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes > -1 && minutes < 60) {
			this.minutes = minutes;
		} else {
			this.minutes = 0;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds > -1 && seconds < 60) {
			this.seconds = seconds;
		} else {
			this.seconds = 0;
		}
	}

	public Formatter GetTime() {
		Formatter f = new Formatter();
		f.format("%02d:%02d:%02d", hours, minutes, seconds);
		return f;
	}
}
