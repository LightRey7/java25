import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int revereNumbers = scanner.nextInt();
        String reversedStr = new StringBuilder(String.valueOf(revereNumbers)).reverse().toString();
        int reversed = Integer.parseInt(reversedStr);

        System.out.println(reversed);

        scanner.close();



    }
}