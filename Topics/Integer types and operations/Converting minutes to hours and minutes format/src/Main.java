import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();

        // Your code comes here!
        int convertToHours = minutes / 60;
        int theMinutes = minutes % 60;
        System.out.println(convertToHours + " hours and " + theMinutes + " minutes");


        scanner.close();
    }
}