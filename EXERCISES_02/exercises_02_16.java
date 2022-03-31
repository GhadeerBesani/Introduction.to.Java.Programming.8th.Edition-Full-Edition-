/*
(Science: calculating energy) Write a program that calculates the energy needed
to heat water from an initial temperature to a final temperature. Your program
should prompt the user to enter the amount of water in kilograms and the initial
and final temperatures of the water. The formula to compute the energy is
Q = M * (final temperature – initial temperature) * 4184
where M is the weight of water in kilograms, temperatures are in degrees Celsius,
and energy Q is measured in joules
 */


import java.util.Scanner;

public class exercises_02_16 {


    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the amount of water in kilograms
	System.out.print("Enter the amount of water in kilograms: ");
	double amountOfWater = input.nextDouble();
        
        // Prompt the user to enter an initial temperature
	System.out.print("Enter an initial temperature: ");
	double initialTemperature = input.nextDouble();
        
        // Prompt the user to enter a final temperature
	System.out.print("Enter a final temperature: ");
	double finalTemperature = input.nextDouble();
        
        double energy = amountOfWater * 
                (finalTemperature - initialTemperature) * 4184;
	
        // Display result
	System.out.println("The energy needed is " + energy);
    }
    
}