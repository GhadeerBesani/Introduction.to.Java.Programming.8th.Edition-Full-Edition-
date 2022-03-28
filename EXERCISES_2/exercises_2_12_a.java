/*
(Financial application: calculating interest) If you know the balance and the
annual percentage interest rate, you can compute the interest on the next monthly
payment using the following formula:
interest = balance * (1annualInterestRate / 1200)
Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month in two versions: (a) Use dialog boxes to
obtain input and display output; (b) Use console input and output. 
 */



import javax.swing.JOptionPane;

public class exercises_2_12_a {

    
    public static void main(String[] args) {
        
        // Reads the balance and the annual percentage interest rate
        String balance = JOptionPane.showInputDialog("Enter the Balance:");
        double doubleBalance = Double.parseDouble(balance);
        String interestRate = JOptionPane.showInputDialog("Enter the Interest Rate:");
        double doubleInterestRate = Double.parseDouble(interestRate);
        
        // Calculate the Interest
        double theInterest = doubleBalance * (doubleInterestRate / 1200);
        
        String output= "The interest is " + theInterest;
        
        // Displays the result
        JOptionPane.showMessageDialog(null , output);
        
    }
    
}
