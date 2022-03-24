/*
(Computing the volume of a cylinder) Write a program that reads in the radius and
length of a cylinder and computes volume using the following formulas:
area = radius * radius * π
volume = area * length
 */


import java.util.Scanner;

public class exercises_2_2 {


    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input=new Scanner(System.in);
        
        final double PI = 3.14159265359;  // Constant value
        
        // Reads the radius and length in double from the console
        System.out.println("Enter the radius and length of a cylinder:");
        double radius=input.nextDouble();
        double length=input.nextDouble();
        
        // Comput the area and volume 
        double area = radius * radius * PI;
        double volume = area * length;
        
        // Display results
	System.out.println("The area is " + area);
	System.out.println("The volume is " + volume);
    }
    
}
