public class t3q2 {
    public static void main(String[] args) {
        int num1 = 10; 
        int num2 = 20;
        int x = 5;
        int y=3;
        int z=1;
        
        /* A */
        if (num1 == num2) {
            System.out.println("Number 1 is equal to number 2.");
        } // ==

        /* B */
        if (x > y && y > z) {
            System.out.println("x is the largest number");
        } // has to use, cant compare 3 numbers at once

        /* C */
        String s1 = "Hello";
        String s2 = "Hello";
        if (s1==s2) {
            System.out.println("They are equal strings.");
        } else {
            System.out.println("They are not equal strings.");
        } // else doesnt need statement

        /* D */
        if (x>0 || y>0) {
            System.out.println("Either x or y is positive");
        } // || instead of or, and '()' is needed for statement
    }
}
