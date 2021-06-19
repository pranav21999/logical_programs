package logical_programs;

public class VendingMachine {

    //array of different notes available in Vending Machine
   static int[] notes = new int[]{1000, 500, 100, 50, 10, 5, 2, 1};
    static int i;

    //for counting the notes
    static int[] notesCounter = new int[8];
    static int totalNotes = 0;

    //main method
    public static void main(String[] args) {
        System.out.println("Enter the amount : ");
       
        int amount = Utility.getuserInt();
        moneyCalculator(amount);
    }

    //Calculates minimum number of notes
    public static void moneyCalculator(int amount) {

        for (i = 0; i < notes.length; i++) {

            if (amount >= notes[i]) {

                //Counting the currency count
                notesCounter[i] = amount / notes[i];//---->Amount=5521 /notes[0]=1000 = 5
                amount %= notes[i];                 //----> 5521 % 1000 --> 521---> amount = 521
                totalNotes += notesCounter[i];      // ---->total notes = 5;
                moneyCalculator(amount);            // ----> recursive calling the function and loops runs
                return;

            }

            if (amount == 0)
                break;

        }

        System.out.println("The minimum number of notes required to give the amount is : " + totalNotes);
        System.out.println("Currency Count is : ");

        for (i = 0; i < notesCounter.length; i++) {

            if (notesCounter[i] != 0)
                System.out.println(notes[i] + " : " + notesCounter[i]);

        }

    }
}