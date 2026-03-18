package Week9.InClassExercise;

public class InClassExcerise {
    public static void main(String[] args){
        System.out.println(bunnyEars(5) + " Bunny Ears");
        System.out.println(crazyBunnyEars(5) + " Bunny Ears");
    }

    // Problem 1
    public static int bunnyEars(int numOfBunnies){
        if (numOfBunnies <= 1) {
            if (numOfBunnies == 1){
                return 2;
            } else {
                return 0;
            }
        } else {
            int totalBunnyEars = bunnyEars(numOfBunnies - 1) + 2;
            return totalBunnyEars;
        }
    }

    // Problem 2
    public static int crazyBunnyEars(int numOfBunnies){
        if (numOfBunnies <= 1) {
            if (numOfBunnies == 1){
                return 2;
            } else {
                return 0;
            }
        } else {
            int totalBunnyEars = crazyBunnyEars(numOfBunnies - 1);

            if(numOfBunnies % 2 == 0){
                totalBunnyEars = totalBunnyEars + 3;
            } else {
                totalBunnyEars = totalBunnyEars + 2;
            }

            return totalBunnyEars;
        }
    }

    // Problem 3

    // Problem 5
    public static int sumDigits(int number){
        if(Integer.toString(number).length() <= 1){
            return number;
        } else {
            int newNumber;
            int shortNumber = number / 10;
            if(Integer.toString(number).length() < 2){
                newNumber = sumDigits(shortNumber);
            }
            int shortNumber2 = number % 10;

        }
    }
}
