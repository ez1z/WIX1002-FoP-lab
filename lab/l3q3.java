package lab;
import java.util.Scanner;

public class l3q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double salesVol = scanner.nextDouble();
        double commission;
        if(salesVol<100) {
            commission = salesVol * 0.05;
        } else if(salesVol<=500) {
            commission = salesVol * 0.075;
        } else if (salesVol<=1000) {
            commission = salesVol * 0.1;
        } else {
            commission = salesVol * 0.125;
        }

        System.out.printf("Commission: %.2f%n", commission);
    }
}
