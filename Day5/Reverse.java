import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
//        str to char array
        char[] str1 = str.toCharArray();
        System.out.println(str1);
        for(int i = str1.length - 1; i>=0;i--){
            System.out.print(str1[i]);
        }
    }
}