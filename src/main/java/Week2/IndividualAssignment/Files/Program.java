package Week2.IndividualAssignment.Files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        Console.println("  Welcome to the Data Detective Agency!  ");
        Console.println("__________________________________________");
        Console.println();
        Console.println("Current Cases:");
        Console.println("Case 1: Suspicious Numbers");
        Console.println("Analyze numbers data to identify anomalies.");
        Console.println();
        Console.println("Case 2: Concert Intercept");
        Console.println("Analyze intercepted messages between suspects to uncover hidden coordinates.");
        Console.println();
        Console.println("Case 3: Cryptic Codes");
        Console.println("Decode mysterious codes to reveal hidden messages.");
        Console.println();
        Console.print("Choose a case number 1-3 (or 4 to exit):");

        int num = Console.getInt();
        if(num == 1){
            case1();
        } else if (num == 2){
            case2();
        }
    }

    //solves Case #1
    public static void case1() {
        File readFile1 = new File("src/main/java/Week2/IndividualAssignment/Files/txtFiles/suspicious-numbers.txt");
        Scanner scanCaseFile = null;
        int susNumbers = 0;

        try {
            scanCaseFile = new Scanner(readFile1);

            System.out.println("Valid Numbers Found: ");
            while(scanCaseFile.hasNextDouble()){
                double oneDouble = scanCaseFile.nextDouble();
                if (oneDouble > 800 && oneDouble < 1600){
                    System.out.println(oneDouble);
                } else {
                    susNumbers = susNumbers + 1;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred." + e);
            System.exit(1);
        }
        System.out.println("Filtered out " + susNumbers + " suspicious numbers.");
    }

    //solves Case #2
    public static void case2() {

    }

    //solves Case #3
    public static void case3() {

    }

    //converts a line of text into an array of Strings
    private static String[] findWords(String text) {
        return text.split("(\b| |,|\\. )");
    }

    //determines whether a String contains only numeric digits
    private static boolean isNumeric(String text)
    {
        try {
            Double.parseDouble(text);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}