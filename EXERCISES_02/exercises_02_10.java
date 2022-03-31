/*
(Using the GUI input) Rewrite Listing 2.10, ComputeChange.java, using the GUI
input and output.
 */


import javax.swing.JOptionPane;

public class exercises_02_10 {


    public static void main(String[] args) {
        // Getting Input from Input Dialogs
        String input = JOptionPane.showInputDialog(null,"Enter an amount in double, for example 11.56:");
        
        // Convert String to Numbers
        double doubleAmount = Double.parseDouble(input);
        
        int remainingAmount = (int)(doubleAmount * 100);
        
        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        
        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        
        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        
        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;
        
        // Display results
        System.out.println("Your amount " + doubleAmount + " consists of \n" +
                "\t" + numberOfOneDollars + " dollars\n" +
                "\t" + numberOfQuarters + " quarters\n" +
                "\t" + numberOfDimes + " dimes\n" +
                "\t" + numberOfNickels + " nickels\n" +
                "\t" + numberOfPennies + " pennies");
    }
    
}