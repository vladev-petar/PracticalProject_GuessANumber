import java.util.Random;
import java.util.Scanner;

public class PracticalProject_GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumberByComputer = new Random();

        int computerNumber = randomNumberByComputer.nextInt(101);
        boolean finishedGame = false;

        System.out.println("Welcome to the game \"Guess a number\"!");
        System.out.println("You may start your game in a moment! Just press \"Enter\"! \nIf you'd like to end your game just type: \"F\" for \"Finished\"!");

        String start = scanner.nextLine();

        while (true) {
            System.out.print("Guess a number (0-100): ");

            String playerInput = scanner.nextLine();
            boolean invalidInput = false;

            if (playerInput.equals("F")) {
                finishedGame = true;
                break;
            }

            for (int i = 0; i < playerInput.length(); i++) {
                char symbol = playerInput.charAt(i); // 48 - 57
                if (symbol < 48 || symbol > 57) {
                    invalidInput = true;
                    break;
                }
            }

            if (!invalidInput) {
                int playerNumber = Integer.parseInt(playerInput);
                if (playerNumber == computerNumber) {
                    System.out.println("Very well. You guessed it!");
                    break;
                } else if (playerNumber > computerNumber) {
                    System.out.println("Too high, give your next pick");
                } else {
                    System.out.println("Too low, give your next pick");
                }
            } else {
                System.out.println("Invalid input! Please enter a number between 0-100");
            }
        }

        if (finishedGame) {
            System.out.println("See you soon! Bye :)");
        }
    }
}
