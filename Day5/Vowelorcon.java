import java.util.Scanner;
public class Vowelorcon{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String chr =s.next();
        if (chr != "a" || chr!= "e" || chr!="i" || chr!="o" || chr!= "u" ){
            System.out.println("Consonant");
        }
        else{
            System.out.println("Vowel");
        }
    }
}