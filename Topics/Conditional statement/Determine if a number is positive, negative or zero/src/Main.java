import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new Scanner object for reading the input
        Scanner scanner = new Scanner(System.in);

        // Read the number N
        int N = scanner.nextInt();

        if (N < 0) {
            System.out.println("Negative");
        } else if (N == 0) {
            System.out.println("Zero");
        } else if (N > 0) {
            System.out.println("Positive");
        }

        scanner.close();
    }
}