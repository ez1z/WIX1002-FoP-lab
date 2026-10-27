import java.util.Scanner;
public class t3q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if(x>y && x>z) {
            System.out.println("x is the largest number");
        } else if(y>x && y>z) {
            System.out.println("y is the largest number");
        } else if(z>x && z>y) {
            System.out.println("z is the largest number");
        } else {
            System.out.println("There is a tie for the largest number.");
        }
    }
}
