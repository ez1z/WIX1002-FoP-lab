package lab;
import java.util.Scanner;
public class l3q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();    
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        double denominator = a*d - b*c;

        if(denominator < 0.0000001 && denominator > -0.0000001) {
            System.out.println("The equation has no solution.");
            return;
        }

        double x = (e*d - b*f) / denominator;
        double y = (a*f - e*c) / denominator;


        System.out.printf("x = %.2f%n", x);
        System.out.printf("y = %.2f%n", y);
    }
}
