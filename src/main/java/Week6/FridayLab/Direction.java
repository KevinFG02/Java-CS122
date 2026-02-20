package Week6.FridayLab;

public enum Direction {
    NORTH(5),
    SOUTH(6),
    EAST(4),
    WEST(7);

    // Fields
    private int cost;

    // Constructor
    private Direction(int cost){
        this.cost = cost;
    }

    public int getCost(){
        return this.cost;
    }
}