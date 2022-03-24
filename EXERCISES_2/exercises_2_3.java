/*
(Converting feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 */



import java.util.Scanner;

public class exercises_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input=new Scanner(System.in);
        
        // Reads a number in feet from the console
        System.out.println("Enter a number in feet:");
        double feet=input.nextDouble();
        
        // Convert feet into meters
        double meters=0.305 * feet;
        
        // Display results
	System.out.println(feet + " feet is "+ meters+ " meters");
        
    }
    
}
