import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here


        double radius = scanner.nextDouble();
        double surfaceArea = Math.PI * (radius * radius);

        System.out.println(surfaceArea);

        scanner.close();
    }
}