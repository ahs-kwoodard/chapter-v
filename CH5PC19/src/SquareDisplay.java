
/**
 * Kai'lani Woodard
 * CH5PC19 - Square Display
 * Programming II - AP CS
 * 11-30-2018
 */
import java.util.Scanner;

public class SquareDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int xAmount; //Create variable for input

        Scanner kb = new Scanner(System.in); //Create scanner object

        System.out.print("Please enter a positive integer no greater than "
                + "15!: "); //Prompt user to input value
        xAmount = kb.nextInt();

        while (true) {
            if (xAmount > 15) { //Ensure input is less than 15
                System.out.println("Excuse me...");
                System.out.println("Please make the integer no greater than "
                        + "15!");
                xAmount = kb.nextInt();
            } else if (xAmount < 0) { //Ensure input is great than 0
                System.out.println("Excuse me...");
                System.out.println("You can't create negative 'X's. Please "
                        + "input a positive integer no greater than 15!");
                xAmount = kb.nextInt();
            } else { //Break loop if both conditions are satisfied
                break;
            }
        }

        for (int i = 0; i < xAmount; i++) {  //Loop "xAmount" times
            System.out.println("\r"); //Print "xAmount" of lines
            for (int x = 0; x < xAmount; x++) { //Loop "xAmount" times
                System.out.print("X"); //Print "xAmount" of 'X's
            } 
        }
        
        System.out.println(""); //Break at the end (I got complaints)
        System.exit(0); //Exit
        
    }
    
}
