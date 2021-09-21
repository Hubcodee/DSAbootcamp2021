import java.util.Scanner;
public class Maxinp{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=0;
        int max=0;
        while(true){
            n= scan.nextInt();
            if(n!=0){
                if(n>=max) max=n;
                System.out.println("Max till last entry:"+max);
            }
            else{
                break;
            }
        }
        System.out.println(max);
    }
}
