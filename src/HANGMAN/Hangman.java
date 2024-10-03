package HANGMAN;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"python", "java", "javascript", "kotlin"};
        Random random = new Random();
        String word = words[random.nextInt(words.length)];

        Scanner scanner = new Scanner(System.in);
        System.out.println("HANGMAN");
        System.out.print("Guess the word: ");
        String guess = scanner.nextLine();

        if (guess.equals(word)) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}
