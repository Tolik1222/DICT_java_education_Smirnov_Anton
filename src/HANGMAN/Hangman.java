package HANGMAN;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"python", "java", "javascript", "kotlin"};
        Random random = new Random();
        String word = words[random.nextInt(words.length)];

        char[] hiddenWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            hiddenWord[i] = '-';
        }

        int attempts = 8;
        Scanner scanner = new Scanner(System.in);

        while (attempts > 0 && new String(hiddenWord).contains("-")) {
            System.out.println(hiddenWord);
            System.out.println("Input a letter: ");
            char guess = scanner.next().charAt(0);

            if (word.indexOf(guess) >= 0) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        hiddenWord[i] = guess;
                    }
                }
            } else {
                System.out.println("That letter doesn't appear in the word.");
                attempts--;
            }
        }

        if (!new String(hiddenWord).contains("-")) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}

