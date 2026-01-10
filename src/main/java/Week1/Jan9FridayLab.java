package Week1;
import java.util.Arrays;
import java.util.Scanner;

// Kevin G Flores
// Friday Lab - Week 1
// Winter CS122

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

        System.out.println("Type 'Stop' if you want stop this session.");
        while (!stopAnswering){
            System.out.println("Type your favorite movies: ");
            String inputMovie = inputUserInfo.next();
            if (inputMovie.equals("Stop")){
                stopAnswering = true;
            } else {
                movieCount++;
                favMovies = Arrays.copyOf(favMovies, movieCount);
                favMovies[movieCount - 1] = inputMovie;
            }
        }

        System.out.println("Your age is " + AGE);
        System.out.println();
        myFavoritePastTime(pastTime, count);
        System.out.println();
        int totalCountMovies = myFavoriteMovies(favMovies);
        System.out.println("Total Movies: " + totalCountMovies);
    }

    public static void myFavoritePastTime(String pastTimeString, int pastTimeCount){
        for (int i = 1; i < pastTimeCount; i++){
            System.out.println(pastTimeString);
        }
    }

    public static int myFavoriteMovies(String[] movieArray) {
        int numMovies = movieArray.length;
        for(int j = 1; j < numMovies; j++) {
            System.out.println("Movie " + j + ": " + movieArray[j-1]);
        }

        return numMovies;
    }
}
