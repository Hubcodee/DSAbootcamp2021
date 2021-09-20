import java.util.Scanner;
public class Largest{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}