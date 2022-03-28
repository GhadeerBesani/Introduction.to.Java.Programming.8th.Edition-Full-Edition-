/*
(Random character) Write a program that displays a random uppercase letter
using the System.CurrentTimeMillis() method.
 */


public class exercises_2_19 {


    public static void main(String[] args) {
        // A seed random value that is based on the current time
        long randomMillisecond = System.currentTimeMillis();
        
        
        // The English Alphabet consists of 26 letters
        // We convert the random Millisecond to number between 1 and 26
        int randomletter = (int)(randomMillisecond % 26);
        
        // Upper Case ASCII start from 65, so we add 65
        int randomASCIIUpperCase = randomletter + 65;
        
        // conver the randomASCIIUpperCase to letter
        char letter = (char)randomASCIIUpperCase;
        
        // Displays result
        System.out.println(letter);

    }
    
}
