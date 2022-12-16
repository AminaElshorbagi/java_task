import java.util.Scanner;
public class program {
    public static void main(String[] args)
    {
        Scanner inputs = new Scanner(System.in);
        int n , r ;
        System.out.println("Enter n...");
        n=inputs.nextInt();
        System.out.println("Enter r...");
        r=inputs.nextInt();
        System.out.println("the combination is \t" +( factorial(n)/(factorial(r)*factorial(n,r))));
        System.out.println("the permutation is\t"+( factorial(n)/factorial(n,r)));
    }
    public static int factorial (int num )
    {
        int x =1;
        for (int i=2 ; i<=num ; i++)
            x*=i;
        return x;
    }
    public static int factorial (int num1 , int num2 )
    {
        int x=1;
        for (int i=2 ; i<=(num1-num2) ; i++)
            x*=i;
        return x;
    }
}
