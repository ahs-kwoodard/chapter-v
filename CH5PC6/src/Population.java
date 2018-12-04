/**
 * Kai'lani Woodard
 * CH5PC6 - Population
 * Programming II - AP CS
 * 11-28-2018
 */

public class Population { //Population class
    private int startSize;
    private double percentageIncrease;
    private int dayNumber;
            
    public Population (int ss, double pi, int dn) { //Constructor
        startSize = ss;
        percentageIncrease = pi;
        dayNumber = dn;
    }
    
    
    //Mutator methods
    public void setStartOrganisms (int ss) {
        startSize = ss;
    }
    
    public void setPercentageIncrease (double pi) {
        percentageIncrease = pi;
    }
    
    public void setDayNumber (int dn) {
        dayNumber = dn;
    }
    
    //Accesor methods
    public int getStartOrganisms() {
        return startSize;
    }
    
    public double getPercentageIncrease() {
        return percentageIncrease;
    }
    
    public int getDayNumber() {
        return dayNumber;
    }
    
    //Methods to calculate daily increase
    public String calculateDailyIncrease() {
        int dailyPopulation = startSize; //Create daily population
        int dailyIncrease; //Create dailyIncrease variable
        String dailyPopOutput = ""; //Create string for output
        
        
        dailyPopOutput = "Day 1: " + dailyPopulation;
            //Automatic first line of dailyPopOutput String
        dailyIncrease = (int) (dailyPopulation*(percentageIncrease*0.01));
            //Equation for daily increase (rounded to whole)
        
        for (int i = 2; i <= dayNumber; i++) {
            //Starting at Day 2 and looping until equal to the day number
            dailyPopulation += dailyIncrease; //Add increase to total
            dailyPopOutput += "\n Day " + i + ":" + dailyPopulation;
                //String for entire day-by-day output
        }
        
        return dailyPopOutput;
    }
    
}

