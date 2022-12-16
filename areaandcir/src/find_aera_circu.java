public class area {
    public static void circule_area(int r){
        double ar = r*r*3.14;
        System.out.println("circul area ="+ar);
    }
    public static void circumference(int r){
        double fer = 2*r*3.14;
        System.out.println("circumference ="+fer);
    }
    public static void triangle_perimeter(int x,int y,int z){
        int perimeter=x+y+z;
        System.out.println("perimeter of the triangle="+perimeter);

    }
    public static void triangle_area(int x,int y){
        double area =  (0.5*x*y);
        System.out.println("triangle_area= "+area);

    }
}
