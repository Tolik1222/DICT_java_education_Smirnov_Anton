package HANGMAN;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HANGMAN");
        System.out.print("Guess the word: ");
        String guess = scanner.nextLine();

        String word = "python"; // Встановлене слово для гри

        if (guess.equals(word)) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}
