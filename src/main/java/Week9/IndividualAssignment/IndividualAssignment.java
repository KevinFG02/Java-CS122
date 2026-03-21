package Week9.IndividualAssignment;

import java.util.Arrays;

public class IndividualAssignment {
    public static void main(String[] args){
        /*
        oddNumbers(21);
        oddNumbers(16);
        oddNumbers(0);
        oddNumbers(-11);

        System.out.println(vowels("are we there yet?"));
        System.out.println(vowels("the moon"));
        System.out.println(vowels("rhythm"));
        System.out.println(vowels(""));

        System.out.println(palindrome("deed"));
        System.out.println(palindrome("racecar"));
        System.out.println(palindrome("macadam"));*/

        System.out.println(smallest(new int[] {16,4,12,2,10}));
        System.out.println(smallest(new int[] {-2,0,3,-3,2,-3,-1}));
        System.out.println(smallest(new int[] {}));
    }

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
}
