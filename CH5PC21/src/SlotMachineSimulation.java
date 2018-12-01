/**
 * Kai'lani Woodard
 * CH5PC21 - Slot Machine Simulation
 * AP CS / Programming III
 * 11-30-2018
 */

//Import Scanner and Random
import java.util.Scanner;
import java.util.Random;

public class SlotMachineSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create and assign values to variables
        int money, totalEntered = 0, totalWon = 0;
        String stringNum1, stringNum2, stringNum3;
        String cherries, oranges, plums, bells, melons, bars;
        String answer = "yes";
        int num1, num2, num3;

        /*Create a while loop to loop the process once the code prompts
         the user whether on not they would like to continue
         */
        while (answer.equalsIgnoreCase("yes")) {

            //Create Scanner and Random objects
            Scanner kb = new Scanner(System.in);
            Random r = new Random();

            //Assign random number values to the three numbers
            num1 = r.nextInt(5);
            num2 = r.nextInt(5);
            num3 = r.nextInt(5);

            //Assign "picture" values for each possible value of number (0-5)
            switch (num1) {
                case 0:
                    stringNum1 = "Cherries";
                    break;
                case 1:
                    stringNum1 = "Oranges";
                    break;
                case 2:
                    stringNum1 = "Plums";
                    break;
                case 3:
                    stringNum1 = "Bells";
                    break;
                case 4:
                    stringNum1 = "Melons";
                    break;
                default:
                    stringNum1 = "Bars";
                    break;
            }

            switch (num2) {
                case 0:
                    stringNum2 = "Cherries";
                    break;
                case 1:
                    stringNum2 = "Oranges";
                    break;
                case 2:
                    stringNum2 = "Plums";
                    break;
                case 3:
                    stringNum2 = "Bells";
                    break;
                case 4:
                    stringNum2 = "Melons";
                    break;
                default:
                    stringNum2 = "Bars";
                    break;
            }

            switch (num3) {
                case 0:
                    stringNum3 = "Cherries";
                    break;
                case 1:
                    stringNum3 = "Oranges";
                    break;
                case 2:
                    stringNum3 = "Plums";
                    break;
                case 3:
                    stringNum3 = "Bells";
                    break;
                case 4:
                    stringNum3 = "Melons";
                    break;
                default:
                    stringNum3 = "Bars";
                    break;
            }

            /* Prompt user on how much money they would like to bet
             and assign their input to the money variable
             */
            System.out.print("\nHow much money would you like to bet?: $");
            money = kb.nextInt();
            totalEntered += money;

            /*Print three random pictures to the console as if it is functioning
             as a slot machine
             */
            System.out.println("\n" + stringNum1 + " " + stringNum2 + " "
                    + stringNum3);

            //Create if statements for all possible winning scenarios
            if (num1 == num2 && num2 == num3) {
                System.out.println("Congratulations! You win $" + money * 3
                        + "!");
                totalWon += money * 3;
            } else if (num1 == num2 || num2 == num3) {
                System.out.println("Congratulations! You win $" + money * 2
                        + "!");
                totalWon += money * 2;
            } else {
                System.out.println("You win $0!");
            }

            /*Prompt user whether they would like to play again and store
             the input in the answer variable
             */
            System.out.println("Would you like to play again?");
            answer = kb.next();

            //Create different while loops for if the input is not "yes"
            while (!answer.equalsIgnoreCase("no")
                    && !answer.equalsIgnoreCase("yes")) {
                System.out.println("\nInput invalid!");
                System.out.println("Would you like to play again?");
                answer = kb.next();
            }

            while (answer.equalsIgnoreCase("no")) {
                System.out.println("\nYou entered $" + totalEntered
                        + "!");
                System.out.println("You won $" + totalWon + "!");
                System.exit(0);
                while (totalWon > totalEntered) {
                    System.out.println("You profited $" 
                            + (totalWon-totalEntered) + "!");
                }
                
                System.exit(0); //Exit
            }

        }

    }
}
