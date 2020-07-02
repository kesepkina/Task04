package by.htp.task06.main;

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

	public void GetTime() {
		System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
	}

	public void Increase(int hours, int minutes, int seconds) {
		this.seconds += seconds;
		if (this.seconds > 59) {
			minutes += this.seconds / 60;
			this.seconds %= 60;
		}
		this.minutes += minutes;
		if (this.minutes > 59) {
			hours += this.minutes / 60;
			this.minutes %= 60;
		}
		this.hours += hours;
		if (this.hours > 23) {
			this.hours %= 24;
		}
	}

	public void Decrease(int hours, int minutes, int seconds) {
		this.seconds -= seconds;
		if (this.seconds < 0) {
			minutes += this.seconds / 60 + 1;
			this.seconds = 60 + this.seconds % 60;
			if (this.seconds == 60) {
				this.seconds = 0;
			}
		}
		this.minutes -= minutes;
		if (this.minutes < 0) {
			hours += this.minutes / 60 + 1;
			this.minutes = 60 + this.minutes % 60;
			if (this.minutes == 60) {
				this.minutes = 0;
			}
		}
		this.hours -= hours;
		if (this.hours < 0) {
			this.hours = 24 + this.hours % 24;
			if (this.hours == 24) {
				this.hours = 0;
			}
		}
	}
}
