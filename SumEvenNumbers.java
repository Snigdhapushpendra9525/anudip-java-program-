public class SumEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;// Initialize sum to 0

        for (int i = 1; i <= 30; i++) {// Loop from 1 to 30
            sum += 2 * i;  // Even natural numbers: 2, 4, 6, ..., 60
        }

        System.out.println("Sum of the first 30 even natural numbers is: " + sum);// Output the result
    }
}
