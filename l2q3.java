public class l2q3 {
    public static void main(String[] args) {
        double a = 10 + Math.random() * 50;
        double b = 10 + Math.random() * 50;
        double c = 10 + Math.random() * 50;

        double sum = a + b + c;
        double average = sum/3;

        System.out.printf("a = %.2f, b = %.2f, c = %.2f\n", a, b, c);
        System.out.printf("Sum = %.2f, Average = %.2f\n", sum, average);
    }
}
