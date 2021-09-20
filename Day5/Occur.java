import java.util.Scanner;
public class Occur{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int cnt=0;
        while(num!=0){
            int rem = num%10;

            if(rem==7){
                cnt+=1;
            }
            num=num/10;
        }
        System.out.println(cnt);
    }
}