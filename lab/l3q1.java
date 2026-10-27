package lab;
import java.util.Scanner;

public class l3q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        char operator = scanner.next().charAt(0);

        if(operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println(num1 / num2);
            } else {
                System.out.println("Error: Division by zero");
            }
        } else if(operator == '%') {
            if (num2 != 0) {
                System.out.println(num1 % num2);
            } else {
                System.out.println("Error: Division by zero");
            }
        }   else {
            System.out.println("Error: Invalid operator");
        }
    }
}
