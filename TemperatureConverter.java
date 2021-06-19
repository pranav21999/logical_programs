package logical_programs;

public class TemperatureConverter 
{
	int CELSIUS_TO_FAHRENHEIT = 1;
    int FAHRENHEIT_TO_CELSIUS = 2;
    
    public void calculate()
    {
   	    System.out.println("Press 1 to convert temperature from celsius to fahrenheit  \n press 2 for vice versa  \n press 3 for quit");
	    int option = Utility.getuserInt();
	    
	    	switch(option)
	    	{
	    	case 1:
	    		System.out.println("Enter the temperature in degree celsius : ");
	            double temp1 = Utility.getuserDouble();
	            double tempInFahrenheit = (temp1 * 9 / 5) + 32;
	            System.out.println("The temperature in degree Fahrenheit is: " + tempInFahrenheit);
	    		break;
	    		
	    	case 2:
		        System.out.println("Enter the temperature in degree Fahrenheit : ");
		        double temp2 = Utility.getuserDouble();
		        double tempInCelsius = (temp2 - 32) * 5 / 9;
		        System.out.println("The temperature in degree degree is: " + tempInCelsius);
	    		break;
	    		
	    	default:
	    		System.out.println("enter correct input ");
	    		break;
	    	}
	    	
	}
    	

	public static void main(String[] args) 
	{
		TemperatureConverter tc=new TemperatureConverter();
		tc.calculate();
	}
}
