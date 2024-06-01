import java.util.Random;

import javax.swing.JOptionPane;

public class GuessingGameVersion2 {
    public static void main(String[] args)
    {
        System.out.println("********************************NUMBER GUESSING GAME********************************");

        // creating a random object
        Random random = new Random();
        // generating a random number from 1 to 100
        int randomNumber = random.nextInt(100) + 1;

        // maximum number of attempts the user can take on this game
        int maxAttempts = 20;
         // a variable to count the number of attempts the user took
        int countAttempts = 0;

        // creating a dialogue box prompting the user the user to enter the guess number
        String guess;
        // converting the guess number to an integer
        int guessNumber;

        while (true)
        {
            guess = JOptionPane.showInputDialog(null, "Enter your guess (or enter '0' to quit):");
            
             // handle a case where the dialog was closed or the cancel button is pressed
            if (guess == null || guess.equals(""))
            {
                System.out.println("The input you have entered is invalid. Please enter a valid number. or '0' to quit.");
                continue; // Prompt again if input is invalid
            }

            // converting the guess string into an integer
            try
            {
                guessNumber = Integer.parseInt(guess);
            }
            catch (NumberFormatException e)
            {
                System.out.println("The input you have entered is invalid. Please enter a valid number.");
                continue; // Prompt again if input is not a number
            }

            if (guessNumber == 0)
            {
                System.out.println("You have exited the game.");
                System.out.println("***************************EXITING THE GAME*******************************");
                break; // Exit the game if user enters '0'
            }
            
            countAttempts++;

            if (guessNumber > randomNumber)
                System.out.println("That number is too high. Try again.");
            else if (guessNumber < randomNumber)
                System.out.println("That number is too low. Try again.");
            else
            {
                System.out.pri73
                ntln("Congratulations! " + guessNumber + " is the correct guess. You won the game with " + countAttempts * 100 + " points.");
                break; // Exit the loop if guess is correct
            }
            if (countAttempts==maxAttempts)
            {
                System.out.println("You have exceeded the maximum attempts.");
                System.out.println("***********************************EXITING THE GAME******************************");
                break;
            }
        }
    }
}
