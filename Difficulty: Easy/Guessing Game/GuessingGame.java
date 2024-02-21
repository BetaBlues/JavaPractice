/*
 * Write a program that has a user guess a secret number between 1 and 10.

 * Store the secret number in a variable called secretNumber and allow the user to continually input numbers until they correctly guess what secretNumber is.

 * Complete the method guessMyNumber that uses a while loop to ask the user for their guess and compares it againist secretNumber. 
 */

import java.util.*;

public class GuessingGame {
    static int secretNumber = 6;
    public static void main(String[] args)
    {
        // Allow the user to keep guessing numbers between
        // 1 and 10 until they guess the correct number

        // This calls the static method GuessMyNumber. Notice that the method is outside 
        // of the main method. 
        guessMyNumber();
    }

    public static void guessMyNumber() 
    {  
        Scanner input = new Scanner(System.in);

        // Finish the method according to the instructions
    }
}
