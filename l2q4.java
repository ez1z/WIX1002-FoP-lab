import java.util.Scanner;

public class l2q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int s = n%60;
        int h = n/3600;
        int m = (n%3600)/60;

        System.out.printf("Hours: %d, Minutes: %d, Seconds: %d\n", h, m, s);
    }
}
