
public class circul {
    static double radious;
    static double area;
    public circul(){
        System.out.println("Enter the radious of the circul : ");
        radious= Main.input.nextDouble();
       display_carea();

    }
    public static void display_carea(){
        area=Math.PI*radious*radious;
        System.out.println("Area of the cylinder = "+area);

    }


}
