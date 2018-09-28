import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner keyboard;
        int pickedNumber = 0;
        int guessedNumber;
        int tries;
        int games;
        String answer;
        String type;
        int maxTries = 0;




        keyboard = new Scanner(System.in);
        games = 0;


         do {
            System.out.println("This is the Number Guessing game! Would you like to play to" +
                    " 100, 1000, or the hardest... 1000000? Key: Type 1 for 100" +
                    ", 2 for 1000, or 3 for 1000000.");
            type = keyboard.next();
            while(!type.equals("1")&&!type.equals("2")&&!type.equals("3")) {
                 System.out.println("Please type 1, 2, or 3 only.");
                 type = keyboard.next();
             }
            if (type.equals("1")) {
                pickedNumber = (int) (Math.random() * 100);
                System.out.println("Guess the number. It is between 1 and 100.");
                maxTries = 5;
                System.out.println("You have " + maxTries + " tries to guess the number.");
            }
            if (type.equals("2")) {
                pickedNumber = (int) (Math.random() * 1000);
                System.out.println("Guess the number. It is between 1 and 1000.");
                maxTries = 11;
                System.out.println("You have " + maxTries + " tries to guess the number.");
            }
            if (type.equals("3")) {
                pickedNumber = (int) (Math.random() * 1000000);
                System.out.println("Guess the number. It is between 1 and 1000000.");
                maxTries = 100;
                System.out.println("You have " + maxTries + " tries to guess the number.");
            }

            guessedNumber = keyboard.nextInt();
            tries = 1;
            while (pickedNumber != guessedNumber) {
                if (maxTries == tries) {
                    System.out.println("You did not guess the number.");
                    break;
                }

                if (guessedNumber > pickedNumber) {
                    System.out.println("Too high");
                }
                else  {
                    System.out.println("Too low");
                }
                System.out.println("You have " + (maxTries - tries) + " tries left to guess the number.");
                System.out.println("Try again.");
                guessedNumber = keyboard.nextInt();
                tries = tries + 1;


            }
            if (pickedNumber == guessedNumber){
                System.out.println("You are correct.");
                System.out.println("It took you " + tries + " tries to guess the number.");
            }

            System.out.println("Would you like to play again? (only type yes or no) ");
            answer = keyboard.next().toLowerCase();
            games += 1;



        }while(answer.equals("yes"));
        if (!answer.equals("yes")) {
            System.out.println("You played a total of " + games + " time(s).");
            keyboard.close();
            System.exit(0);
        }





    }
}
