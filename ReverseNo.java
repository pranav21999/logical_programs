package logical_programs;

public class ReverseNo {
	void check()
	{
		int number,reverse=0;
        System.out.println("Enter a number");
        	number=Utility.getuserint();
        
        	while(number != 0)   
        	{  
        	int remainder = number % 10;  
        	reverse = reverse * 10 + remainder;  
        	number = number/10;  
        	}  
        	System.out.println("The reverse of the given number is: " + reverse); 
        	
	}
	
	public static void main(String arg[])	
	{
		ReverseNo no=new ReverseNo();
		no.check();
				
	}
	
}
