import java.util.Scanner;
public class Fact{
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int inp = obj.nextInt();
        int i=1;
        int fact=1;
        while(i<=inp){
            if(inp == 0){
                fact=1;
            }
            else if (inp == 1) {
                fact = 1;
            }
            else {
                fact = fact*i;
            }
            i += 1;
        }
        System.out.println(fact);
    }
}