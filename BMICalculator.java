/*
 * This program calculates the BMI of an individual
 */

import java.util.Scanner;

public class BMICalculator {
    
    private final static double KILOGRAMS_PER_POUND = 0.453592;
    private final static double METERS_PER_CENTIMETER = 0.01;
    
    /**
     * The program starts in the manin function
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //print out the welcome message
        System.out.println();
        System.out.println("This program calculates your BMI");
        
        //Prompt to enter the users name
        System.out.println("\nPlease enter name:");
        
        //create an input file for the console
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        //read the value of the next line typed in the console
        String name = inFile.nextLine();
        
        // prompt to enter the weight in pounds
        System.out.println("\nEnter the weight in pounds");
        
        // get the value entered for the weight
        double weightInPounds = inFile.nextDouble();
        
        // prompt to enter the height in centimeters
        System.out.println("\nEnter your Height in Centimeters");
        
        // get the value entered for the height
        double heightInCentimeters = inFile.nextDouble();
        
        //convert the weight to kilograms
        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        
        // convert the height into meters
        double heightInMeters = heightInCentimeters * METERS_PER_CENTIMETER;
        
        // calculate the BMI
        double bmiCalculation = weightInKilograms / Math.pow(heightInMeters,2);
        
        // round the bmiCalculation
        double bmiRounded = Math.round(bmiCalculation * 100) / 100;
        
        // display weight in kilograms to the console
        System.out.println("\n***********************************************" + "****************");
        
        System.out.println("\t" + name + ", Your BMI Score is " + bmiRounded);
        
        System.out.println("***********************************************" + "****************\n");
            
    }
    
}