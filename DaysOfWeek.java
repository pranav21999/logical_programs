package logical_programs;

	//import java.util.Scanner;

public class DaysOfWeek 
{
	
	    public static void weekDayCalculator(int d, int m, int y) 
	    {

	        int y0 = y - (14 - m) / 12;
	        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + 31 * m0 / 12) % 7;

	        System.out.println("The week of the day is: ");
	        switch (d0) 
	        {

	            case 0 -> System.out.println("SUNDAY");
	            case 1 -> System.out.println("MONDAY");
	            case 2 -> System.out.println("TUESDAY");
	            case 3 -> System.out.println("WEDNESDAY");
	            case 4 -> System.out.println("THURSDAY");
	            case 5 -> System.out.println("FRIDAY");
	            case 6 -> System.out.println("SATURDAY");
	            default -> throw new IllegalStateException("Unexpected value: " + d0);

	        }

 }
	    public static void main(String[] args) 
	    {
	      //  COMMAND LINE ARGUMENTS
	        int d =Integer.parseInt(args[0]);
	        int m = Integer.parseInt(args[1]);
	        int y = Integer.parseInt(args[2]);
	        

	        System.out.println("Enter the date :");

	        System.out.println("Enter the month : ");

	        System.out.println("Enter the year : ");

	        weekDayCalculator(d, m, y);

	    }

	}
	