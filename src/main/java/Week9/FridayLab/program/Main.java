package Week9.FridayLab.program;

import Week9.FridayLab.toys.MagicEightBall;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main
{
    public static void main(String[] args)
    {
        //ask the user for 5 messages
        Console messages = new Console();

        String[] messagesBall = messages.getStrings("Enter a message",5);

        try{
            MagicEightBall eightBall = new MagicEightBall(messagesBall, 4);
            messages.println("Shake ball 5 times.");
            System.out.println(Arrays.toString(eightBall.getSides()));
            System.out.println(eightBall.getMessageIndex());
            System.out.println(eightBall);
            System.out.println(eightBall.changeMessage());
            System.out.println(Arrays.toString(eightBall.changeMessage(1)));
        } catch(NoSuchElementException ex){
            System.out.println("Array is empty. " + ex);
        } catch (IllegalArgumentException ex){
            System.out.println("Parameter is not positive. " + ex);
        } catch (IndexOutOfBoundsException ex){
            System.out.println("Message-Index is out of bounds from the array." + ex);
        }

        //create the magic eight-ball and test it
        //MagicEightBall eightBall = new MagicEightBall(messagesBall, 4);
        //messages.println("Shake ball 5 times.");
        //System.out.println(Arrays.toString(eightBall.getSides()));
        //System.out.println(eightBall.getMessageIndex());
        //System.out.println(eightBall);
        //System.out.println(eightBall.changeMessage());
        //System.out.println(Arrays.toString(eightBall.changeMessage(1)));
        //System.out.println(Arrays.toString(eightBall.changeMessage(-1)));

        //MagicEightBall eightBall2 = new MagicEightBall(messagesBall, 8);

        //String[] testingEx = {};
        //MagicEightBall eightBall2 = new MagicEightBall(testingEx, 0);
    }
}