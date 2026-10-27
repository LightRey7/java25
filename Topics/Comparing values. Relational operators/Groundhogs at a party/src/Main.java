import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value

        int eatPeanuts = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if (isWeekend) {
            if (eatPeanuts >= 15 && eatPeanuts <= 25) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            if (eatPeanuts >= 10 && eatPeanuts <= 20) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        scanner.close();
    }
}