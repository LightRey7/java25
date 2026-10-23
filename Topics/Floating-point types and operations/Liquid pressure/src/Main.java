import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double rho = scanner.nextDouble();
        double h = scanner.nextDouble();

        double g = 9.8;

        double p = rho * g * h;

        System.out.println(p);

        scanner.close();
    }
}