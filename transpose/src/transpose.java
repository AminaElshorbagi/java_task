import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("project for transpose matrix");
        System.out.println("enter the dimention of matrix :  ");
       int row =input.nextInt();
       int column=input.nextInt();
       int[][]m=new int[column][row];
       for (int i=0;i<row;i++){
           for (int j=0;j<column;j++){
               System.out.println("enter the item of ["+(i+1)+"]["+(j+1)+"]");
               m[j][i]=input.nextInt(); //
           }
       }

        System.out.println("result:");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(m[j][i]+"  ");
            }
            System.out.println(" ");
        }

    }
}