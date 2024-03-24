import java.awt.Color;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;;

public class GuessingGame
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("This is the Guessing game"); // sets title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of the application
        frame.setResizable(false); // prevents frame from being resized
        frame.setSize(420,420); // sets x-dimension and y-dimension of our frame
        frame.setVisible(true); // make frame visible
        ImageIcon image = new ImageIcon("logo.png"); // create image icon
        frame.setIconImage((image.getImage())); // change icon of the frame
        frame.getContentPane().setBackground(new Color(255,255,255)); // change background color

        System.out.println("This is the Guessing Game..");
        System.out.println("Please select the following options to get started:");
        System.out.println("1. Play the Game on Easy mode");
        System.out.println("2. Play the Game on Intermediate mode");
        System.out.println("3. PLay the Game on Expert mode");
        System.out.println("4. Quit the game");
        Scanner scanner = new Scanner(System.in);
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
            System.out.println("The pointsfor this mode are calculated as: number of attempts * 50");
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
                System.out.println("Exiting... GoodBye");
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
                System.out.println("Exiting... GoodBye");
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
                System.out.println("Exiting... GoodBye");
            }
            points = countAttempts * 1000;
            System.out.println("You have won the game, with: " + points +" points"); 
        }
        scanner.close();
        System.out.println("Exiting.. GoodBye!");
    }
}