
/* Write a program that prompts the user to enter a weight in pounds and height in inches and
display the BMI. Note that one pound is 0.45359237 kilograms and one inch is 0.0254
meters.
*/

import java.util.Scanner;

public class ComputeBMI {


    public static void main(String[] args) {
                // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // a program that prompts the user to enter a weight in pounds
        System.out.println("enter weight in pounds");
        double weightInPounds = input.nextDouble();
        // Convert pounds to kilograms
        double weightInkilograms = weightInPounds * 0.45359237;
        // a program that prompts the user to enter height in inches
        System.out.println("enter height in inches");        
        double heightInInches = input.nextDouble();
        // Convert inches to meters
        double heightInMeters = heightInInches * 0.0254;
        
        // Compute BMI
        double BMI = weightInkilograms / (heightInMeters * heightInMeters);
        
        // Display result
        System.out.println("Your BMI is " + BMI);
        if (BMI < 16)
            System.out.println("You are seriously underweight");
        else if (BMI < 18)
            System.out.println("You are underweight");
        else if (BMI < 24)
            System.out.println("You are normal weight");
        else if (BMI < 29)
            System.out.println("You are overweight"); 
        else if (BMI < 35)
            System.out.println("You are seriously overweight");
        else
            System.out.println("You are gravely overweight");
    }
    
}
