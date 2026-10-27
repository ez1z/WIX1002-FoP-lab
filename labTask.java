import java.util.Scanner;

class labTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] x = new int[3];
        int [] y = new int[3];

        for(int i=0; i<3; i++) {
            System.out.println("Enter the first coordinates: ");
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
    

    /*
    -----------  LEETCODE VERSION -------------

    public boolean main(int[][] points) {
        int[] x = new int[3];
        int[] y = new int[3];

        for(int i=0; i<3; i++) {
            x[i] = points[i][0];
            y[i] = points[i][1];
        }
    */
        // A boomerang is a set of three points that are all distinct and not in a straight line. 
        // Boomerang = Triangle

        double lineA = Math.sqrt(Math.pow(x[1]-x[0], 2)+Math.pow(y[1]-y[0], 2));
        double lineB = Math.sqrt(Math.pow(x[2]-x[0], 2)+Math.pow(y[2]-y[0], 2));
        double lineC = Math.sqrt(Math.pow(x[2]-x[1], 2)+Math.pow(y[2]-y[1], 2));

        boolean isTriangle = (lineA+lineB-lineC>1e-9) && (lineA+lineC-lineB>1e-9) && (lineB+lineC-lineA>1e-9); 

        System.out.println(isTriangle);
    }
}
