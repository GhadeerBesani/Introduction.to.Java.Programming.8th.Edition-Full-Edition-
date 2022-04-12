
/* a program that prompts the user to enter an integer. If the number is a multiple
of 5, print HiFive. If the number is divisible by 2, print HiEven
*/


import java.util.Scanner;


public class SimpleIfDemo {

    
    public static void main(String[] args) {
        // prompts the user to enter an integer
        System.out.println("enter an integer");
        
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Read the number
        int number = input.nextInt();
        
        // check if 5
        if (number % 5 == 0)
            System.out.println("HiFive");
        
        // check if 2
        if (number % 2 == 0)
            System.out.println("HiEven");        
    }
    
}
