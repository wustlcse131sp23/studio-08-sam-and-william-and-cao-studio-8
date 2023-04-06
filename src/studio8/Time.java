package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean isTwelveHour;

	/**
	 * @param hour
	 * @param minute
	 * @param isTwelveHour
	 */
	public Time(int hour, int minute, boolean isTwelveHour ) {
		this.hour = hour;
		this.minute = minute;
		this.isTwelveHour = isTwelveHour;
	}

	public String toString() {

		String timeString = String.format("%02d:%02d", hour, minute);
		if (isTwelveHour == true && hour > 12) {
			timeString = String.format("%02d:%02d", hour - 12, minute);
			return timeString + " pm";
		} else if (isTwelveHour == true && hour <= 12) {
			return timeString + " am";
		} else {
			return timeString;
		}
	}
	
	
	public static void main(String[] args) {
		Time t1 = new Time(12, 30, true);
		System.out.println(t1);
		Time t2 = new Time(14, 30, true);
		System.out.println(t2);
		Time t3 = new Time(14, 30, false);
		System.out.println(t3);
		System.out.println(t3.equals(t2));
		System.out.println(t3.equals(t1));

		

	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

}