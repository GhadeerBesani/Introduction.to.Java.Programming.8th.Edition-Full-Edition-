/*
(Finding the character of an ASCII code) Write a program that receives an ASCII
code (an integer between 0 and 128) and displays its character. For example, if the
user enters 97, the program displays character a
 */



import java.util.Scanner;

public class exercises_2_8 {


    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the ASCII code:");
        int asciiCode = input.nextInt();
        
        // Creating a new variable of type int and assigning the character value.
        char character = (char)asciiCode;
        
        // Display results
        System.out.println("The character for ASCII code " + asciiCode + " is " + character);
    }
    
}
