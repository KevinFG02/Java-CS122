package Week9.IndividualAssignment;

import java.util.Arrays;

/**
 * A program that uses recursion to solve tasks.
 * @author Kevin Flores
 * @version 1.0
 *
 * Created on 3/20/26
 */

public class IndividualAssignment {
    public static void main(String[] args){
        // Problem 1
        oddNumbers(21);
        oddNumbers(16);
        oddNumbers(0);
        oddNumbers(-11);

        // Problem 2
        System.out.println(vowels("are we there yet?"));
        System.out.println(vowels("the moon"));
        System.out.println(vowels("rhythm"));
        System.out.println(vowels(""));

        // Problem 3
        System.out.println(palindrome("deed"));
        System.out.println(palindrome("racecar"));
        System.out.println(palindrome("macadam"));

        // Problem 4
        System.out.println(smallest(new int[] {16,4,12,2,10}));
        System.out.println(smallest(new int[] {-2,0,3,-3,2,-3,-1}));
        System.out.println(smallest(new int[] {}));

        // Problem 9
        System.out.println(removeAll("mellow yellow", "ello"));
        System.out.println(removeAll("the moon was brooding", "o"));
        System.out.println(removeAll("madam", "map"));
        System.out.println(removeAll("barmy", "bar"));
        System.out.println(removeAll("barfoo", "foo"));

        // Problem 12
        pyramid(2);
        pyramid(3);
        pyramid(5);

        // Problem 14
        System.out.println(longestWord(new String[] {"and","ass","abba","are"}));
        System.out.println(longestWord(new String[] {}));
        System.out.println(longestWord(new String[] {"here"}));
        System.out.println(longestWord(new String[] {"there","then","to","their","together"}));

    }

    // Recursion Methods
    // Problem 1
    public static void oddNumbers(int start){
        if(start <= 0){
            System.out.println();
        } else {
            oddNumbers(start - 1);

            if(start % 2 != 0){
                System.out.println(start);
            }
        }
    }

    // Problem 2
    public static int vowels(String check){
        if(check.length() == 0){
            return 0;
        } else {
            char subString = check.charAt(0);
            int count = vowels(check.substring(1));
            if(subString == 'a' || subString == 'e' || subString == 'i' || subString == 'o' || subString == 'u'){
                count = count + 1;
            }

            return count;
        }
    }

    // Problem 3
    public static boolean palindrome(String input){
        if(input.length() <= 1){
            return true;
        } else {
            boolean condition1;
            boolean condition2 = palindrome(input.substring(1,input.length() - 1));

            if(input.charAt(0) == input.charAt(input.length() - 1)){
                condition1 = true;
            } else {
                condition1 = false;
            }

            if(condition1 && condition2){
                return true;
            } else {
                return false;
            }
        }
    }

    // Problem 4
    public static int smallest(int[] smallest){
        if(smallest.length <= 1){
            if(smallest.length == 1){
                return smallest[0];
            } else {
                throw new IllegalArgumentException("Array has no elements.");
            }
        } else {
            int lastElement = smallest[smallest.length - 1];
            int[] compareIntArray = Arrays.copyOf(smallest, smallest.length - 1);
            int compareNumber = smallest(compareIntArray);

            if(lastElement < compareNumber){
                return lastElement;
            } else {
                return compareNumber;
            }
        }
    }

    // Problem 9
    public static String removeAll(String source, String search){

        if(source.indexOf(search) == -1){
            return source;
        } else {
            String newSubString;
            int newSubStringIndex = source.indexOf(search);


            if(newSubStringIndex == 0){
                newSubString = source.substring(search.length());
            } else if(newSubStringIndex == (source.length() - search.length())) {
                newSubString = source.substring(0, newSubStringIndex);
            } else {
                newSubString = source.substring(0, newSubStringIndex) + source.substring(newSubStringIndex + (search.length()));
            }

            return removeAll(newSubString, search);
        }
    }

    // Problem 12
    public static void pyramid(int height){
        if(height <= 1){
            if(height == 1){
                System.out.println("*");
            } else {
                System.out.println(" ");
            }
        } else {
            pyramid(height-1);

            for(int i = 1; i < height * 2; i++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Problem 14
    public static String longestWord(String[] words){
        if(words.length <= 1){
            if(words.length == 1){
                return words[0];
            } else {
                return null;
            }
        } else {
            String lastWord = words[words.length - 1];
            String[] compareWordArray = Arrays.copyOf(words, words.length - 1);
            String compareString = longestWord(compareWordArray);

            if(lastWord.length() < compareString.length()){
                return compareString;
            } else {
                return lastWord;
            }
        }
    }
}
