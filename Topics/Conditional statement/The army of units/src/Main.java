import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int armyOfUnits = scanner.nextInt();

        if (armyOfUnits < 1) {
            System.out.println("no army");
        } else if (armyOfUnits <= 19) {
            System.out.println("pack");
        } else if (armyOfUnits <= 249) {
            System.out.println("throng");
        } else if (armyOfUnits <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }

        scanner.close();
    }
}