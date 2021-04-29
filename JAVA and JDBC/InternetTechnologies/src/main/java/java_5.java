import java.util.Scanner;

public class java_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nThis program tells" +
                " if the given INPUT is a number" +
                " or not");
        checkInput(sc, "\nEnter First Number: ");
        checkInput(sc, "\nEnter Second Number: ");
    }

    private static void checkInput(Scanner sc, String s) {
        try {
            System.out.print(s);
            String a = sc.nextLine();
            int parsedValue1 = Integer.parseInt(a);
            System.out.println("\nThe INPUT => " +
                    parsedValue1 +
                    " you gave is a Number");
        } catch (NumberFormatException ex) {
            System.out.println("Your INPUT => " +
                    ex.getMessage() +
                    " is not a Number");
        }
    }

}
