import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            int tensDigit = (n / 10) % 10;
            // Step 1: Remove the last digit (units digit) using integer division
            // Step 2: Extract the new last digit using the modulo operator

            System.out.println(tensDigit);

            scanner.close();
        }
    }
}