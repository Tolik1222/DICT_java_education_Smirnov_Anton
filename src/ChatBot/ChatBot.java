package ChatBot;

import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        System.out.println("Hello! My name is ChatBot!");
        System.out.println("I was created in 2024.");
        System.out.println("Please, reming me your name.");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What a great name you have," + name);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int num1 = scanner2.nextInt();
        int num2 = scanner2.nextInt();
        int num3 = scanner2.nextInt();
        System.out.println("Your age is "+ ((num1*70+num2*21+num3*15)%105) + "; that`s a good time to start proggraming");
    }
}
