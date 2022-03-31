/*
(Science: wind-chill temperature) How cold is it outside? The temperature alone
is not enough to provide the answer. Other factors including wind speed, relative
humidity, and sunshine play important roles in determining coldness outside. In
2001, the National Weather Service (NWS) implemented the new wind-chill
temperature to measure the coldness using temperature and wind speed. 
 */


import java.util.Scanner;


public class exercises_02_17 {


    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompts the user to enter a temperature between -58F and 41F
        System.out.println("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();
        
        // Prompts the user to enter a wind speed greater than or equal to 2
        System.out.println("Enter the wind speed miles per hour: ");
        double windSpeed = input.nextDouble();   
        
        
        double windChillTemperature = 35.74 + (0.6215 * temperature) -
                35.75 * Math.pow(windSpeed,0.16) + 
                0.4275 * temperature * Math.pow(windSpeed, 0.16);
        
        // Displays the wind-chill temperature
        System.out.println("The wind chill index is " + windChillTemperature);
    }
    
}