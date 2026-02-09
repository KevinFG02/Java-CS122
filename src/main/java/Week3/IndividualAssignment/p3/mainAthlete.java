package IndividualAssignmentWeek3.p3;
import java.util.Random;

/*
    Kevin G Flores
    CS122
    1/24/26

    Problem 5 - Prints information of football players.
*/

public class mainAthlete {
    public static void main(String[] args){
        String[] firstNames = {"Jake","Toby","Daniel","Will","Leo","Drake","Rick","Bob","Michael","Robert"};
        String[] lastNames = {"James","Smith","Park","San","Dixon","Grimes","Gonzalez","Todd","Williams","Lee"};
        String[] positions = {"Quarterback","Cornerback","Defensive End","Linebacker","Defensive Tackle","Tight End","Wide Receiver"};

        Random randomInt = new Random();
        for(int i = 0; i < 10; i++){
            int randomNumber1 = randomInt.nextInt(10);
            int randomNumber2 = randomInt.nextInt(10);
            int randomNumber3 = randomInt.nextInt(positions.length);

            Athlete athlete = new Athlete(firstNames[randomNumber1],lastNames[randomNumber2],positions[randomNumber3],"Football");
            System.out.println(athlete.toString());
        }
    }
}
