import java.util.Scanner;
public class Dep{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Cost of an asset: ");
        double cost = obj.nextInt();
        System.out.print("Residual Value: ");
        double res = obj.nextInt();
        System.out.print("Useful life of an asset: ");
        double ul = obj.nextInt();
        System.out.print("Depreciation Value: "+ (cost-res)/ul);
    }
}