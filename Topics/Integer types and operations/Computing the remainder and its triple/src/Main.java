import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // The first operation goes here
        int findRemainder = input % 2;
        // The second operation goes here
        int intMultiply = findRemainder * 3;
        System.out.println(findRemainder);
        System.out.println(intMultiply);

        scanner.close();
    }
}