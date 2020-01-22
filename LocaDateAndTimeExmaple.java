import java.io.*;
import java.time.*;

class LocaDateAndTimeExmaple
{
	public static void main(String args[])
	{
		LocalDate d=LocalDate.now();
		System.out.println("Now Date is :"+d);
		
		System.out.println("Month Day :"+d.getMonthValue());
		System.out.println("Year day :"+d.getDayOfYear());
		
		LocalTime t=LocalTime.now();
		System.out.println("Now Time is :"+t);
	}
}