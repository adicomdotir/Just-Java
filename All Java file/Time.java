public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() { return hour; }
	public int getMinute() { return minute; }
	public int getYear() { return second; }
	public void setHour(int hour) { this.hour = hour; }
	public void setMinute(int minute) { this.minute = minute; }
	public void setYear(int year) { this.second = second; }

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

	public Time nextSecond() {
		second++;
		return this;
	}

	public Time previousSecond() {
		second--;
		return this;
	}
}