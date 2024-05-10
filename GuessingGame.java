
import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args)
    {
        System.out.println("This is the Guessing Game..");
        System.out.println("Please select the following options to get started:");
        System.out.println("************************************************************************************");
        System.out.println("************************************************************************************");
        System.out.println("1. Play the Game on Easy mode");
        System.out.println("2. Play the Game on Intermediate mode");
        System.out.println("3. PLay the Game on Expert mode");
        System.out.println("4. Quit the game");
        System.out.println("************************************************************************************");
        System.out.println("************************************************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"+  "Enter the number:");
        int option = scanner.nextInt();
        scanner.nextLine();
        //these are the points that are calculated at the end of game when the user has won
        int points;
        // number of attempts the user took to win the game
        int countAttempts = 0;
        if(option==1)
        {
            int easyModeGuessNumber = 26;
            System.out.println("You are now playing on an Easy mode.");
            System.out.println("You will now have to enter a guess number that is between between 1 and 50");
            System.out.println("The points for this mode are calculated as: number of attempts * 50");

            System.out.println("\n" +"Enter the guess number:");
            int guessChoice = scanner.nextInt();
            countAttempts++;
            while(guessChoice!=easyModeGuessNumber)
            {
                if(option!=4)
                {
                   if(guessChoice<easyModeGuessNumber)
                   {
                        System.out.println("That guess is too low, try again.");
                        guessChoice = scanner.nextInt();
                        countAttempts++;
                   }
                    System.out.println("That guess is too high, try agin.");
                    guessChoice = scanner.nextInt();
                    countAttempts++;
                }
            }
            points = countAttempts * 50;
            System.out.println("You have won the game, with: " + points +" points");  
        }
        else if(option ==2)
        {
            int intermediateModeGuessNumber = 326;
            System.out.println("You are now playing on an Intermediate mode.");
            System.out.println("You will now have to enter a guess number that is between between 100 and 500");
            System.out.println("The pointsfor this mode are calculated as: number of attempts * 500");
            System.out.println("\n" +"Enter the guess number:");
            int guessChoice = scanner.nextInt();
            countAttempts++;
            while(guessChoice != intermediateModeGuessNumber)
            {
                if(option!=4)
                {
                   if(guessChoice<intermediateModeGuessNumber)
                   {
                        System.out.println("That guess is too low, try again.");
                        guessChoice = scanner.nextInt();
                        countAttempts++;
                   }
                    System.out.println("That guess is too high, try agin.");
                    guessChoice = scanner.nextInt();
                    countAttempts++;
                }
            }
            points = countAttempts * 500;
            System.out.println("You have won the game, with: " + points +" points");  
        }
        else if(option==3)
        {
            int expertModeGuessNumber = 826;
            System.out.println("You are now playing on an Intermediate mode.");
            System.out.println("You will now have to enter a guess number that is between between 100 and 1000");
            System.out.println("The points for this mode are calculated as: number of attempts * 500");
            System.out.println("\n" +"Enter the guess number:");
            int guessChoice = scanner.nextInt();
            countAttempts++;
            while(guessChoice != expertModeGuessNumber)
            {
                if(option!=4)
                {
                   if(guessChoice<expertModeGuessNumber && guessChoice<(expertModeGuessNumber/2))
                   {
                        System.out.println("That guess is too low, try again.");
                        guessChoice = scanner.nextInt();
                        countAttempts++;
                   }
                    else if(guessChoice>500 && guessChoice<expertModeGuessNumber)
                    {
                        System.out.println("You are very close, keep on trying..");
                        guessChoice = scanner.nextInt();
                        countAttempts++;
                    }  
                    else if(guessChoice>expertModeGuessNumber)
                    {
                        System.out.println("That guess is too high, try agin.");
                        guessChoice = scanner.nextInt();
                        countAttempts++;
                    }
                }
            }
            points = countAttempts * 1000;
            System.out.println("You have won the game, with: " + points +" points"); 
        }
        scanner.close();
        System.out.println("Exiting.. GoodBye!");
        System.exit(0);
    }
}
