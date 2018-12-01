/**
 * Kai'lani Woodard
 * CH5PC6 - Population
 * Programming II - AP CS
 * 11-28-2018
 */

import java.util.Scanner;
public class PopulationDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create variables for user to input values
        int startSize;
        double dailyIncrease;
        int dayNumber;
        
        Scanner kb = new Scanner(System.in); //Create Scanner object
        
        System.out.println("Please enter population starting size: ");
            //Prompt user for population starting size
        startSize = kb.nextInt(); //Store input as startSize value
        
        while (startSize < 2) { //Validate startSize is greater than 2
            System.out.println("Please enter a population with a value "
                    + "greater than two!:"); //Inform user of corrections
            startSize = kb.nextInt(); //Store input as startSize value
        }
        
        System.out.println("Please enter daily increase (as a whole "
                + "number): ");
            //Prompt user for daily increase as a whole number
                //(AS IT WILL GET CONVERTED IN POPULATION CLASS
        dailyIncrease = kb.nextDouble(); //Store input in dailyIncrease
        
        while (dailyIncrease < 0) { //Validate daily increase is positive
            System.out.println("Please enter a positive value for "
                    + "the daily increase!:"); //Inform user of corrections
            dailyIncrease = kb.nextDouble(); //Store input in dailyIncrease
        }
        
        System.out.println("Please enter the number of days that "
                + "population will multiply:");
                //Prompt user for number of days population observed
        dayNumber = kb.nextInt(); //Store input as dayNumber value
        
        while (dayNumber < 1) { //Ensure observing more than one day
            System.out.println("Please enter a value great than one "
                    + "day!: "); //Inform user of corrations
            dayNumber = kb.nextInt(); //Store input in dayNumber
        }
        
        Population populationOne = new Population(startSize, dailyIncrease,
        dayNumber); //Create new Population object
        
        System.out.println(populationOne.calculateDailyIncrease());
            //Calculate daily increase within inputted values
     
        System.exit(0); //Exit
    }
    
}
