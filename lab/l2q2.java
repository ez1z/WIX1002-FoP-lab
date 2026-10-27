package lab;
import java.util.Scanner;

public class l2q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double p = scan.nextDouble();
        double d = scan.nextDouble();
        double r = scan.nextDouble();
        double y = scan.nextDouble();
        double m = (p-d)*(1+(r*y)/100)/(y*12);

        System.out.printf("%.2f", m);
    }
}
