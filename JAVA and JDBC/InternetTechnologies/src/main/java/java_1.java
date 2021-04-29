import java.util.Scanner;
public class java_1
{
    public static void main(String[] args)
    {
        int n=10, comp;
        Scanner s = new Scanner(System.in);
        System.out.println("--- This program will print " +
                "the numbers equal, greater and lesser " +
                "than a given input number out of another" +
                " 10 input integers ---");
        System.out.println("\nEnter the number to " +
                "compare with: ");
        comp = s.nextInt();

        System.out.print("Enter 10 elements that " +
                "are to be compared.\n");
        int[] a = new int[n];
        System.out.println("Enter elements of array: ");

        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        int greater = 0;
        int lesser = 0;
        int equal = 0;
        for(int i = 0; i < n; i++)
        {
            if (a[i]==comp){
                equal += 1;
            } else if(a[i] > comp){
                greater += 1;
            }else{
                lesser += 1;
            }

        }
        System.out.println("Count of numbers greater" +
                " than " + comp + ": " + greater);
        System.out.println("Count of numbers equal" +
                " to " + comp + ": " + equal);
        System.out.println("Count of numbers lesser" +
                " than " + comp + ": " + lesser);
    }
}
