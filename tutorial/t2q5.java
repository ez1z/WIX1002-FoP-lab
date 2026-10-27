package tutorial;

import java.util.Scanner;

public class t2q5 {
    public static void main(String[] args) {
        /*
            -------- A ---------
            final double AMOUNT = "32.5";
            AMOUNT += 10;
            System.out.println("The amount is " + AMOUNT);
        */

        double AMOUNT = 32.5;
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);

        // removed final keyword and quotation mark "" in double



         /*
            ---------B----------
            string chapter = 'Summary';
            System.out.println(chapter);
        */

        String chapter = "Summary";
        System.out.println(chapter);
        // String starts with capitalized s, and String mark is "" not ''





        /*
        -----------C----------
        int num;
        ++num++;
        num1 = num
        */
       int num=0;
       num++;
       int num1 = num;

       // in order to use num++ or ++num we have to first set the initial value for num
       // and also we cant use ++num++ at the same time.
       // lastly we have to declare the new variable before assigning with anything










       /*
       -----------D----------
        int num = 3000;
        System.out.printf("%4.2f\n", num);
        */
        int num = 3000;
        System.out.printf("%4.2f\n", num);




        /*
            -----------E----------
            
            String contact;
            Scanner keyboard = new Scanner(System.out);
            contact = keyboard.nextLine();

        */

            
            String contact;
            Scanner keyboard = new Scanner(System.in);
            contact = keyboard.nextLine();
            // Scanner should has System.in instead of System.out
    }
}
