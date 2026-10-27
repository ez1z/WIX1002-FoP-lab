package lab;
import java.util.Scanner;

public class l3q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double radius = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x*x + y*y <= radius*radius) {
            System.out.println("The point is inside the circle.");
        } else {
            System.out.println("The point is outside the circle.");
        }
    }
}
