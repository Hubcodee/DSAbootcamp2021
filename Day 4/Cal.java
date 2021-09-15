import java.util.Scanner;

public class Cal {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a number #");
        int number = ob.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is Odd");
        }
        ob.close();
    }
}
