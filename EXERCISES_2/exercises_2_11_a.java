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

import javax.swing.JOptionPane;


public class exercises_2_11_a {

    
    public static void main(String[] args) {
        
        // Receive employee's name
        String employeeName = JOptionPane.showInputDialog(null,"Enter employee's name:");
        
        // Receive Number of hours worked in a week
        String numberOfHours = JOptionPane.showInputDialog(null,"Enter Number of hours worked in a week:");
        int intNumberOfHours = Integer.parseInt(numberOfHours);
        
        // Receive Hourly pay rate
        String hourlyPayRate = JOptionPane.showInputDialog(null,"Enter Hourly pay rate:");
        double doubleHourlyPayRate = Double.parseDouble(hourlyPayRate);
        
        // Receive Federal tax withholding rate
        String federalTax = JOptionPane.showInputDialog(null,"Enter Federal tax withholding rate:");
        double doubleFederalTax = Double.parseDouble(federalTax);
        
        // Receive State tax withholding rate
        String stateTax = JOptionPane.showInputDialog(null,"Enter State tax withholding rate:");
        double doubleStateTax = Double.parseDouble(stateTax);
                
        // Calvulate the Gross Pay
        double grossPay = intNumberOfHours * doubleHourlyPayRate;
        
        // Calculate the Federal Withholding
        double federalWithholding = grossPay * doubleFederalTax;
        
        // Calculate the State Withholding
        double stateWithholding = grossPay * doubleStateTax;
        
        // Calculate the Total Deduction
        double totalDeduction = federalWithholding + stateWithholding;
        
        // Calculate the Net Pay
        double netPay = grossPay - totalDeduction;
        
        // Display results
        String output = "Employee Name: " + employeeName + "\n" +
                "Hours Worked:  " + numberOfHours + "\n" +
                "Pay Rate: $" + hourlyPayRate + "\n" +
                "Gross Pay: $" + grossPay + "\n" +
                "Deductions: " + "\n" +
                "   Federal Withholding (20.0%):  $" + federalWithholding + "\n" +
                "   State Withholding (9.0%):  $" + stateWithholding + "\n" +
                "   Total Deduction:  $" + totalDeduction + "\n" +
                "Net Pay:  $" + netPay;
        JOptionPane.showMessageDialog(null,output );
    }
    
}
