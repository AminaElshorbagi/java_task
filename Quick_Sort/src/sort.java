import java.util.Scanner;
public class sort {
    static Scanner input = new Scanner(System.in);
    static int [] array;
    public static void main (String[] args)
    {
        System.out.println("Enter the size of the array...");
        int size = input.nextInt();
        array = new int [size];
        fill();
        quickSort();
        display();
    }
    static void fill ()
    {
        for (int i=0 ; i<array.length; i++)
        {
            System.out.println("Enter\t"+ (i+1)+ "\t element in the array...");
            array[i]=input.nextInt();
        }
    }
    static void quickSort ()
    {
        for (int i=0; i<array.length;i++)
        {
            for (int j=i+1; j<array.length;j++)
            {
                if (array[i]>array[j])
                {
                    int N = array[i];
                    array[i]=array[j];
                    array[j]=N ;
                }
            }
        }
    }
    static void display ()
    {
        System.out.println("quick sort of this array is...");
        for(int value: array)
        {
            System.out.print(value+"\t");
        }
    }
}
