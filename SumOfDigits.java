import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Assumes valid integer

        int sum = 0;
        while (num != 0) {
            sum += num % 10; // Add last digit
            num /= 10;       // Remove last digit
        }

        System.out.println("Sum of digits: " + sum);
        sc.close(); // Close the scanner
    }
}
