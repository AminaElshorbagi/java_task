public class cylinder extends circul{

   static double higth;
    static double cylinder_area;
    public cylinder(){

        System.out.println("Enter the higth of cylinder: ");
        higth=Main.input.nextDouble();
        display_area();



    }
      public static void display_area(){
          cylinder_area=2*area*higth;
          System.out.println("Area of the cylinder = "+cylinder_area);

    }
}
