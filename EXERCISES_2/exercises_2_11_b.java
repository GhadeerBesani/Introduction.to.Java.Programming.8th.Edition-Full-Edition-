/*
(Financial application: payroll) Write a program that reads the following information and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 6.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)
Write this program in two versions: 
(a) Use dialog boxes to obtain input and display output; 
(b) Use console input and output
 */

/**
 *
 * @author Ghadeer
 */

import java.util.Scanner;

public class exercises_2_11_b {

    
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Receive employee's name
        System.out.print("Enter employee's name:");
        String employeeName = input.nextLine();
        
        // Receive Number of hours worked in a week
        System.out.print("Enter Number of hours worked in a week:");
        int numberOfHours = input.nextInt();
        
        // Receive Hourly pay rate
        System.out.print("Enter Hourly pay rate:");
        double hourlyPayRate = input.nextDouble();
        
        // Receive Federal tax withholding rate
        System.out.print("Enter Federal tax withholding rate:");
        double federalTax = input.nextDouble();
        
        // Receive State tax withholding rate
        System.out.print("Enter State tax withholding rate:");
        double stateTax = input.nextDouble();
        
        // Calvulate the Gross Pay
        double grossPay = numberOfHours * hourlyPayRate;
        
        // Calculate the Federal Withholding
        double federalWithholding = grossPay * federalTax;
        
        // Calculate the State Withholding
        double stateWithholding = grossPay * stateTax;
        
        // Calculate the Total Deduction
        double totalDeduction = federalWithholding + stateWithholding;
        
        // Calculate the Net Pay
        double netPay = grossPay - totalDeduction;
        
        // Display results
        System.out.println("Employee Name: " + employeeName + "\n" +
                "Hours Worked:  " + numberOfHours + "\n" +
                "Pay Rate: $" + hourlyPayRate + "\n" +
                "Gross Pay: $" + grossPay + "\n" +
                "Deductions: " + "\n" +
                "   Federal Withholding (20.0%):  $" + federalWithholding + "\n" +
                "   State Withholding (9.0%):  $" + stateWithholding + "\n" +
                "   Total Deduction:  $" + totalDeduction + "\n" +
                "Net Pay:  $" + netPay);
    }
    
}
