import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greeting = sc.next();
        String programmingLanguage = sc.next();
        String future = sc.next();
        String occupation = sc.next();
        System.out.println(greeting);
        System.out.println(programmingLanguage);
        System.out.println(future);
        System.out.println(occupation);


        sc.close();
    }
}