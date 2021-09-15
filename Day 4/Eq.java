import java.util.Scanner;

public class Eq {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        double num1 = inp.nextDouble();
        System.out.println("Enter num2 : ");
        double num2 = inp.nextDouble();
        char op = inp.next().charAt(0);
        if (op == '+') {
            double sum = num1 + num2;
            System.out.println(sum);

        } else if (op == '-') {
            double minus = num1 - num2;
            System.out.println(minus);

        } else if (op == '*') {
            double mul = num1 * num2;
            System.out.println(mul);

        } else if (op == '/') {
            double div = num1 / num2;
            System.out.println(div);

        }

    }
}
