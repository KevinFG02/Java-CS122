package Week1;
import java.util.Scanner;

public class Jan9FridayLab {
    public static void main(String[] args) {
        Scanner inputUserInfo = new Scanner(System.in);
        System.out.println("Type your age: ");
        int AGE = inputUserInfo.nextInt();
        System.out.println("Type your favorite past time: ");
        String pastTime = inputUserInfo.next();
        System.out.println("Type a number: ");
        int count = inputUserInfo.nextInt();

        int movieCount = 0;
        boolean stopAnswering = false;
        String[] favMovies = new String[0];

        while (stopAnswering == false){
            System.out.println("Type your favorite past time: ");
            String inputMovie = inputUserInfo.next();
            if (inputMovie == "Stop"){
                stopAnswering = true;
            } else {
                favMovies[movieCount] = inputMovie;
            }
            movieCount++;
        }

        System.out.println("Your age is " + AGE);
        myFavoritePastTime(pastTime, count);
    }

    public static void myFavoritePastTime(String pastTimeString, int pastTimeCount){
        for (int i = 1; i < pastTimeCount; i++){
            System.out.println(pastTimeString);
        }
    }

    public static int myFavoriteMovies(String[] moviearray) {

    }
}
