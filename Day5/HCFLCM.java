import java.util.Scanner;
public class HCFLCM{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n1p = n1;
        int n2p = n2;
        while(n1!=n2){
            if(n1>n2){
                n1 = n1-n2;
            }
            else if (n1<n2) {
                n2 = n2 - n1;
            }
        }
        int hcf=n1;
        int lcm = (n1p*n2p)/hcf;
        System.out.println(hcf);
        System.out.println(lcm);
    }
}