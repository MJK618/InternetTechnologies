import java.util.Scanner;

// Shape Class
class Shape {
    int x;
    int y;

    void getcoord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinates of (x,y): ");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    void showcoord() {
        System.out.print("Coordinates are: (" + x + ", "
                + y + ")");

    }
}

class Rect extends Shape {
    int length = 10;
    int breadth = 20;

    void showCorrd() {
        System.out.println("\nLength of Rectangle is : "
                + length + " and  Breadth is : " + breadth);
    }
}

public class java_7 {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("\n\t-- This program will" +
                " demonstrate dynamic method dispatch concept." +
                " --\n");
        s.getcoord();
        s.showcoord();
        s = new Rect();
        //((Rect) s).showCorrd();
        newMethod((Rect) s);

    }

    private static void newMethod(Rect s) {
        s.showCorrd();
    }
}