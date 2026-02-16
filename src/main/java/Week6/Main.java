package Week6;

import java.util.Random;

/*
    Kevin Flores
    2/15/16
    CS122
 */

public class Main {
    public static void main(String[] args){
        Random randomPick = new Random();
        Mover newMover = new Mover();
        // Get all directions
        Direction[] allDirections = Direction.values();
        int arraySize = allDirections.length;
        Direction randomDirection = allDirections[randomPick.nextInt(arraySize)];
        newMover.move(randomDirection);

        // Move 10 times
        newMover.move10Times();
    }
}
