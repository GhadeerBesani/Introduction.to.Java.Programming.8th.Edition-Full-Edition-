/*
(Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and display the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 */


import java.util.Scanner;

public class exercises_2_14 {


    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompts the user to enter a weight in pounds
        System.out.println("Enter a weight in pounds");
        double weightInPounds = input.nextDouble();
        double weightInKilograms = weightInPounds * 0.45359237;

        // Prompts the user to enter height in inches
        System.out.println("Enter height in inches");
        double heightInInches = input.nextDouble();
        double heightInMeters = heightInInches * 0.0254;
        
        // Calculate the BMI
        double bmi = weightInKilograms / Math.pow(heightInMeters,2);
        
        // Display results
        System.out.println("BMI is "+ bmi);
        
    }
    
}
