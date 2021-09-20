import java.util.Scanner;
public class Fib{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
        int a = 0;
        int b = 1;
        int cnt=2;
        while(cnt<=n){
            int temp = b;
            b= b+a;
            a = temp;
            cnt+=1;
            System.out.print(a + " ");
        }

    }
}