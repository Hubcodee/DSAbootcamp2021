import java.util.Scanner;
public class Avg{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of observations: ");
        int n = scan.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            int obsv = scan.nextInt();
            sum = obsv + sum;
        }
        System.out.println("Average: "+sum/n);
    }
}