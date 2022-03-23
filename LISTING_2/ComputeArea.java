/*
computing the area of a circle
1. Read in the radius.
2. Compute the area using the following formula:
area = radius * radius * pi
3. Display the area
 */


public class ComputeArea {

 
    public static void main(String[] args) {
        double radius; // Declare radius
        double area; // Declare area

        // Assign a radius
        radius = 20; // New value is radius
        
        // Compute area
        area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
    
}
