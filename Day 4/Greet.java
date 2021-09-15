import java.util.Scanner;

public class Greet {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your name: # ");
        String name = ob.next();
        System.out.print("Hello " + name);
        ob.close();
    }
}
