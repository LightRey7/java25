import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double distanceBetweenCities = scanner.nextDouble();

        double travelTimeByBus = scanner.nextDouble();

        System.out.println(distanceBetweenCities / travelTimeByBus);

        scanner.close();
    }
}