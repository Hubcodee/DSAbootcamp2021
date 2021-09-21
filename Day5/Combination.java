import java.util.Scanner;
public class Combination{
    static double fact(int n){
        int i=1;
        int fact=1;
        while(i<=n) {
            if (n == 0) {
                fact = 1;
            } else if (n == 1) {
                fact = 1;
            } else {
                fact = fact * i;
            }
            i += 1;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scan  =new Scanner(System.in);
        System.out.print("Input n: ");
        int n= scan.nextInt();
        System.out.print("Input r: ");
        int r= scan.nextInt();
        double npr = (fact(n)/fact(n-r));
        System.out.println("nPr: "+npr);
        double ncr = npr/fact(r);
        System.out.println("nCr: "+ncr);

    }
}