import java.util.Scanner;

class OverloadClass {
    void area(double x, double y)     // Cylinder
    {
        double t = (2 * 3.14 * x * y) + (2 * 3.14 * x * x);
        System.out.println("=> The area of the " +
                "Cylinder is " + t + " sq. units.\n");
    }

    void area(float x, float y) {
        System.out.println("=> The area of the" +
                " Rectangle is " + x * y + " sq. units.\n");
    }

    void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("=> The area of the" +
                " Circle is " + z + " sq. units.\n");
    }
}

public class java_3 {
    public static void main(String[] args) {
        OverloadClass ob = new OverloadClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n -- This program is" +
                " Menu-driven and calculates Area of" +
                " using Method Overloading -- \n");
        int choice = 10;
        while (choice != 0) {
            System.out.print("1.Area of Cylinder " +
                    "\n2.Area of Rectangle " +
                    "\n3.Area of Circle " +
                    "\nPress 0 to QUIT " +
                    "\n\nEnter Menu Option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter dimensions" +
                            " for cylinder (Radius, " +
                            "Height): ");
                    double n1 = sc.nextDouble();
                    double n2 = sc.nextInt();
                    ob.area(n1, n2);
                    break;

                case 2:
                    System.out.println("\nEnter dimensions" +
                            " for Rectangle (Length, " +
                            "Breadth): ");
                    float n3 = sc.nextFloat();
                    float n4 = sc.nextFloat();
                    ob.area(n3, n4);
                    break;

                case 3:
                    System.out.println("\nEnter Radius " +
                            "for Circle: ");
                    double n5 = sc.nextDouble();
                    ob.area(n5);
                    break;

                case 0:
                    System.out.println("\nPROGRAM ENDED");
                    break;

                default:
                    System.out.println("\nINVALID INPUT" +
                            " TRY AGAIN!!!\n");
            }
        }
    }
}

