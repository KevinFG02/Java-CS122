package Week2.IndividualAssignment.Files;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class mainJavaFile {
    public static void main(String[] args) {
        System.out.println("  Welcome to the Data Detective Agency!  ");
        System.out.println("__________________________________________");
        System.out.println("Current Cases:");
        System.out.println("Case 1: Suspicious Numbers - Analyze numbers data to identify anomalies.");
        System.out.println("Case 2: Concert Intercept - Analyze intercepted messages between suspects to uncover hidden coordinates.");
        System.out.println("Case 3: Cryptic Codes - Decode mysterious codes to reveal hidden messages.");
        Scanner askCaseNumber = new Scanner(System.in);
        System.out.println("Choose a case number 1-3 (or 4 to exit):");
        int caseNumber = askCaseNumber.nextInt();

        if(caseNumber == 1){
            caseOne();
        }
    }

    public static void caseOne() {
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

    public static void caseTwo(){

    }
}
