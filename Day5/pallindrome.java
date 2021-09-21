import java.util.Scanner;
public class pallindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ncop = num;
        int no=0;
        while(num!=0){
            int rem = num%10;
            no=no*10+rem;
            num/=10;
        }
//        System.out.println(no);
        if(no==ncop){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
