import java.util.Scanner;
public class Elecbill{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int unit = scan.nextInt();
        double amt = 1;
        double sur_charge=0;
        double total_amt=0;
        if(unit <= 50)
        {
            amt = unit * 0.50;
        }
        else if(unit <= 150)
        {
            amt = 25 + ((unit-50) * 0.75);
        }
        else if(unit <= 250)
        {
            amt = 100 + ((unit-150) * 1.20);
        }
        else
        {
            amt = 220 + ((unit-250) * 1.50);
        }


        sur_charge = amt * 0.20;
        total_amt  = amt + sur_charge;

        System.out.println("Electricity Bill = Rs. "+total_amt);

    }
}