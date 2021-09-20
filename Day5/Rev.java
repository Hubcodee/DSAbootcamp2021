import java.util.Scanner;
public class Rev{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        String s = "";
//        while(num!=0){
//            int rem = num%10;
//            s = s + Integer.toString(rem);
//            num=num/10;
//        }
//        System.out.println(Integer.parseInt(s));
        int ans=0;
        while(num!=0){
            int rem = num%10;
            ans = ans*10+rem;
            num/=10;
        }
        System.out.println(ans);
    }
}