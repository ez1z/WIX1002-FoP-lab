package tutorial;
import java.util.Scanner;

public class t2q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter diameter: ");
        double diameter = scanner.nextDouble();
        double radius = diameter/2;
        double circumference = 2*Math.PI*radius;
        System.out.printf("The circumference of the circle is: %.3f", circumference);
    }
}
