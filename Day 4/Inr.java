import java.util.Scanner;

public class Inr {
    // 0.014
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter INR: # ");
        int INR = ob.nextInt();
        double USD = INR * 0.014;
        System.out.print(USD);
        ob.close();
    }
}
