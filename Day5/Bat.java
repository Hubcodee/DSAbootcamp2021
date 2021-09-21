import java.util.Scanner;
public class Bat{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Total Runs: ");
        int runs = obj.nextInt();
        System.out.print("No. of times out: ");
        int o = obj.nextInt();
        System.out.print("Batting avg: "+runs/o);
    }
}