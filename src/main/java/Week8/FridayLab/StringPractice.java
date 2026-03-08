package Week8.FridayLab;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args){
        String str = "Central Processing Unit";
        //System.out.println(getAcronym(str));
        //int[] len = countLength(str);
        //System.out.println(Arrays.toString(len));
        System.out.println(LongestWord(str));
        System.out.println(countWords(str));
        System.out.println(countLetters(str));
        System.out.println(countVowls(str));
    }

    public static String getAcronym(String str){
        String[] words = str.split(" ");
        //String result = "";
        StringBuilder stringBuilder = new StringBuilder();

        for(String word : words){
            //result = result + word.charAt(0);
            stringBuilder.append(Character.toUpperCase(word.charAt(0)));
        }
        //return result.toUpperCase();
        return stringBuilder.toString();
    }

    public static int[] countLength(String str){
        String[] words = str.split(" ");
        int[] results = new int[words.length];
        for (int i = 0; i < words.length; i++){
            results[i] = words[i].length();
        }
        return results;
    }

    // Count how many vowels in the given string
    public static String countVowls(String str){
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        for (int z = 0; z < str.length(); z++){
            if(str.charAt(z) == 'a' || str.charAt(z) == 'A'){
                countA++;
            } else if (str.charAt(z) == 'e' || str.charAt(z) == 'E'){
                countE++;
            } else if (str.charAt(z) == 'i' || str.charAt(z) == 'I'){
                countI++;
            } else if (str.charAt(z) == 'o' || str.charAt(z) == 'O'){
                countO++;
            } else if (str.charAt(z) == 'u' || str.charAt(z) == 'U'){
                countU++;
            }
        }

        return "A: " + countA + ", E: " + countE + ", I: " + countI + ", O: " + countO + ", U: " + countU;
    }

    // Count the words in a string
    public static int countWords(String str){
        String[] words = str.split(" ");
        return words.length;
    }

    // Count Uppercase and lowercase
    public static String countLetters(String str){
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for(int l = 0; l < str.length(); l++){
            if(Character.isUpperCase(str.charAt(l))){
                upperCaseCount++;
            } else if (Character.isLowerCase(str.charAt(l))){
                lowerCaseCount++;
            }
        }

        return "Uppercase: " + upperCaseCount + ", Lowercase: " + lowerCaseCount;
    }

    // Find Longest Word
    public static String LongestWord(String str){
        int[] lenWords = countLength(str);
        String[] words = str.split(" ");
        int compareNum = lenWords[0];
        String longestWord = words[0];

        for(int j = 1; j < lenWords.length; j++){
            if(lenWords[j] > compareNum){
                longestWord = words[j];
                compareNum = lenWords[j];
            }
        }

        return longestWord;
    }
}
