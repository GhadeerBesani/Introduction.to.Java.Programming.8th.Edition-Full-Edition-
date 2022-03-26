/*
(Financial application: calculating interest) If you know the balance and the
annual percentage interest rate, you can compute the interest on the next monthly
payment using the following formula:
interest = balance * (1annualInterestRate / 1200)
Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month in two versions: (a) Use dialog boxes to
obtain input and display output; (b) Use console input and output. 
 */

/**
 *
 * @author Ghadeer
 */

import java.util.Scanner;

public class exercises_2_12_b {

    
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Reads the balance and the annual percentage interest rate
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%):");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();
        
        // Calculate the Interest
        double theInterest = balance * (interestRate / 1200);
        
        // Displays the result
        System.out.println("The interest is " + theInterest);
    }
    
}
