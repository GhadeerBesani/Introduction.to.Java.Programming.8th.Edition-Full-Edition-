/*
Listing 2.5 gives a program that converts a Fahrenheit degree to Celsius using the formula
 */


import java.util.Scanner;
public class FahrenheitToCelsius {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " +
                celsius + " in Celsius");
    }
    
}
