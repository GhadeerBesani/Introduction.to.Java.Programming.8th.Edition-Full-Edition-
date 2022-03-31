/*
(Converting Celsius to Fahrenheit) Write a program that reads a Celsius degree in
double from the console, then converts it to Fahrenheit and displays the result. The
double from the console, then converts it to Fahrenheit and displays the result. The
fahrenheit = (9 / 5) * celsius + 32 

 */

import java.util.Scanner;

public class exercises_02_01 {

   
    public static void main(String[] args) {
       // Create new Scanner object
       Scanner input=new Scanner(System.in);
       
       // Reads a Celsius degree in double from the console
        System.out.println("Enter degree in Celsius:");
        double Celsius=input.nextDouble();
       
       // Convert Celsius to Fahrenheit
        double Fahrenheit=( 9.0 / 5)*Celsius + 32; //9.0/5 instead of 9/5 because 9/5 yields 1 in Java
       
       // Display results
        System.out.println(Celsius +" Celsius"+ " is "+ Fahrenheit+" in Fahrenheit");
    }
    
}