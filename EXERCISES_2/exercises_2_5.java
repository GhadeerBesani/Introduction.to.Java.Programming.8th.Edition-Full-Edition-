/*
(Financial application: calculating tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total.
For example, if the user enters 10 for subtotal and 15% for gratuity rate,
the program displays $1.5 as gratuity and $11.5 as total.
 */



import java.util.Scanner;

public class exercises_2_5 {


    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input=new Scanner(System.in);
        
        // Read the subtotal and the gratuity rate
        System.out.println("Enter the subtotal and the gratuity rate:");
        double subtotal=input.nextDouble();
        double gratuityRate=input.nextDouble();
        
        // Computes the gratuity and total
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

	// Display results
	System.out.println("The gratuity is " + gratuity +
                " and total is " + total);
    }
    
}
