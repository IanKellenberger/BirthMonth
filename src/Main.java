import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.printf("Your birth month is: %d%n", birthMonth);
        } else {
            System.out.printf("You entered an incorrect month value: %d%n", birthMonth);
        }
    }
}