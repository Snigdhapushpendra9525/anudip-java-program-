import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three angles of the triangle:");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        int sum = angle1 + angle2 + angle3;

        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            System.out.println("Angles should be greater than zero.");
        } else if (sum == 180) {
            System.out.println("They form a triangle.");

            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Type: Right-angled triangle");
            } else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                System.out.println("Type: Acute triangle");
            } else {
                System.out.println("Type: Obtuse triangle");
            }
        } else {
            System.out.println("They do NOT form a triangle.");
        }

        sc.close();
    }
}
