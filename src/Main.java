import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Generate(10);
    }
    public static void Generate(int maxNum) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--Guess the number game--");
        int randomNum = rand.nextInt(maxNum);
        System.out.println("I am thinking of a number between 1 and " + maxNum);
        int attempts = 4;
        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.println("You have " + attempt + " attempts, enter your guess");
            int userGuess = scanner.nextInt();
            if (userGuess == randomNum) {
                System.out.println("You found the number! Congratulations!!!");
                break;
            } else if (userGuess > randomNum) {
                System.out.println("Your guess is higher");
            } else {
                System.out.println("Your guess is lower");
            }
        }
        scanner.close();
    }
}