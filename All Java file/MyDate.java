public class MyDate {
	private int year;
	private int month;
	private int day;
	private String[] strMonths = {
		"Jan", "Feb", "Mar",
		"Apr", "May", "Jun",
		"Jul", "Aug", "Sep",
		"Oct", "Nov", "Dec"
	};
	private String[] strDays = {
		"Sunday", "Monday", "Tuesday","Wednesday", 
		"Thursday", "Friday", "Saturday"
	};
	private int[] dayInMonths = {
		31, 28, 31, 30, 31, 30,
		31, 31, 30, 31, 30, 31
	};

	public MyDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public boolean isLeapYear(int year) {
		return year % 4 == 0;
	}

	public boolean isValidDate(int year, int month, int day) {
		return (year>=1 && year<=9999)
			&& (month>=1 && month<=12)
			&& (day>=1 && day<=31);
	}

	public int getDayOfWeek(int year, int month, int day) {
		int firstOfMonth = -1;
		if(isLeapYear(year)) {
			if(month == 0) firstOfMonth = 6;
			else if(month == 1) firstOfMonth = 2;
		} else {
			// 0	3	3	6	1	4	6	2	5	0	3	5
			switch(month) {
				case 0: firstOfMonth = 0;
				break;
				case 1: firstOfMonth = 3;
				break;
				case 2: firstOfMonth = 3;
				break;
				case 3: firstOfMonth = 6;
				break;
				case 4: firstOfMonth = 1;
				break;
				case 5: firstOfMonth = 4;
				break;
				case 6: firstOfMonth = 6;
				break;
				case 7: firstOfMonth = 2;
				break;
				case 8: firstOfMonth = 5;
				break;
				case 9: firstOfMonth = 0;
				break;
				case 10: firstOfMonth = 3;
				break;
				case 11: firstOfMonth = 5;
				break;
			}
		}
		for(int i=1; i<day; i++) {
			firstOfMonth++;
			if(firstOfMonth > 6) firstOfMonth = 0;
		}
		return firstOfMonth;
	}

	public void setDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public int getYear() { return year; }
	public int getMonth() { return month; }
	public int getDay() { return day; }
	public void setYear(int year) { this.year = year; }
	public void setMonth(int month) { this.month = month; }
	public void setDay(int day) { this.day = day; }

	@Override
	public String toString() {
		return strDays[getDayOfWeek(year, month - 1, day)] + " " + day + " " + strMonths[month - 1] + " " + year;
	}

	public MyDate nextDay() {
		setDay(day + 1);
		return this;
	}

	public MyDate nextMonth() {
		setMonth(month + 1);
		return this;
	}

	public MyDate nextYear() {
		setYear(year + 1);
		return this;
	}

	public MyDate previousDay() {
		setDay(day - 1);
		return this;
	}

	public MyDate previousMonth() {
		setMonth(month - 1);
		return this;
	}

	public MyDate previousYear() {
		setYear(year - 1);
		return this;
	}
} 