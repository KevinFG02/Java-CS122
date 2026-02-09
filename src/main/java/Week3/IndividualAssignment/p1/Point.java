package Week3.IndividualAssignment.p1;

public class Point {
    private double x;
    private double y;

    public Point(){
        this(0.0,0.0);
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    private double getX(){return x;}

    private void setX(double x){this.x = x;}

    private double getY(){return y;}

    private void setY(double y){this.y = y;}

    public boolean isLocatedAtOrigin(){
        double xPoint = this.x;
        double yPoint = this.y;

        if(xPoint == 0.0 && yPoint == 0.0){
            return true;
        } else {
            return false;
        }
    }

    public double distance(double x, double y){
        double xPoint = this.x;
        double yPoint = this.y;

        double distance = Math.sqrt(Math.pow((x - xPoint),2) + Math.pow((y - yPoint),2));
        return distance;
    }

    @Override
    public String toString(){
        return "Point - x:" + x + " , y:" + y;
    }
}
