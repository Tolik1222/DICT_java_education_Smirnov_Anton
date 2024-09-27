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
        System.out.println("Your age is " + ((num1 * 70 + num2 * 21 + num3 * 15) % 105) + "; that`s a good time to start proggraming");

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Now I will prove to you that I can count to any number you want!");
        int userInput = scanner3.nextInt();
        for (int i = 0; i <= userInput; i++)
            System.out.println(i + "!");

                Scanner scanner4 = new Scanner(System.in);

                // Правильна відповідь
                int correctAnswer = 3;
                int userAnswer = 0;

                // Питання та варіанти відповідей
                String question = "Which of the following data types in Java is used for integers?";
                String[] options = {
                        "1. double",
                        "2. char",
                        "3. int",
                        "4. boolean"
                };

                while (userAnswer != correctAnswer) {
                    System.out.println(question);

                    for (String option : options) {
                        System.out.println(option);
                    }

                    System.out.print("Ваш вибір: ");
                    userAnswer = scanner.nextInt();

                    if (userAnswer != correctAnswer) {
                        System.out.println("Wrong answer.\n");
                    } else {
                        System.out.println("Correct.\n Goodbye, have a nice day!");
                    }
                }

                scanner.close();
            }
        }
