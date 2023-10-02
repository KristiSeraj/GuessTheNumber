import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Generate();
    }
    public static void Generate() {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--Guess the number game--");
        int maxNum = 10;
        int randomNum = rand.nextInt(maxNum);
        System.out.println("I am thinking of a number between 1 and " + maxNum);
        int attempts = 3;
        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.println("You have " + attempt + " attempts, enter your guess");
            int userGuess = scanner.nextInt();
            if (userGuess == randomNum) {
                System.out.println("You found the number! Congratulations!!!");
                break;
            } else if (userGuess > randomNum) {
                System.out.println("Your number is higher");
            } else {
                System.out.println("Your number is lower");
            }
        }
        scanner.close();
    }
}