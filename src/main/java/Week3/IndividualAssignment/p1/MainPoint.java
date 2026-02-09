package IndividualAssignmentWeek3.p1;

/*
    Kevin G Flores
    CS122
    1/24/26

    Problem 1 - Prints a point in a graph while answering if it's in the origin and the distance between the two points.
*/

public class MainPoint {
    public static void main(String[] args){
        Point newPoint = new Point(1,5);
        System.out.println(newPoint.toString());
        System.out.println(newPoint.isLocatedAtOrigin());
        System.out.println(newPoint.distance(-2,1));

        Point atOrigin = new Point();
        System.out.println(atOrigin.toString());
        System.out.println(atOrigin.isLocatedAtOrigin());
        System.out.println(atOrigin.distance(0,0));
    }
}
