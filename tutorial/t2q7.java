package tutorial;
import java.util.Scanner;

public class t2q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value in inch: ");
        double inch = scanner.nextDouble();
        double cm = inch * 2.54;
        double m = cm / 100;
        System.out.printf("%.2f inches = %.2f meters", inch, m);
    }
}
