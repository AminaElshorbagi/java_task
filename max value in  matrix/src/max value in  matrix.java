import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        System.out.println("enter the array size :");
        int i=input.nextInt();
        int arr[]=new int[i];
        for (int x=0;x<i;x++){
            System.out.println("enter item of ["+(x+1)+"]");
            arr[x]=input.nextInt();
        }
        int max =arr[0];
        for (int x=0;x<i;x++){
            if (arr[x] >  max) {
                max = arr[x];
            }
        }
        System.out.println("the max value is :"+max);

    }
}