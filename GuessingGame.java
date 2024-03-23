import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args)
    {
        System.out.println("This is the Guessing Game..");
        System.out.println("Please select the following options to get started:");
        System.out.println("1. Play the Game on Easy mode");
        System.out.println("2. Play the Game on Intermediate mode");
        System.out.println("3. PLay the Game on Expert mode");
        System.out.println("4. Quit the game");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();
        if(option==1)
        {
            int easyModeGuessNumber = 26;
            System.out.println("You are now playing on an Easy mode.");
            System.out.println("You will now have to enter a guess number that is between between 1 and 50");
            int guessChoice = scanner.nextInt();
            while(guessChoice!=easyModeGuessNumber)
            {
                if(option!=4)
                {
                   if(guessChoice<easyModeGuessNumber)
                        System.out.println("That guess is too low, try again.");
                        guessChoice = scanner.nextInt();
                    System.out.println("That guess is too high, try agin.");
                    guessChoice = scanner.nextInt();
                }
                System.out.println("Exiting... GoodBye");
            }
            
        }
        
    }
}