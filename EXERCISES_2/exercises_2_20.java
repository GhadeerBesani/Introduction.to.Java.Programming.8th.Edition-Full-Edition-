/*
(Geometry: distance of two points) Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distances. The formula for
computing the distance is √(x2 - x1)²+ (y2 - y1)². Note you can use the 
Math.pow(a, 0.5) to compute √a.
 */

import java.util.Scanner;

public class exercises_2_20 {


    public static void main(String[] args) {
        // 
        Scanner input = new Scanner(System.in);
        
        // Prompts the user to enter x1 and y1
        System.out.println("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        // Prompts the user to enter x2 and y2
        System.out.println("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        // Calculate the distance
        double distance = Math.pow((Math.pow(x2 - x1,2)+
                Math.pow(y2 - y1, 2)),0.5);
        
        // Displays the result
        System.out.println("The distance of the two points is " + distance);
    }
    
}
