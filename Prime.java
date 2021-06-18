package logical_programs;

public class Prime 
{
	int num,i,flag;
	void check()
	{
        System.out.println("Enter a number");
    	num=Utility.getuserint();
    	for(i=2;i<num/2;i++)
    	{
    		if(num % i==0)
    		{
    			flag=1;
    		}
    			
    	}
    	if(flag==1)
    	{
    		System.out.println("no is not prime");
    	}
    	else
    	{
    		System.out.println("no is  prime");
        	
    		
    	}
    }

	public static void main(String[] args) {
	Prime p=new Prime();
	p.check();

	}

}
