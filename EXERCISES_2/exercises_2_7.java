/*
(Finding the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion) and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days.
 */


import java.util.Scanner;

public class exercises_2_7 {

    
    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input=new Scanner(System.in);
        
        // Read the number of minutes
        System.out.println("Enter the Minutes:");
        int minutes=input.nextInt();
        
        // Compute the number of years and days
        int years=minutes /525600;
        int days=(minutes % 525600) / 1440;
        
        // Display results
        System.out.println(minutes +" minutes is approximately "+years+" years and "+days+" days");
        
    }
    
}
