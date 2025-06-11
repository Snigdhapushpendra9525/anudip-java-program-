import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Assumes valid and non-negative
        int fact = 1;// Initialize factorial to 1

        // Calculate factorial
        for (int i = 1; i <= n; i++)// Loop from 1 to n
            fact *= i;// Multiply i to fact

        System.out.println("Factorial: " + fact);
        sc.close(); // Close the scanner
    }
}
