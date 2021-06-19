package logical_programs;

public class DesimalToBinary {

    //main method
    public static void main(String[] args) {

        System.out.println("Enter the decimal number : ");
        int number = Utility.getuserInt();

        System.out.println("The number " + number + " in binary form is : ");
        decimalToBinaryConverter(number);

    }

    //calculates a binary value of the decimal number given as input
    public static void decimalToBinaryConverter(int n) {

        StringBuffer sb = new StringBuffer();

        while (n != 0) {

            int remainder = n % 2;
            n = n / 2;
            sb.append(remainder);

        }

        System.out.println(sb.reverse());

    }
}