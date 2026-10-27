import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter two number: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            System.out.print("Enter the operator: ");
            char operator = scanner.next().charAt(0);
            double result = switch (operator) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> num1 / num2;
                case '%' -> num1 % num2;
                default -> 0;
            };
            System.out.printf("%f %c %f is %f", num1, operator, num2, result);
        }
    }
}