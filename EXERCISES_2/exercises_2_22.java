/*
(Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area. The formula for computing the area of a
hexagon is Area =(3√3 / 2)s²
 */


import java.util.Scanner;

public class exercises_2_22 {


    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompts the user to enter the side of a hexagon
        System.out.println("Enter the side: ");
        double hexagonSide = input.nextDouble();
        
        // Calculate the area of the hexagon
        double area = 3 * Math.pow(3, 0.5) / 2 * Math.pow(hexagonSide, 2);
        
        // Displays the result
        System.out.println("The area of the hexagon is " + area);
        
        
    }
    
}
