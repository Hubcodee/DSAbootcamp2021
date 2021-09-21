import java.util.Scanner;
public class Discount{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Listed Price :");
        double LP = obj.nextInt();
        System.out.print("Enter Selling Price :");
        double SP = obj.nextInt();
        double discount = LP-SP;
        double per = ((LP-SP)/LP)*100;
        System.out.print("Discount is " + discount + " Percentage : "+ per);
    }
}