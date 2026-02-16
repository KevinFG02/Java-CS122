package Week6;

import Week6.Direction;
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
                break;
            case SOUTH:
                // Code
                y--;
                totalCost = Direction.SOUTH.getCost() + totalCost;
                System.out.println("Moved down. Cost:" + Direction.SOUTH.getCost());
                break;
            case EAST:
                // Code
                x++;
                totalCost = Direction.EAST.getCost() + totalCost;
                System.out.println("Moved east. Cost:" + Direction.EAST.getCost());
                break;
            case WEST:
                // Code
                x--;
                totalCost = Direction.WEST.getCost() + totalCost;
                System.out.println("Moved west. Cost:" + Direction.WEST.getCost());
                break;
        }
    }

    public void move10Times() {
        Random randomNum = new Random();
        int randomNumber = randomNum.nextInt(5) + 1;
        Direction randomDirection;

        if (randomNumber == 1){
            randomDirection = Direction.NORTH;
        } else if (randomNumber == 2) {
            randomDirection = Direction.SOUTH;
        } else if (randomNumber == 3) {
            randomDirection = Direction.EAST;
        } else {
            randomDirection = Direction.WEST;
        }

        for(int i = 0; i < 10; i++){
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
