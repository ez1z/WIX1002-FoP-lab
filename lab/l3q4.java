package lab;
import java.util.Scanner;
public class l3q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pl1r1 = (int)(Math.random() * 7) + 1;
        int pl1r2 = (int)(Math.random() * 7) + 1;
        int pl2r1 = (int)(Math.random() * 7) + 1;
        int pl2r2 = (int)(Math.random() * 7) + 1;
        
        int player1Total = pl1r1 + pl1r2;
        int player2Total = pl2r1 + pl2r2;

        if (player1Total > player2Total) {
            System.out.println("Player 1 wins with a total of " + player1Total);
        } else if (player2Total > player1Total) {
            System.out.println("Player 2 wins with a total of " + player2Total);
        } else {
            System.out.println("It's a tie! Both players have a total of " + player1Total);
        }
    }
}
