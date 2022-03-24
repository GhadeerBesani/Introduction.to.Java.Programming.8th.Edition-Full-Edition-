/*
(Converting pounds into kilograms) Write a program that converts pounds into
kilograms. The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms.
 */



import java.util.Scanner;

public class exercises_2_4 {

   
    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input=new Scanner(System.in);
        
        // Prompts the user to enter a number in pounds
        System.out.println("Enter a number in pounds:");
        double pounds=input.nextDouble();
        
        // Convert pounds into kilograms
        double kilograms=0.454 * pounds;
        
        // Display results
	System.out.println(pounds + " pounds is "+ kilograms+ " kilograms");
    }
    
}
