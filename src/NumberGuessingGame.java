import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner keyboard;
        int pickedNumber;
        int guessedNumber;

        keyboard = new Scanner(System.in);
        pickedNumber = (int) (Math.random() * 100);
        System.out.println("Guess the number. It is between 1 and 100.");
        guessedNumber = keyboard.nextInt();

        while (pickedNumber != guessedNumber) {
            if (guessedNumber > pickedNumber) {
                System.out.println("Too high");
            }
            else if (guessedNumber < pickedNumber) {
                System.out.println("Too low");
            }
            System.out.println("Try again.");
            guessedNumber = keyboard.nextInt();
        }
        if (pickedNumber == guessedNumber) {
            System.out.println("You are correct.");
        }






    }
}
