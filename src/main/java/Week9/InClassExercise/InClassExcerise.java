package Week9.InClassExercise;

public class InClassExcerise {
    public static void main(String[] args){
        System.out.println(bunnyEars(5) + " Bunny Ears");
        System.out.println(crazyBunnyEars(5) + " Bunny Ears");
        System.out.println(checkParens("(((())))"));
        System.out.println(countHi("sjndkjnhishdhihu ushi"));
        System.out.println(sumDigits(1245));
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
    public static boolean checkParens(String parens){
        int lengthOfWord = parens.length();

        if(lengthOfWord <= 2){
            if(lengthOfWord == 2){
                if(parens.charAt(0) == '(' && parens.charAt(parens.length() - 1) == ')'){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            boolean condition1;
            boolean condition2;
            String paren1 = parens.substring(0);
            String paren2 = paren1.substring(1, parens.length() - 1);
            condition1 = checkParens(paren2);

            char firstChar = parens.charAt(0);
            char lastChar = parens.charAt(parens.length() - 1);

            if(firstChar == '(' && lastChar == ')'){
                condition2 = true;
            } else {
                condition2 = false;
            }

            if(condition1 && condition2){
                return true;
            } else {
                return false;
            }
        }
    }

    // Problem 4
    public static int countHi(String word){
        int lengthOfWord = word.length();

        if(lengthOfWord <= 1){
            return 0;
        } else {
            int counterHi = countHi(word.substring(0, word.length() - 1));

            char firstChar = word.charAt(word.length() - 2);
            char secondChar = word.charAt(word.length() - 1);

            if(firstChar == 'h' && secondChar == 'i'){
                counterHi = counterHi + 1;
            }

            return counterHi;
        }
    }

    // Problem 5
    public static int sumDigits(int number){
        if(Integer.toString(number).length() <= 1){
            return number;
        } else {
            int integer = number % 10;
            int shortNumber = number / 10;
            int newNumber = sumDigits(shortNumber);

            return integer + newNumber;
        }
    }
}
