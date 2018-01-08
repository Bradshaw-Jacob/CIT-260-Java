/*
 * This program converts pounds into kilograms
 */

import java.util.Scanner;

public class ConvertWeight {
    
    private final static double KILOGRAMS_PER_POUND = 0.453592;
    
    /**
     * The program starts in the manin function
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //print out the welcome message
        System.out.println();
        System.out.println("This program converts pounds into kilograms");
        
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
        
        //convert the weight to kilograms
        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        
        // display weight in kilograms to the console
        System.out.println("\n***********************************************" + "****************");
        
        System.out.println("\t" + name + ", The weight is " + weightInKilograms + " kilograms");
        
        System.out.println("***********************************************" + "****************\n");
            
    }
    
}