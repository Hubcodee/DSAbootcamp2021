import java.util.Scanner;
public class Commission{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Sale price: ");
        double sale = obj.nextInt();
        System.out.print("Commision Percent: ");
        double cp = obj.nextInt();
        System.out.print("Commision: "+(sale*cp)/100);
    }
}