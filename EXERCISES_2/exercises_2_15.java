/*
(Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. So, the monthly interest
rate is 0.05 / 12 = 0.00417. After the first month, the value in the account
becomes 100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
 */

import java.util.Scanner;

public class exercises_2_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input = new Scanner(System.in);
        
        // Initialize constant value
        final double MonthlyInterestRate = 0.00417;

        
	// Prompt the user to enter a montly saving amount
	System.out.print("Enter the monthly saving amount: ");
	double savingAmount = input.nextDouble();
        
	// Compute first month account value
	double total = savingAmount * (1 + MonthlyInterestRate);
        
	// Compute second month account value
	total = (savingAmount + total) * (1 + MonthlyInterestRate);
        
	// Compute third month account value
	total = (savingAmount + total) * (1 + MonthlyInterestRate);
        
	// Compute forth month account value
	total = (savingAmount + total) * (1 + MonthlyInterestRate);
        
	// Compute fifth month account value
	total = (savingAmount + total) * (1 + MonthlyInterestRate);
        
	// Compute sixth month account value
	total = (savingAmount + total) * (1 + MonthlyInterestRate);

	// Display result
	System.out.println("After the sixth month, the account value is " + total);
    }
    
}
