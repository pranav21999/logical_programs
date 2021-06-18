package logical_programs;
class PerfectNo
{
	void check()
	{
		int n,sum=0;
        System.out.println("Enter a number");
        	n=Utility.getuserint();
        	int i=1;
	    while(i<=n/2)
	    {
	       if(n%i==0)
	       {
	    	   sum+=i;
	       }
	      i++;
	    }
	    if(sum==n)
	    {
		
		System.out.println(n+" is a perfect number");
	    } 
	      else
	    System.out.println(n+" is not a  perfect number"); 
	}
		
	
	public static void main(String arg[])	
	{
		PerfectNo no=new PerfectNo();
		no.check();
				
	}
	    
}
