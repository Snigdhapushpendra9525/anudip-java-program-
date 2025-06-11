public class SequencePrinter {
    public static void main(String[] args) {
        int term = 4; // First term
        int count = 90; // Number of terms

        for (int i = 1; i <= count; i++) {
            System.out.print(term + " ");
            term += 4;
        }
    }
}
