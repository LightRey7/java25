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

/* Examples for Understanding the code base.

    1. 264: 264 / 10 becomes 26. Then 26 % 10 returns 6.
    2. 4136: 4136 / 10 becomes 413. Then 413 % 10 returns 3.
    3. 101: 101 / 10 becomes 10. Then 10 % 10 returns 0.
    4. Single-digit numbers (e.g., 5): 5 / 10 becomes 0. Then 0 % 10 safely returns 0.

*/