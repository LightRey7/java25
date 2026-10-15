import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize the Scanner object to receive user input
        Scanner sc = new Scanner(System.in);

        // Write your code for receiving user's name and age here.
        String userName = sc.next();
        String userAge = sc.next();

        // Print the message using the user's name and age.
        System.out.println("Hello, I am " + userName + "! I am " + userAge + " years old.");

        sc.close();
    }
}