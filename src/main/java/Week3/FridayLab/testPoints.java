package Week3.FridayLab;

public class testPoints {
    public static void main(String[] args){
        Point point1 = new Point(10,10);
        Point point2 = new Point(30,20);
        Point origin = new Point(0,0);

        System.out.println(point1);
        System.out.println(point2);

        // No object required to invoke static method
        System.out.println(Point.isOrigin(origin));

        // Accessing a static method in a static way
        System.out.println("Point Counts: " + Point.getPointCount());

        Point.foo();
    }
}
