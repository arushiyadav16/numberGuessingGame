import java.util.Scanner;
import java.util.Random;

 class numberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        int lowerBound = 1;
        int upperBound = 100;
        int attempts = 5; // You can change this to limit the number of attempts


        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Select a random number between " + lowerBound + " and " + upperBound + ". Try to guess it and have fun...");

        while (attempts > 0) {
            int randomNumber = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
            System.out.print("Enter number: ");

            int userGuess = sc.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number!");
                score += attempts * 5; // Points based on the number of attempts
                attempts = 0; // End the game
            } else if (userGuess < randomNumber) {
                System.out.println("Too low!...");
                attempts--;
            } else {
                System.out.println("Too high!...");
                attempts--;
            }
        }

        System.out.println("Game Over!");
        System.out.println("Final score is: " + score);
        sc.close();
    }
}
