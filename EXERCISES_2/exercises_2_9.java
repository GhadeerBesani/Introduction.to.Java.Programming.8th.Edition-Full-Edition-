
/*
(Financial application: monetary units) Rewrite Listing 2.10, Compute-Change.java, to fix the possible loss of accuracy when converting a double value
to an int value. Enter the input as an integer whose last two digits represent the
cents. For example, the input 1156 represents 11 dollars and 56 cents.
 */

import java.util.Scanner;

public class exercises_2_9 {


    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Receive the amount
        System.out.print("Enter  an integer amount: ");
        int amount = input.nextInt();
        
        // Find the number of one dollars
        int numberOfOneDollars = amount / 100;
        
        // Find the number of one cents
        int numberOfOnecents = amount % 100;
        
        // Display results
        System.out.println("the input " + amount + " represents "
                + numberOfOneDollars + " dollars and "
                + numberOfOnecents + " cents");
    }
    
}
