import java.util.Scanner;

public class Large {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = inp.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = inp.nextInt();
        if (num1 > num2) {
            System.out.printf("%d is the largest", num1);

        } else {
            System.out.printf("%d is the largest", num2);
        }
    }
}
