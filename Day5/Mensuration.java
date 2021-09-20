import java.util.Scanner;
public class Mensuration{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        while(true){
            System.out.println("1.Area\n2.Permeter\n3.Volume\n4.Curved Surface area of cylinder\n5.Total Surface area of cube");
            int domain = obj.nextInt();
            if (domain == 1) {
                System.out.println("Area Calculator");
                System.out.println("1.Circle\n2.Triangle\n3.rectangle\n4.Isosceles Triangle\n5.Parallelogram\n6.Rhombus");
                System.out.print("7.Equilateral Triangle");
                double area =0;
                while (true) {
                    System.out.print("Choose #:: ");
                    int ch = obj.nextInt();
                    if (ch == 1) {
                        System.out.println("Enter Radius :: ");
                        double r = obj.nextDouble();
                        area = Math.PI * (r * r);
                    } else if (ch == 2 || ch == 4) {
                        System.out.println("Enter Height and Base :: ");
                        double h = obj.nextDouble();
                        double b = obj.nextDouble();
                        area = 0.5 * (b * h);
                    } else if (ch == 3 || ch == 5) {
                        System.out.println("Enter Length and Breadth :: ");
                        double l = obj.nextDouble();
                        double b = obj.nextDouble();
                        area = b * l;
                    } else if (ch == 6) {
                        System.out.println("Enter diagonal 1 and diagonal 2 :: ");
                        double d1 = obj.nextDouble();
                        double d2 = obj.nextDouble();
                        area = 0.5 * (d1 * d2);

                    } else if (ch == 7) {
                        System.out.println("Enter side :: ");
                        double s = obj.nextDouble();
                        area = ((Math.pow(0.5, 3)) / 4) * (Math.pow(2, s));
                    } else if (ch == 0) {
                        System.out.println("Exiting...");
                        break;
                    } else {
                        System.out.println("Invalid Input");
                    }
                    System.out.println(area);
                }
            } else if (domain == 2) {
                System.out.println("Perimeter Calculator");
                System.out.println("1.Circle\n2.Equilateral Triangle\n3.rectangle\n4.Parallelogram\n5.Rhombus");
                double perim=0;
                while (true) {
                    System.out.print("Choose #:: ");
                    int ch = obj.nextInt();
                    if (ch == 1) {
                        System.out.println("Enter Radius :: ");
                        double r = obj.nextDouble();
                        perim = 2 * Math.PI * r;
                    } else if (ch == 2) {
                        System.out.println("Enter side :: ");
                        double a = obj.nextDouble();
                        perim = 3 *  a;
                    } else if (ch == 3 || ch == 4) {
                        System.out.println("Enter Length and Breadth :: ");
                        double l = obj.nextDouble();
                        double b = obj.nextDouble();
                        perim = 2 * (b + l);
                    } else if (ch == 5) {
                        System.out.println("Enter side :: ");
                        double d1 = obj.nextDouble();
                        perim = 4 * d1;

                    } else if (ch == 0) {
                        System.out.println("Exiting...");
                        break;
                    } else {
                        System.out.println("Invalid Input");
                    }
                    System.out.println(perim);
                }
            } else if (domain == 3) {
                System.out.println("Perimeter Calculator");
                System.out.println("1.Cone\n2.Prism\n3.Cylinder\n4.Sphere\n5.Pyramid");
               double volume=0;
                while(true){
                    System.out.print("Choose #:: ");
                    int ch = obj.nextInt();
                    if (ch == 1) {
                        System.out.println("Enter Radius and height :: ");
                        double r = obj.nextDouble();
                        double h = obj.nextDouble();
                        volume = (1 / 3) * Math.PI * r * r * h;
                    } else if (ch == 2) {
                        System.out.println("Enter length ,breadth,height:: ");
                        double a = obj.nextDouble();
                        double b = obj.nextDouble();
                        double c = obj.nextDouble();
                        volume = (a * b * c);
                    } else if (ch == 3) {
                        System.out.println("Enter radius and heigth :: ");
                        double r = obj.nextDouble();
                        double h = obj.nextDouble();
                        volume = Math.PI * r * r * h;
                    } else if (ch == 4) {
                        System.out.println("Enter radius :: ");
                        double r = obj.nextDouble();
                        volume = (4 / 3) * Math.PI * r * r * r;

                    } else if (ch == 5) {
                        System.out.println("Enter length ,breadth,height:: ");
                        double a = obj.nextDouble();
                        double b = obj.nextDouble();
                        double c = obj.nextDouble();
                        volume = (a * b * c) / 3;

                    } else if (ch == 0) {
                        System.out.println("Exiting...");
                        break;
                    } else {
                        System.out.println("Invalid Input");
                    }
                    System.out.println(volume);
                }
            } else if (domain == 4) {
                System.out.println("Enter radius ,height:: ");
                double r = obj.nextDouble();
                double h = obj.nextDouble();
                double csa = 2 * Math.PI * r * h;
                System.out.println(csa);
            } else if (domain == 5) {
                System.out.println("Enter Side :: ");
                double a = obj.nextDouble();
                double tsa = 6 * a * a;
                System.out.println(tsa);
            }
            else{
                System.out.println("Exiting..");
                break;
            }

        }
    }

}