package Week3.FridayLab;

public class Point {
    //Fields
    //Instance Fields
    private double xpoint;
    private double ypoint;

    //Static Fields
    private static int pointCount;

    //Constructors
    public Point(double x, double y){
        this.xpoint = x;
        this.ypoint = y;

        pointCount++;
    }

    //Methods
    public double getXpoint(){
        return this.xpoint;
    }

    public double getYpoint(){
        return this.ypoint;
    }

    public String toString(){
        return "x: " + xpoint + " y: " + ypoint;
    }

    //Static Methods
    public static void foo(){
        //Cannot access non static fields (instances) or non static methods
        //System.out.println("x: " + xpoint + " y: " + ypoint);
        //System.out.println(toString());

        //Can access static fields and methods
        System.out.println(pointCount);
        System.out.println(getPointCount());
    }

    public static int getPointCount(){
        return pointCount;
    }

    public static boolean isOrigin(Point point){
        if (point.xpoint == 0 && point.ypoint == 0){
            return true;
        } else {
            return false;
        }
    }
}
