import java.util.Scanner;
public class SumInp{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entering 0 means exit..");
        int n = 0;
        int sum=0;
        while(true){
            n= scan.nextInt();
            if(n!=0){
                sum+=n;
                System.out.println("Sum till last entry:"+sum);
            }
            else{
                break;
            }
        }
        System.out.println(sum);
    }
}