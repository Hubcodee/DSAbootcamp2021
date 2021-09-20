import java.util.Scanner;
public class Caps{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char c = obj.next().trim().charAt(0);
        if(c>='A' && c<='Z'){
            System.out.println("CAPS");
        }
        else System.out.println("LowerCase");
    }
}