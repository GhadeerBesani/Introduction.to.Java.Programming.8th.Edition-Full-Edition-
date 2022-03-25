/*
(Summing the digits in an integer) Write a program that reads an integer between
0 and 1000 and adds all the digits in the integer. For example, if an integer is 932,
the sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 */


import java.util.Scanner;

public class exercises_2_6 {


    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input=new Scanner(System.in);
        
        // Read the number
        System.out.println("Enter number between 1 and 1000:");
        
        int number=input.nextInt();
        
        int digitOnes=number%10;   // Extract Ones digit
        number=number/10;          // Remove the extracted digit
        
        int digitTens=number%10;   // Extract Tens digit
        number=number/10;          // Remove the extracted digit
        
        int digitHundred=number%10;   // Extract Hundred digit
        
        int sum=digitOnes+digitTens+digitHundred;  // Sum the digits in an integer
        
        // Display results
        System.out.println("The sum of the digits is "+sum);

    }
    
}
