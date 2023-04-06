package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
//instances
	private int month;
    private int day;
    private int year;
    private boolean isHoliday;
    
    
    
    @Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	//constructors
    /**
     * @param initmonth
     * @param initday
     * @param inityear
     * @param isHoliday
     */
    public Date(int initmonth, int initday, int inityear, boolean isHoliday) {
    	this.month = initmonth;
    	this.day = initday;
    	this.year = inityear;
    	this.isHoliday = isHoliday;
    }
    
    public String toString() {
    	String dateString = String.format("%02d/%02d/%04d", month, day, year);
    	if (isHoliday) {
    		return dateString + " (Holiday)";
    	} else {
    		return dateString;
    	}
    }
public static void main(String[] args) {
	Date t1 = new Date(12, 30, 2004, true);
	System.out.println(t1);
	Date t2 = new Date(1, 30, 1996, true);
	System.out.println(t2);
	Date t3 = new Date(1, 30, 1996, false);
	System.out.println(t3);
	System.out.println(t3.equals(t2));
	System.out.println(t3.equals(t1));
	Date t4 = new Date(2, 30, 1996, false);
	Date t5 = new Date(5, 30, 1996, false);

	LinkedList<Date> list = new LinkedList<Date>();
	list.add(t1);
	list.add(t2);
	list.add(t3);
	list.add(t4);
	list.add(t5);
	list.add(t1);
	System.out.println(list);
	
	HashSet<Date> set = new HashSet<Date>();
	set.add(t1);
	set.add(t2);
	set.add(t1);
	System.out.println(set);
    }


}
