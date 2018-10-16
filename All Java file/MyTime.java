public class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public MyTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() { return hour; }
	public int getMinute() { return minute; }
	public int getSecond() { return second; }

	public void setHour(int hour) { 
		if(hour >= 0 && hour <= 12) this.hour = hour;
		else this.hour = 0;
	}
	public void setMinute(int minute) {
		if(minute >= 0 && minute <= 59) this.minute = minute;
		else this.minute = 0;
	}
	public void setSecond(int second) {
		if(second >= 0 && second <= 59) this.second = second;
		else this.second = 0;
	}

	@Override
	public String toString() {
		String h = String.format("%02d", hour);
		String m = String.format("%02d", minute);
		String s = String.format("%02d", second);
		return h + ":" + m + ":" + s;
	}

	public MyTime nextSecond() {
		setSecond(getSecond() + 1);
		return this;
	}

	public MyTime nextHour() {
		setHour(getHour() + 1);
		return this;
	}

	public MyTime nextMinute() {
		setMinute(getMinute() + 1);
		return this;
	}

	public MyTime previousSecond() {
		setSecond(getSecond() - 1);
		return this;
	}

	public MyTime previousHour() {
		setHour(getHour() - 1);
		return this;
	}

	public MyTime previousMinute() {
		setMinute(getMinute() - 1);
		return this;
	}

}