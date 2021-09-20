import java.util.Scanner;
public class Psdigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int product = 1;
        int sum = 0;
        while(num!=0){
            int rem=num%10;
            product= product*rem;
            sum=sum+rem;
            num/=10;
        }
        int ans = product - sum;
        System.out.println(ans);
    }
}