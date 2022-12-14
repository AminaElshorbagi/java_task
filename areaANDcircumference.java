import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("choose the shape:");
        System.out.println("1) circule");
        System.out.println("2)triangle");
        int in  =input.nextInt();
        switch (in){
            case 1:
                System.out.println("choose the operation:");
                System.out.println("1)circule_area ");
                System.out.println("2)circumference");
                int in2  =input.nextInt();
                switch (in2) {
                    case 1:
                        System.out.println("enter the radius:");
                        int r = input.nextInt();
                        area.circule_area(r);
                        break;
                    case 2:
                        System.out.println("enter the radius:");
                        int r2 = input.nextInt();
                        area.circumference(r2);
                        break;
                    default:
                        System.out.println("try again");
                }

                break;

            case 2:
                System.out.println("choose the operation:");
                System.out.println("1)triangle_area ");
                System.out.println("2)triangle_perimeter");
                int in3  =input.nextInt();
                switch (in3){
                    case 1:
                        System.out.println("enter the hight and base:");
                        int h=input.nextInt();
                        int b=input.nextInt();
                        area.triangle_area(h,b);
                        break;
                    case 2:
                        System.out.println("enter the sides of triangle:");
                        int x=input.nextInt();
                        int y=input.nextInt();
                        int z=input.nextInt();
                        area.triangle_perimeter(x,y,z);
                        break;
                    default:
                        System.out.println("try again");

                }
                break;
            default:
                System.out.println("try again");

        }

    }
}