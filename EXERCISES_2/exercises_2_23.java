/*
(Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as shown in the following formula:
a = (v1 - v0)/t
Write a program that prompts the user to enter the starting velocity v0 in
meters/second, the ending velocity v1 in meters/second, and the time span t in seconds,
and displays the average acceleration.
 */


import java.util.Scanner;

public class exercises_2_23 {

   
    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompts the user to enter the starting velocity v0
        System.out.println("Enter the starting velocity v0 in meters/second: ");
        double v0 = input.nextDouble();
        
        // Prompts the user to enter the ending velocity v1
        System.out.println("Enter the ending velocity v1 in meters/second: ");
        double v1 = input.nextDouble(); 
        
        // Prompts the user to enter the time span t in seconds
        System.out.println("Enter the time span in seconds: ");
        double t = input.nextDouble();
        
        // Calculate the average acceleration
        double a = (v1 - v0) / t;
        
        // Display the result
        System.out.println("The average acceleration is " + a);
        
    }
    
}
