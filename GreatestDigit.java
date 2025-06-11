import java.util.Scanner;

public class GreatestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Create a Scanner object for input
        System.out.print("Enter a number: ");// Prompt user for input
        int num = sc.nextInt();// Read the integer input from user

        int maxDigit = 0;
        int n = Math.abs(num); // Handle negative numbers by taking absolute value

        while (n != 0) { // Loop until all digits are processed
            int digit = n % 10;// Get the last digit
            if (digit > maxDigit) {// Compare with current max digit
                maxDigit = digit;// Update max digit if current digit is greater
            }
            n /= 10;
        }

        System.out.println("Greatest digit: " + maxDigit);// Output the greatest digit found
        sc.close();
    }
}