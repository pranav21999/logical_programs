package logical_programs;
public class FibonacciSeries 
{
	public  void printfibonacci() 
	{
        int a = 0, b = 1;
        int range;
        System.out.println("enter the range");
        //Scanner s = new Scanner(System.in);
       range = Utility.getuserint();
     
       System.out.print("\t"+a);
        if (range == 0)
            System.out.println(a);

        int i = 2;
        while (i <= range)
        {

            int c = a + b;
            a = b;
            b = c;
            System.out.print("\t"+b);
            i++;
            
       
        
        }
	}

	
	public static void main(String[] args) 
	{
		FibonacciSeries pf=new FibonacciSeries();
		pf.printfibonacci();


	}

}