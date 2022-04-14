
/*a program for a first-grader to practice subtraction. The program
randomly generates two single-digit integers, number1 and number2, with number1 > =
number2 and displays to the student a question such as “What is 9-2? ” After the student
enters the answer, the program displays a message indicating whether it is correct.
*/

import java.util.Scanner;

public class SubtractionQuiz {

    
    
    public static void main(String[] args) {
        // Generate two single-digit integers into number1 and number2
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        
        // If number1 < number2, swap number1 with number2
        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        // Prompt the student to answer "What is number1 – number2?"
        System.out.println("What is " + number1 + " - " + number2 + "? ");
        
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // get answer
        int answer = input.nextInt();
        
        // Grade the answer and display the result
        if (number1 - number2 == answer)
        System.out.println("You are correct!");
        else
        System.out.println("Your answer is wrong\n" + number1 + " - "
        + number2 + " should be " + (number1 - number2));
    }
    
}
