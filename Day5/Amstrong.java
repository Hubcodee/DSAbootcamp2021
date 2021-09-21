import java.util.Scanner;
public class Amstrong{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp=num;
        int sum=0;
        while(num!=0){
            int rem = num%10;
            sum = sum +(rem*rem*rem);
            num = num/10;
        }
        if(sum==temp){
            System.out.println("armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }
    }
}