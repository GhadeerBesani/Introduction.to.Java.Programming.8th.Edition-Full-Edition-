/*
(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
length = (v^2)/(2*a)
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s^2) and displays the minimum runway
length.
 */


import java.util.Scanner;

public class exercises_2_24 {

    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompts the user to enter v in meters/second (m/s)
        System.out.println("Enter v in meters/second (m/s):");
        double v = input.nextDouble();
        
        // Prompts the user to enter acceleration a in meters/second squared (m/s^2)
        System.out.println("Enter acceleration a in meters/second squared (m/s^2):");
        double a = input.nextDouble();        
        
        // Calculate the runway length
        double length = Math.pow(v, 2) / (2 * a);
        
        // Display the result
        System.out.println("The minimum runway length for this airplane is " + length);
    }
    
}
