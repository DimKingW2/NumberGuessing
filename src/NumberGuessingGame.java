import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner keyboard;
        int pickedNumber;
        int guessedNumber;
        int tries;
        int games;
        String answer;




        keyboard = new Scanner(System.in);
        System.out.println("Would you like to play the number guessing game?");
        answer =  keyboard.nextLine();
        games = 0;


         while (answer.equals("yes")) {
            pickedNumber = (int) (Math.random() * 100);
            System.out.println("Guess the number. It is between 1 and 100.");
            guessedNumber = keyboard.nextInt();
            tries = 1;

            while (pickedNumber != guessedNumber) {
                if (guessedNumber > pickedNumber) {
                    System.out.println("Too high");
                }
                else if (guessedNumber < pickedNumber) {
                    System.out.println("Too low");
                }
                System.out.println("Try again.");
                guessedNumber = keyboard.nextInt();
                tries = tries + 1;
            }
            if (pickedNumber == guessedNumber) {
                System.out.println("You are correct.");
            }

            System.out.println("It took you " + tries + " tries to guess the number.");
            System.out.println("Would you like to play again? (only type yes or no)");
            answer = keyboard.next();
            games = games + 1;



        }
        if (!answer.equals("yes")) {
            System.out.println("You played a total of " + games + " time(s).");
        }





    }
}
