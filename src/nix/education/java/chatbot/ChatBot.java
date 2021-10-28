package nix.education.java.chatbot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Heisenberg.");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name:");
        Scanner scan = new Scanner(System.in);
        String yourName = scan.nextLine();
        System.out.printf("What a great name you have, %s!%n", yourName);
        System.out.println("I can guess your age :)");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7:");
        int remainder3 = scan.nextInt();
        int remainder5 = scan.nextInt();
        int remainder7 = scan.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.printf("Your age is %s y.o. %nIt was too easy. Move on.%n", age);
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " !");
        }
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is correct syntax for main method of a java class?");
        System.out.println("1. public static int main(String[] args)");
        System.out.println("2. public int main(String[] args)");
        System.out.println("3. public static void main(String[] args)");
        System.out.println("4. None of the above.");
        while (true) {
            int userAnswer = scan.nextInt();
            if (userAnswer == 3) {
                System.out.println("Great, you right!");
                break;
            }
            else System.out.println("Please, try again.");
        }
    }
}

