/*
(Financial application: calculating the future investment value) Write a program
that reads in investment amount, annual interest rate, and number of years, and
displays the future investment value.
 */

import java.util.Scanner;

public class exercises_2_13 {


    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input = new Scanner(System.in);
        
        // Read the investment amount
        System.out.println("Enter investment amount:");
        double investment = input.nextDouble();
        
        // Read the annual interest rate
        System.out.println("Enter annual interest rate in percentage:");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate = monthlyInterestRate / 1200;
        
        // Read number of years
        System.out.println("Enter number of years:");
        int numberOfYears = input.nextInt();
        
        // Calculate the future investment value
        double futureInvestmentValue = 
                investment * Math.pow(1 + monthlyInterestRate,numberOfYears * 12);
        
        // Display results
        System.out.println("Accumulated value is "+ futureInvestmentValue);
    }
    
}
