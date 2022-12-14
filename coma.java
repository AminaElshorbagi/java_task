import java.util.Scanner;
public class coma {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string...");
        String str = input.nextLine();
        String[] arr = str.split(",");
        display(arr);
    }

    public static void display(String [] array)
    {
        System.out.println("the string without coma is... ");
        for (String value : array)
        {
            System.out.print(value+"\t");
        }
    }
}
