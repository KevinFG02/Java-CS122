package Week1.File;
import java.io.File;
import java.util.*;

public class FileManagement {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        /*
        int option = 1;
        Scanner scan = new Scanner(System.in);
        String name = "";
        int age = 0;

        while (option == 1){
            System.out.println("Print Name: ");
            name = scan.nextLine();
            System.out.println("Print Age ");
            age = scan.nextInt();
            System.out.println("Enter 2 to exit.");
            option = scan.nextInt();
        }
        */
        File txtFile = new File("src/main/java/Week1/File/Employee");
        Scanner scanFile = new Scanner(txtFile);

        if(txtFile.exists()) {
            for(int i = 1; i < 4; i++){
                scanFile.nextLine();
            }
            String empData = scanFile.nextLine();

        }
    }
}
