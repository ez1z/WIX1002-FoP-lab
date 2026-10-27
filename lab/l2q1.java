package lab;
import java.util.Scanner;

public class l2q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double f = scan.nextDouble();
        double c = (f - 32) / 1.8;

        System.out.printf("%.2f", c);
    }
}