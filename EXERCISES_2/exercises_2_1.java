/*
(Converting Celsius to Fahrenheit) Write a program that reads a Celsius degree in
double from the console, then converts it to Fahrenheit and displays the result. The
double from the console, then converts it to Fahrenheit and displays the result. The
fahrenheit = (9 / 5) * celsius + 32 

 */

import java.util.Scanner;

public class exercises_2_1 {

   
    public static void main(String[] args) {
        //reads a Celsius degree in double from the console
        System.out.println("Enter degree in Celsius:");
        Scanner input=new Scanner(System.in);
        double Celsius=input.nextDouble();
        double Fahrenheit=( 9.0 / 5)*Celsius + 32; //9.0/5 instead of 9/5 because 9/5 yields 1 in Java
        System.out.println(Celsius +" Celsius"+ " is "+ Fahrenheit+" in Fahrenheit");
    }
    
}
