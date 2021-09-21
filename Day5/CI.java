import java.util.Scanner;
public class CI{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Principal: ");
        double p = obj.nextDouble();
        System.out.print("Rate: ");
        double rate = obj.nextDouble();
        System.out.print("Time of investment in yrs: ");
        double time = obj.nextDouble();
        double temp = Math.pow((1+(rate/100)),time);
        double amount = p*temp;
        double CI = amount - p;
        System.out.printf("CI: %.2f",CI);
    }
}