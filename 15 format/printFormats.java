public class printFormats {
    public static void main(String[] args) {
        String name = "Eziz";

        System.out.printf("%s\n", name);
        System.out.printf("%S\n", name);
        System.out.printf("[%10s]\n", name);
        System.out.printf("[%-10s]\n", name);
        System.out.printf("%.2s\n", name);
        System.out.printf("[%10.2s]\n", name);
        System.out.printf("[%-10.2s]\n", name);
        System.out.printf("%10S\n", name);
        System.out.printf("%b\n", name);
        System.out.printf("%B\n", name);
        System.out.printf("%h\n", name);
        System.out.printf("%H\n", name);
        System.out.printf("%1$s %1$S\n", name);
        System.out.printf("%s%%\n", name);
        System.out.printf("%s %<B\n", name);
    }
}