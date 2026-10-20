import java.util.Scanner;
public class l2q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double wG = scan.nextDouble();
        double initF = scan.nextDouble();
        double finalF = scan.nextDouble();

        double initC = (initF - 32) / 1.8;
        double finalC = (finalF - 32) / 1.8;

        double wKg = wG / 1000;
        double c = wKg*(finalC - initC)*4184;
        System.out.printf("%e", c);
    }
}
