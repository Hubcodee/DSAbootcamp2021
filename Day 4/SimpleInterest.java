
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Interest");
        int p = ob.nextInt();
        System.out.println("Enter rate of interest");
        double r = ob.nextDouble();
        System.out.println("Enter Tenure");
        int t = ob.nextInt();

        double si = (p * r * t) / 100;

        System.out.printf("SImple Interest is : %.2f", si);
        ob.close();

    }
}
