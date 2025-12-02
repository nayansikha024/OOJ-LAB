import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;
        System.out.println("Discriminant (d) = " + d);

        if (d > 0) {
            

            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Two real solutions:");
            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
        } else if (d == 0) {

            double r1 = -b / (2 * a);
            System.out.println("One real solution:");
            System.out.println("r1 = r2 = " + r1);
        } else {

            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-d) / (2 * a);
            System.out.println("No real solutions. Complex roots:");
            System.out.println("r1 = " + realPart + " + " + imagPart + "i");
            System.out.println("r2 = " + realPart + " - " + imagPart + "i");
        }

        scanner.close();
    }
}