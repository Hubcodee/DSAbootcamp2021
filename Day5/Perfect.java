import java.util.Scanner;
public class Perfect{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum=0;
        for (int i=1;i<=a;i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
            if(sum%a==0){
                System.out.println("Perfect No");
            }
            else{
                System.out.println("Not a Perfect No");
            }

        }
    }
