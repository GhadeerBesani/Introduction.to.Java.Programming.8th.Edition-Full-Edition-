/*
 Listing 2.4 gives a program that obtains minutes and remaining seconds from an amount of
time in seconds. For example, 500 seconds contains 8 minutes and 20 seconds.
 */

import java.util.Scanner;
public class DisplayTime {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();
        
        int minutes = seconds / 60;  // Find minutes in seconds
        int remainingSeconds =seconds % 60;  // Seconds remaining
        System.out.println(seconds + " seconds is " + minutes +
                " minutes and " + remainingSeconds + " seconds");
    }
    
}
