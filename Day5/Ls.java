import java.util.Scanner;
public class Ls{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n ;
        int sum_n=0;
        int sum_p=0;
        int sum_e=0;
        int sum_o=0;
        while (true){
            n=scan.nextInt();
            if(n!=0){
                if(n>0){
                    sum_p+=n;
                }
                else{
                    sum_n+=n;
                }
                if(n%2==0){
                    sum_e+=n;
                }
                else{
                    sum_o+=n;
                }
            }
            else{
                break;
            }

        }
        System.out.println("Even Sum: "+ sum_e);
        System.out.println("Odd Sum: "+ sum_o);
        System.out.println("Positive Sum: "+ sum_p);
        System.out.println("Negative Sum: "+ sum_n);
    }
}