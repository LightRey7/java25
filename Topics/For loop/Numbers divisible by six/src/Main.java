import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int currentNumber = scanner.nextInt();

            if (currentNumber % 6 == 0) {
                sum += currentNumber;
            }
        }
        System.out.println(sum);

        scanner.close();
    }
}