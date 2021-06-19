package logical_programs;


public class NewtonsSquareRoot {
    public static void main(String[] args) {
        System.out.print("Enter a num : ");
        int c = Utility.getuserInt();        // 'c' stores input number
        final double epsilon = 1E-15;
        double t = c;

        while (Math.abs(t-c/t) > epsilon * t) {
            double lastT = t;       
            t =  ((c/t + t)/2.0);        
            if ( lastT == t) {              
                break;                      
            }
        }
        System.out.println("Square root of " + c + " : " + t);
    }
}