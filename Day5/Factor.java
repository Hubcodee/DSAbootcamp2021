import java.util.Scanner;
public class Factor{
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int inp = obj.nextInt();
//        for(int i=1;i<=inp;i++){
//            if(inp%i==0){
//                System.out.print(i + " ");
//            }
//        }
        int i=1;
        while(i<=inp){
            if(inp%i==0){
                System.out.print(i + " ");
            }
            i+=1;
        }
    }
}