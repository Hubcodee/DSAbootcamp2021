import java.util.Scanner;
public class Distance{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x1.x2,y1,y2");
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();
        double y1 = s.nextDouble();
        double y2 = s.nextDouble();
        double dist = Math.pow(0.5,Math.pow(2,(y2-y1))+Math.pow(2,(x2-x1)));
        System.out.printf("Distance: %.2f",dist);
    }
}