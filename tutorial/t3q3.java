public class t3q3 {
    public static void main(String[] args) {
        /* A */
        int x=9;
        int y=10;
        if(x<10) {
            if(y>10) {
                System.out.println("*****");
            } else {
                System.out.println("#####");
            }
        }
        System.out.println("$$$$$");

        /* B */
        if(x<10) {
            if(y<10) {
                System.out.println("*****");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
            }
        }

        /* C */
        if(x>10) {
            if(y>10) {
                System.out.println("*****");
                System.out.println("#####");
            } else {
                System.out.println("$$$$$");
            }
        }
    }
}
