import java.util.Scanner;

public class t3q1 {
    public static void main(String[] args) {
        /* A */
        if (3*8==27) {
            System.out.println("3*8 equals to 27");
        } else {
            System.out.println("3*8 does not equal to 27");
        }

        /* B */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        /* C */
        char letter = scanner.next().charAt(0);
        if (Character.isUpperCase(letter)) {
            System.out.println("The letter is uppercase.");
        } else {
            System.out.println("The letter is lowercase.");
        }

        /* D */

        String str1 = scanner.next();
        String str2 = scanner.next();

        if(str1.compareToIgnoreCase(str2) >= 0) {
            System.out.println(str2 + " " + str1);
        } else {
            System.out.println(str1 + " " + str2);
        } 

        /* E */
        int day = scanner.nextInt();
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number.");
        }
    }
}
