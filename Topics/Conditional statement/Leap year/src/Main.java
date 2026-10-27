import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int year = scanner.nextInt();

        // A year is leap if it is divisible by 4 AND not divisible by 100,
        // OR if it is divisible by 400.
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }

        scanner.close();


    }
}