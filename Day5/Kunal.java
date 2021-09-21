import java.util.Scanner;
public class Kunal{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month_days = scan.nextInt();
        int cnt=0;
        int i =0;
        while(i!=month_days){
           if(i%2==0) {
               cnt+=1;
           }
           i+=1;
        }
//        for(int i =1;i<=month_days;i++){
//            if(i%2==0){
//                System.out.print(i);
//                cnt+=1;
//            }
//           }

        System.out.print("No of days "+ cnt);
    }
}