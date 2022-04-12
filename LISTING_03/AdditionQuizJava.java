
// develop a program to let a first-grader practice addition


import java.util.Scanner;

public class AdditionQuizJava {

   
    public static void main(String[] args) {
        // generate number1
        int number1 = (int)(System.currentTimeMillis() % 10);
        
        // generate number2
        int number2 = (int)(System.currentTimeMillis() * 7 % 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // show question
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        
        // Read the answer
        int answer = input.nextInt();
        
        // display the result
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " +
                (number1 + number2 == answer)); // condition check
    }
    
}
