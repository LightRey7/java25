import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            int tensDigit = (n / 10) % 10;

            System.out.println(tensDigit);

            scanner.close();
        }
    }
}