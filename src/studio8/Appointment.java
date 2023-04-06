package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	private final Date date;
	private final Time time;
	
    public Appointment(Date date, Time time) {
    	this.date = date;
    	this.time = time;
    }
    
    public Date getDate() {
    	return this.date;
    }
    
    public Time getTime() {
    	return this.time;
    }

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	@Override
	public String toString() {
		return "Appointment: [" + date + ", " + time + "]";
	}

	public static void main(String args[]) {
		Time t1 = new Time(12, 30, true);
		Time t2 = new Time(14, 30, true);
		Time t3 = new Time(14, 30, false);
		Date d1 = new Date(12, 30, 2004, true);
		Date d2 = new Date(1, 30, 1996, true);
		Date d3 = new Date(1, 30, 1996, false);
		Appointment a1 = new Appointment(d1, t1);
		Appointment a2 = new Appointment(d2, t1);
		Appointment a3 = new Appointment(d1, t3);



		System.out.println(a1);
		HashSet<Appointment> Calendar = new HashSet<Appointment>();
		Calendar.add(a1);
		Calendar.add(a2);
		Calendar.add(a1);
		Calendar.add(a3);

		System.out.println(Calendar);
	}
}

