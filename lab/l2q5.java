package lab;
public class l2q5 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 10000);
        System.out.printf("%d%n", num);

        int sum=0;
        while(num>0) {
            int d=num%10;
            sum+=d;
            num/=10;
        }
        System.out.printf("%d", sum);
    }
    
}
