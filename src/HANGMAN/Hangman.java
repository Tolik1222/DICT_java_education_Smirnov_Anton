package HANGMAN;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"python", "java", "javascript", "kotlin"};
        Random random = new Random();
        String word = words[random.nextInt(words.length)];

        String hint = word.substring(0, 2) + "-".repeat(word.length() - 2);
        System.out.println("HANGMAN");
        System.out.println("Guess the word: " + hint);

        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();

        if (guess.equals(word)) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}

