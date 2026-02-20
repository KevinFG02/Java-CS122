package Week6.FridayLab;

import java.util.Random;

public class Mover {
    // Fields
    private int x = 0;
    private int y = 0;
    private int totalCost = 0;

    // Methods
    public void move(Direction direction){
        switch (direction){
            case NORTH:
                // Code
                y++;
                totalCost = Direction.NORTH.getCost() + totalCost;
                System.out.println("Moved up. Cost:" + Direction.NORTH.getCost());
                System.out.println("_____________________");
                break;
            case SOUTH:
                // Code
                y--;
                totalCost = Direction.SOUTH.getCost() + totalCost;
                System.out.println("Moved down. Cost:" + Direction.SOUTH.getCost());
                System.out.println("_____________________");
                break;
            case EAST:
                // Code
                x++;
                totalCost = Direction.EAST.getCost() + totalCost;
                System.out.println("Moved east. Cost:" + Direction.EAST.getCost());
                System.out.println("_____________________");
                break;
            case WEST:
                // Code
                x--;
                totalCost = Direction.WEST.getCost() + totalCost;
                System.out.println("Moved west. Cost:" + Direction.WEST.getCost());
                System.out.println("_____________________");
                break;
        }
    }

    public void move10Times() {
        for(int i = 0; i < 10; i++){
            Random randomPick = new Random();
            Direction[] allDirections = Direction.values();
            int arraySize = allDirections.length;
            Direction randomDirection = allDirections[randomPick.nextInt(arraySize)];
            move(randomDirection);
        }

        System.out.println("Position: " + x + ", " + y);
        System.out.println("Accumulated Cost: " + totalCost);
    }

    public boolean isExpensiveMove(Direction direction) {
        if(direction.getCost() >= 6){
            return true;
        } else {
            return false;
        }
    }


}
