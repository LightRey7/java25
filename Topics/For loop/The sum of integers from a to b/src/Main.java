import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Initialize product variable to 1
        int sum = 0;

        // Loop from a (inclusive) to b (exclusive)
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        // Print the final calculated product
        System.out.println(sum);

        scanner.close();
    }
}