/*
(Geometry: area of a triangle) Write a program that prompts the user to enter
three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area. The
formula for computing the area of a triangle is
s = (side1 + side2 + side3)/2;
area =√s(s-sidel)(s-side2)(s-side3)
 */

import java.util.Scanner;

public class exercises_2_21 {


    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompts the user to enter points (x1, y1)
        System.out.println("Enter points x1, y1 for a triangle");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        // Prompts the user to enter points (x2, y2)
        System.out.println("Enter points x2, y2 for a triangle");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();       
        
        // Prompts the user to enter points (x3, y3)
        System.out.println("Enter points x3, y3 for a triangle");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();          
        
        // Calculate the Sides
        double side1 = Math.pow((Math.pow(x2 - x1,2)+
                Math.pow(y2 - y1, 2)),0.5);
        double side2 = Math.pow((Math.pow(x3 - x1,2)+
                Math.pow(y3 - y1, 2)),0.5);
        double side3 = Math.pow((Math.pow(x2 - x3,2)+
                Math.pow(y2 - y3, 2)),0.5);
        
        // Calculate s
        double s = (side1 + side2 + side3) / 2;
        
        // Calculate the area
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3),0.5);
        System.out.println("The area of the triangle is " + area);
        
        
    }
    
}
