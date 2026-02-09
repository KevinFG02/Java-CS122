package IndividualAssignmentWeek3.p5;

/*
    Kevin G Flores
    CS122
    1/24/26

    Problem 8 - Prints all rational numbers using fractions.
*/

public class mainRational {
    public static void main(String[] args){
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                if(i%j == 0){
                    //System.out.print(i + "/" + j + " ");
                    Rational fraction = new Rational(i,j);
                    System.out.print(fraction.toString());
                }
            }
            System.out.println();
        }
    }
}
